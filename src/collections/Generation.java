package collections;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Generation {
    /**
     * Генерация простых чисел путём многократного перемножения входного набора заведомо простых.
     * На каждой итерации одно входное простое перемножается с другим, затем результат умножается на 2,
     * после чего к результату прибавляется единица:
     * probablyPrime=prime1*prime2*2+1
     * Каждое потенциально простое далее проверяется на псевдопростоту в функции addIfPrime.
     * Если псевдопростота исключена, то потенциально простое проверяется на простоту при помощи аналога
     * теста Ферма, являющегося детерминированным для любых чисел, не являющихся псевдопростыми по основанию 2.
     */
    public static void generatePrimes(List<Integer> primes, PrintWriter pw) {
        // Список простых чисел с остатком при деление по модулю 3 = 1.
        List<BigInteger> mod3_1 = new ArrayList<BigInteger>();
        // Список чисел признанных простыми функцией addIfPrime()
        List<BigInteger> l = new ArrayList<BigInteger>();
        // Экземпляры больших чисел со значением 3 и 2.
        BigInteger three = BigInteger.valueOf(3), two = BigInteger.valueOf(2);
        // Цикл обработки простых чисел, данных в виде входящего параметра в процедуру.
        // В цикле для каждого входного простого вычисляется его произведение со всеми остальными простыми.
        // Если результат перемножения не равен единице по модулю 3, то такие числа игнорируются из-за
        // порождения при последующих пермножениях чисел, кратных трём.
        for (int k = 0; k < primes.size() - 1; k++) {
            // Рассматриваемое простое число (а)
            BigInteger seed = BigInteger.valueOf(primes.get(k));
            // Удвоенное простое число (2а)
            BigInteger s2 = seed.shiftLeft(1);
            // Остаток при делении `a` на 3
            BigInteger r0 = seed.remainder(three);
            // Проверка на остаток = 1
            if (r0.intValue() == 1) mod3_1.add(seed);
            // Цикл по тем простым числам, с которыми данное число пока что не перемножалось
            for (int i = k + 1; i < primes.size(); i++) {
                BigInteger p = BigInteger.valueOf(primes.get(i)); // Перевод типа int в тип BigInteger
                BigInteger r = p.remainder(three); // Остаток от деления p на 3
                // Если остатки от деления очередного простого числа на три и ранее выбранного так же простого
                // равны друг другу, то такую пару игнорируем из-за обязательной делимости результата на 3
                if (r.intValue() == r0.intValue()) continue; // divisible by 3
                else addIfPrime(p, seed, s2, two, l); // Если делимости на 3 нет, то проверяем на простоту
            }
        }
        // Фиксируем ссылку на полученные выше результаты перемножений и проверок простоты в перменной ps
        // (ps - сокращение от primes)
        List<BigInteger> ps = l;
        // В этом цикле каждое ранее найденное простое перемножается с ранее отобранными простыми,
        // дающими по модулю 3 единицу. Результат перемножения проверяется на простоту функцией addIfPrime.
        //
        do {
            System.out.println("found " + l.size() + ", bits=" + l.get(0).bitLength());
            l = new ArrayList<BigInteger>();
            for (int k = 0; k < ps.size(); k++) {
                BigInteger seed = ps.get(k);
                BigInteger s2 = seed.shiftLeft(1);
                // Проходим по списку равных единице по модулю тройки чисел и перемножаем их на
                // ранее полученные простые результаты аналогичных перемножений
                for (int i = 0; i < mod3_1.size(); i++)
                    addIfPrime(mod3_1.get(i), seed, s2, two, l);
                // Здесь проверяем разрядность полученных простых чисел. Если разрядность превышает порог в
                // 700, 800, 900, то меняем максимально допустимое значение размера списка получаемых простых
                // с целью ограничения мощности генерации. Если генерацию не ограничивать, то количество промежуточных
                // простых, меньших чем требуемые нам числа криптографических порядков, будет очень большим.
                int n = 100000; // change following to adjust for required bit count
                if (l.size() > 0)
                    if (l.get(0).bitLength() < 700) n = 10;
                    else if (l.get(0).bitLength() < 800) n = 20;
                    else if (l.get(0).bitLength() < 900) n = 40;
                if (l.size() > n)
                    break; // Если количество полученных простых больше максимально допустимого, то выходим из данного цикла
            }
            ps = l; // Фиксируем ссылку на полученные выше результаты перемножений и проверок простоты в перменной ps
            // Записываем все полученные простые в поток, полученный на входе процедуры
            for (int i = 0; i < l.size(); i++)
                pw.println(l.get(i));
            pw.flush(); // дописываем буфер потока, что бы зафиксировать все полученные результаты
        }
        while (l.size() > 0);
        System.out.println("Done");
    }

    /**
     * Вычисляем новое простое, перемножая два известных простых, затем удваивая произведение и прибавляя единицу.
     * Полученое потенциально простое число проверяется на потенциальную псевдопростоту согласно критериям из статьи.
     * Если число не является псевдопростым, то далее проводится стандартный вероятностный тест простоты,
     * который в данном случае является детерминированным в следствии устранения возможности появления
     * псевдопростых чисел предыдущей фильтрацией.
     */
    private static void addIfPrime(BigInteger a, BigInteger b, BigInteger b2, BigInteger two, List<BigInteger> l) {
        // a2=2*a; fp=a*b*2; n=a*b*2+1;
        BigInteger a2 = a.shiftLeft(1), fp = b.multiply(a2), n = fp.add(BigInteger.ONE);
        BigInteger r = null;
        if (a2.compareTo(b) < 0) r = two.modPow(a2, n); // 2a<b
        else if (a.compareTo(b2) < 0) r = two.modPow(a, n); // a<2b
        if (r != null && r.compareTo(BigInteger.ONE) == 0) return;
        r = null;
        if (b2.compareTo(a) < 0) r = two.modPow(b2, n); // 2b<a
        else if (b.compareTo(a2) < 0) r = two.modPow(b, n); // b<2a
        if (r != null && r.compareTo(BigInteger.ONE) == 0) return;
        // Детерминированная проверка простоты (для случая, исключающего наличие псевдопростых числе)
        // при помощи вычисления остатка по формуле:
        // r=2^(fp/2) mod n
        r = two.modPow(fp.shiftRight(1), n);
        if (r.compareTo(BigInteger.ONE) != 0) return;
        l.add(n);
    }
}
