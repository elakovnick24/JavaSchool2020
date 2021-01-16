


import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

class Demo1 extends TreeSet<Demo1> implements Comparable {
    public int a;

    public Demo1(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Demo1 {" + " a = " + a + '}';
    }


    @Override
    public int compareTo(Object o) {
        if (((Demo1) o).a < this.a) {    // Положительное, если вызывающий объект больше объекта, переданного в качестве параметра;
            return 1;
        } else if ((((Demo1) o).a > this.a)) { // Отрицательное, если вызывающий объект меньше объекта, переданного в качестве параметра;
            return -1;
        } else {
            return 0; //   нуль, если объекты равны.
        }
    }
}

public class Start {
    public static void main(String[] args) {

        Demo1 x = new Demo1(5);
        Demo1 y = new Demo1(6);
        x.compareTo(y);

        // Создаю список
        LinkedList<Demo1> list1 = new LinkedList<>();

        Demo1 a = null;
        Demo1 b = null;

        // Добавляю 10 элементов в списке
        for (int i = 1; i <= 10; i++) {
            a = new Demo1(i);
            list1.add(a);
        }

        list1.remove(); // Удаляю первый по индексу
        System.out.println("Удаление первого элемента по индексу");
        System.out.println(list1);

        System.out.println("Удаление индекса");
        list1.remove(5); // Удаляю индекс

        System.out.println(list1);

        System.out.println("Удаление объекта");
        list1.remove(a); // Удаляю объект
        System.out.println(list1);

        for (int i = 1; i <= 5; i++) { // Добавление дублей
            b = new Demo1(i);
            list1.add(b);
            list1.add(b);
        }

        System.out.println("Добавили дубли в список");
        System.out.println(list1); // Вывод

        TreeSet<Demo1> set = new TreeSet<>(list1); // Создаем Tree Set из листа
        System.out.println("TreeSet из листа");
        System.out.println(set); // Выводим

        System.out.println("Обход дерева с помощью foreach");
        function(set);


        Demo1 demo1 = new Demo1(4);
        System.out.println("Выводим элементы которые больше значения new Demo1(4)");
        func2(set.iterator(), demo1);

        System.out.println("До удаления");
        System.out.println(set);
        System.out.println("Удалили 3-й элемент");
        func3(set.iterator());
        System.out.println(set);

        // Из существующей коллекции объектов создать ассоциативную карту, где ключ - объект, а значение - коллекция
        TreeMap <Demo1, TreeSet<Demo1>> map = new TreeMap();
        for (Demo1 i : set){
            map.put(i,set);
        }
        System.out.println("Печатаем MAP");
        System.out.println(map);

        // Из существующей карты создать другую, в которой ключ остается прежним, а значение - вычисленное значение чего-либо из коллекции для ключа (по нескольким вариантам значений)
        // Получаем по ключу кол-во элементов в коллекции, значение которых больше переданного "какого-то значения"
        TreeMap <TreeSet<Demo1>, Integer> map2 = new TreeMap<>();
        for (Demo1 i : set) {
           map2.put(i,funcMap(set.iterator(),i));
        }
        System.out.println("Получаем по ключу кол-во элементов в коллекции, значение которых больше переданного значения");
        System.out.println(map2);

    }

    // Обход дерева с помощью forEach
    static void function (TreeSet<Demo1> set) {
        for (Demo1 i : set)
        {
            System.out.println(i);
        }

    }

    // Использую условие, например, "больше какого-то значения" Demo1 demo1 = new Demo1(4);
    static void func2 (Iterator<Demo1> a, Demo1 b){
        for (Iterator<Demo1> it = a; it.hasNext(); ) {
            Demo1 с = it.next();
            int result = b.compareTo(с);
            if (result < 0 ) {
                System.out.println(с);
            }
        }
    }


    //Удалить третий элемент из множества.
    static void func3 (Iterator ab) {
        int i = 1;
        Iterator it = ab;
        while(it.hasNext()) {
            if (i == 3) {
                it.next();
                it.remove();
                break;
            }
            it.next();
            i++;
        }
    }

    // Функция для вычисления значения чего - либо из коллекции для ключа
    // Cчитаю кол-во элементов в коллекции,которые больше переданного "какого-то значения"
    static int funcMap (Iterator<Demo1> a, Demo1 b){
        int result;
        int counter = 0;
        for (Iterator<Demo1> it = a; it.hasNext(); ) {
            Demo1 c = it.next();
            result = b.compareTo(c);
            if (result < 0 ){
                counter++;
            }
        }
        return counter;
    }

}


