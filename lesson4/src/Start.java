import java.util.LinkedList;

class Demo1 {
    public int a;

    public Demo1(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Demo1 {" + " a = " + a + '}';
    }
}

public class Start {
    public static void main(String[] args) {

        LinkedList<Demo1> list1 = new LinkedList<>();

        Demo1 a = null;
        Demo1 b = null;

        for (int i = 1; i <= 10; i++) {
            a = new Demo1(i);
            list1.add(a);
        }

        list1.remove(); // Удаляю первый по индексу
        System.out.println(list1);

        list1.remove(5); // Удаляю индекс
        System.out.println(list1);

        list1.remove(a); // Удаляю объект
        System.out.println(list1);

        for (int i = 1; i <= 5; i++) {
            b = new Demo1(i);
            list1.add(b);
            list1.add(b);
        }

        System.out.println(list1);
    }
}

