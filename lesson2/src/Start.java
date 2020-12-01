import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Command[] arr = {new Date(), new Time(), new Exit()}; // Инициализация массива типа Command объектами - наследниками
        Scanner scanner = new Scanner(System.in); // Класс для считывания строки. Поток ввода
        String result = null;

        while (true) { // Используем цикл для ввода нескольких значений в консоль
            String input = scanner.nextLine().toLowerCase(); // Считываем строку ввода и приводим ее к нижнему регистру (для сранения)

            if (input.equals("exit")) { // Если ввели exit, то выходим из программы
                arr[2].execute();
            } else if (input.equals("date")) { // Если ввели date
                result = arr[0].execute();    // Присваиваем, то что возвращает метод в result
            } else if (input.equals("time")) {
                result = arr[1].execute();
            }
            System.out.println(result); // Выводим в консоль result
        }
    }
}
