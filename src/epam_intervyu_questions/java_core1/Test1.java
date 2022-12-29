package epam_intervyu_questions.java_core1;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        User mirislom = new User();
        Class cls = Class.forName("mirislom");
        User user = (User) cls.newInstance() ;
        user.setId(1);
        User u1 = new User();
        u1.setId(1);
        u1.setName("Islom");
        u1.setSurname("Sharibov");
        User u2 = new User();
        u2.setId(1);
        u2.setName("Islom");
        u2.setSurname("Sharibov");
        System.out.println(u1.hashCode()  + ", " + u2.hashCode());
    }
}
