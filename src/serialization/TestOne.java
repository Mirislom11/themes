package serialization;

import java.io.*;
import java.nio.file.Path;

public class TestOne {
    public static void main(String[] args) {
        writePerson();
        System.out.println(readPerson());
    }
    public static void  writePerson () {
        Person person = new Person(12, "Mirislom");

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Person.txt"));
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();
            objectOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static Person readPerson () {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Person.txt"));
            Person person = (Person) objectInputStream.readObject();
            return person;
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
