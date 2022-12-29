package genericsTraining.game;

public class ParamethirizedMethod {
    public static void main(String[] args) {
        TestGenerics testGenerics = new TestGenerics();
        System.out.println((char[]) testGenerics.sets("dsds"));
    }
}


class TestGenerics {

    public <V> V sets (String s) {
        return (V) s;
    }
}