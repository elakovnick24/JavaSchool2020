import java.util.HashMap;
import java.util.Map;

public class MapExploring {
    public static void main(String[] args) {
        Map<String,Person> map = new HashMap<>();
        Person person1 = new Person("Vasya", "Vasin");
        Person person2 = new Person("Ivan", "Ivanov");
        Person person3 = new Person("Ivan", "Ivanov2");

        map.put("Vasya" , person1);
        map.put("Ivan" , person2);

        Person old = map.put("Ivan2", person3);

        System.out.println(map);
        System.out.println("odl " + old);

        for (Map.Entry<String, Person> elemnt : map.entrySet()) { // Обход
            System.out.println(elemnt);
        }

        System.out.println(map.get("Vasya"));

    }
}
