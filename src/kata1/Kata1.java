package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Adrián", new Date(96,6,14));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
