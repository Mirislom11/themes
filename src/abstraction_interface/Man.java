package abstraction_interface;

import java.util.Objects;

public class Man extends User{
    private String hand;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Man man = (Man) o;
        return hand.equals(man.hand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hand);
    }
    public void main () {
        ;
    }
}
