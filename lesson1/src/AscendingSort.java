import java.util.Arrays;

public class AscendingSort {
    public static void main(String[] args) {
        sort();
    }

    public static void sort() {
        //Создаем массив случайных чисел
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");
        //Сортируем массив
        Arrays.sort(arr);
        //Выводим отсортированный массив на консоль.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
