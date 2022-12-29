package JavaLang;

public class Charac {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println(Character.isDefined(c));
        char s = 's';
        System.out.println(Character.isLowerCase(s));
        System.out.println(Character.isSpaceChar('f'));
        System.out.println(Character.isTitleCase('d'));
    }
}
