package abstraction_interface;

public interface InterfaceExample {
     void print();
     default String get() {
        return "Hello world from default method";
    }

    static String gets(){
         return "Hello world from static method";
    }
}
