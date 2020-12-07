## Java School 2020

### Lesson 1

1. Напишите программу, которая выводит строку «Hello World!»  в консоль.
2. В переменных a и b хранятся два натуральных числа. Напишите программу, выводящую на экран результат деления a на b с остатком.
 `Пример работы программы (a = 21, b = 8): « 21 / 8 = 2 и 5 в остатке`
3. Напишите программу, которая вычислит простые числа в пределах от 2 до 100.
4. Выведите на экран первые n членов последовательности Фибоначчи, где n запрашивается у пользователя посредством консоли (2 < n < 100).
5. Напишите программу, которая объявляет массив целых чисел (10-20 чисел) и реализует алгоритм сортировки заданного массива (на ваш выбор).

## Lesson2

Реализовать программу консольную оболочку Shell
1. Программа предоставляет набор команд. Команды вводятся с консоли. time, date, exit.
2. Каждая команда реализуется классом имплементирующим интерфейс Command.
3. Интерфейс должен описывать методы для получения имени и исполнения команды.

4) Для чтения с консоли пользуемся классом Scanner:
   `Scanner in = new Scanner(System.in);`
   nextLine(): считывает всю введенную строку


5) Для работы с датой/временем исследуем класс LocalDateTime:
   https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html

6) Интерфейс Command может определять вызов двух методов:

   getName() – возвращает имя команды.

   execute()  - выполнение команды.

На старте в программе инициализируется массив с набором команд, которые может исполнять программа Shell.

## Lesson3
Дописать реализацию метода get (получение объекта), разобраться с приведением типа к/от Object.

Кусок кода с лекции:

```
package ru.sbrf.demo;

/*
  root
    |
    +-------+      +-----+     
    | data  |      | data|     
    | next  |--->  | next| --> null
    +-------+      +-----+     
 */

class Node {
    public Node(Object data) {
        this.data = data;
    }
    Object data;
    Node next;
}

public class LList {
    private Node root;

    public void add(Object item) {
        Node tmpItem = new Node(item);
        Node lastItem = findLast();

        if (lastItem != null) {
            lastItem.next = tmpItem;
        } else {
            root = tmpItem;
        }
    }

    public Object get(int id) {
        // TODO
        return null;
    }

    public int size() {
        int size = 0;

        if (root == null)
            return 0;
        else {
            size = 1;

            Node current = root;
            while (current.next != null) {
                size++;
                current = current.next;
            }
        }

        return size;
    }


    Node findLast() {
        if (root == null)
            return null;
        else {
            Node current = root;

            while (current.next != null) {
                current = current.next;
            }

            return current;
        }
    }
}
```