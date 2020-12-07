public class Demo {
    public static void main(String[] args) {

        //Заполняю список стрингами...
        LList list1 = new LList();// Создаю новый объект

        // Добавляю элементы в список
        list1.add("Банк 1");
        list1.add("Банк 2");
        list1.add("Банк 3");
        list1.add("Банк 4");
        list1.add("Банк 5");
        list1.add("Банк 6");
        list1.add("Банк 7");
        list1.add("Банк 8");
        list1.add("Банк 9");
        list1.add("Банк 10");

        // Вывожу полученный элемент на экран
        System.out.println(list1.get(10));

        // Заполняю список интами
        LList list2 = new LList(); // Создаю новый объект

        // Добавляю элементы в список
        list2.add(100);
        list2.add(99);
        list2.add(101);
        list2.add(1000);
        list2.add(1001);
        list2.add(999);

        // Вывожу полученный элемент на экран
        System.out.println(list2.get(0));
    }
}

       /* LList list = new LList();
        String s = "А";
        list.add(s);
        list.get(1);
        Object list2 = s;
        String s2 = (String) list2;*/