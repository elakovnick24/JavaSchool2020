import java.util.HashSet;
import java.util.Set;

public class SetExploring {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        Person person1 = new Person("Vasya");
        Person person2 = new Person("Ivan");
        set.add(person1);
        set.add(person2);
        set.add(person2);
        set.add(person2);
        set.add(person2);

        Person person3 = new Person("Ivan");
        set.add(person3);

        set.remove(person3);

        System.out.println(set);
    }
}
