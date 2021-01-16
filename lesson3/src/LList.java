

/*
root
|
+———+ +——+
   0        1
| data || data|
| next|—>| next| —> null
+———+ +——+
   0
| data |
| next| —> null

*
  root
    |
      +———+              +——+              +——+
    | data {10} |    | data {15} |     | data {25} |
    | next      |—>  | next      |  —> | next      |  —> null
    +

      +———+                       +——+
    | data {10} |         | data {25} |
    | next        |  —> | next      |  —> null
    +

Идет от него же , дописать реализацию метода get (получение объекта), разобраться с приведением типа к/от Object.
*/


class Node {

    public Node(Object data) {
        this.data = data;
    }

    Object data; // Объект в котором мы храним данные которые связаны с текущим узлом
    Node next; // Объект в котором будут лежать следующие данные
}

public class LList {

    private Node root; // Начало списка

    public void add(Object item) {   //
        Node tmpItem = new Node(item); // Создаем новую ячейку списка
        Node lastItem = findLast(); // Присваиваем последний элемент или null в переменную

        if (lastItem != null) {
            lastItem.next = tmpItem; // Здесь указываем на новый созданный элемент (next)
        } else {
            root = tmpItem; //
        }
    }

    public Object get(int id) {  // Получить элемент # ID
        // TODO
        if (id < 0 || id > this.size() - 1) {  // Проверяем на на меньше нуля и больше size.
            throw new IndexOutOfBoundsException("NO!");
        }
        if (root == null) { // Проверяем на null
            return null;
        }

        Node current = root;

        for (int i = 0; i < id; i++) {
            current = current.next;
        }
        return current.data; // Возвращаем ID
    }


    public int size() { // Размер списка -- кол-во элементов
        int size = 0;

        if (root == null)
            return 0; // То список пустой
        else {
            size = 1; // размер как минимум равен 1

            Node current = root;
            while (current.next != null) { // Циклом проходим по элементам списка по порядку
                size++;
                current = current.next;
            }
        }

        return size; // Возвращаем размер
    }


    Node findLast() {
        if (root == null)
            return null;  // значит список null
        else {
            Node current = root;

            while (current.next != null) { // Если дошли до null то current последний элемент
                current = current.next;
            }

            return current; // возвращаем последний узел списка
        }
    }

    public void remove(int index) {
        if (index < 0 || index > this.size() - 1) {  // Проверяем на меньше нуля и больше size.
            throw new IndexOutOfBoundsException("NO!");
        }
        if (root == null) { // Проверяем на null
            return;
        }
        Node current = root;

        if (index == 0) { // Если нулевой индекс
            remove();
        }

        for (int i = 0; i <= index; i++) {
            if (i == index - 1) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
    }

    public void remove() {
        if (root == null) { // Проверяем на null
            return;
        }
        root = root.next;
    }

    public void removeLast() {
        if (root == null)
            return;
        else {
            Node current = root;
            while (current.next != null) {
                if (current.next.next == null){
                    current.next = null;
                    break;
                }
                current = current.next;
            }
        }
    }
}



