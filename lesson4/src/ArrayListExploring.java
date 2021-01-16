import java.util.ArrayList;

public class ArrayListExploring {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(4);
        list.add("lemon");
        list.add("apple");
        list.add("applepro");
        list.add("apple12");
        list.add("apple12max");

        System.out.println(list);

        list.add(3, "lemon");

        System.out.println(list);

        String result = list.set(4, "lemon6");
        System.out.println(list);
        System.out.println("result " + result);
    }
}
