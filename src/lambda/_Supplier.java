package lambda;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnection());
        System.out.println(getDBConnectionFunctional.get());
    }

    public static String getDBConnection(){
        return "jdbc://localhost:5432/users";
    }

    public static Supplier<String> getDBConnectionFunctional = () -> "jdbc://localhost:5432/customers";
}
