import java.util.Arrays;

public class Eratosphen {
    public static void eratos(int n) { //Вход: натуральное число n
        boolean[] numbers = new boolean[n + 1];

        Arrays.fill(numbers, true); // Пусть A — булевый массив, индексируемый числами от 2 до n, изначально заполненный значениями true.
        numbers[0] = false;
        numbers[1] = false;

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i]) {
                for (int j = 2; i * j < numbers.length; j++) {
                    numbers[i * j] = false; // Выход: все простые числа от 2 до n.
                }
            }
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        eratos(100);
    }
}

