package abstraction_interface;

public class InterfaceExampleImpl implements InterfaceExample{
    @Override
    public void print() {
        System.out.println("interface example from print");
    }

    @Override
    public String get() {
        return "gets from interfaces example";
    }
    public static String findAll () {
        return "find all";
    }
}
