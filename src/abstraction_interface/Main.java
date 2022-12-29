package abstraction_interface;

public class Main {
    public static void main(String[] args) {
        InterfaceExampleImpl interfaceExample = new InterfaceExampleImpl();
        interfaceExample.print();
        System.out.println(interfaceExample.get());
        System.out.println(InterfaceExample.gets());
        User userOne = new User();
        userOne.setName("Mirislom");
        userOne.setSurname("Zoirov");

        User userTwo = new User();
        userTwo.setName("Mirislom");
        userTwo.setSurname("Zoirov");
        System.out.println(userOne.hashCode() == userTwo.hashCode());
    }
}
