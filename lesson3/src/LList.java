

/*
root
|
+———+ +——+
| data || data|
| next|—>| next| —> null
+———+ +——+
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
        Node tmpItem = new Node(item); // Сохдаем новую ячейку списка
        Node lastItem = findLast(); // Присваиваем последний элемент или null в переменную

        if (lastItem != null) {
            lastItem.next = tmpItem; // Здесь укащзываем на новый созданный элемент (next)
        } else {
            root = tmpItem; //
        }
    }

    public Object get(int id) {  // Получить элемент # ID
        // TODO
        if (id < 0 || id > this.size()){  // Проверяем на на меньше нуля и больше size
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


    public int size() { // Размер списка
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

            while (current.next != null) { // Если дошли до null то current послдений элемент
                current = current.next;
            }

            return current; // возвращаем последний узел списка
        }
    }
}

