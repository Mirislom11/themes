package genericsTraining.game;


import abstraction_interface.InterfaceExample;

import javax.xml.transform.sax.SAXResult;

public abstract class Participant {
    private String name;
    private Integer age;

    public Participant(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
