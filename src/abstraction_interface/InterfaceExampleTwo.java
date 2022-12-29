package abstraction_interface;

public interface InterfaceExampleTwo extends InterfaceExample{
    @Override
    void print();

    @Override
    default String get() {
        return InterfaceExample.super.get();
    }
}
