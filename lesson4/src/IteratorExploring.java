import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExploring {
    public static void main(String[] args) {
        Set <Person> set = new HashSet<>();
        Person person1 = new Person("Vasya");
        Person person2 = new Person("Ivan");

        set.add(person1);
        set.add(person2);

        Iterator <Person> iterator = set.iterator();
        while(iterator.hasNext()){
            Person current = iterator.next();
            System.out.println(current);
        }

        System.out.println(" ");

        for (Person current: set) {
            System.out.println(current);
        }
    }
}

