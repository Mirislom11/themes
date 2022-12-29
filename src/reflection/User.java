package reflection;

import java.io.Serializable;

public class User  extends Person implements Serializable, Comparable<User> {
    private String name;

    public User(int id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
