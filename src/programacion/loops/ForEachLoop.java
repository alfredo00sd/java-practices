package programacion.loops;

import com.javalearn.herencia.Person;

public class ForEachLoop {

    public static void main(String[] args) {

        Person[] people = {
                new Person("Alfredo", (byte) 20, 'M', "Asia"),
                new Person("John", (byte) 35, 'M', "America"),
                new Person("Wacanagarix", (byte) 26, 'F', "Africa"),
                new Person("Leopoldo", (byte) 89, 'M', "Europe")
        };
        //for each has no control of a counter to catch specific data at execution time. As for loop has.
        //Person is the class ... person holds one object of the iteration, people is the array it self.
        for (Person person : people) {
            String name = person.getName();
            // person holds the whole person object data...
            System.out.println(name);
        }

    }
}
