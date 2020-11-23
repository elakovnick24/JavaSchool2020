import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {
        // Использую Big Integer тк число 99 не влезает
        BigInteger one = new BigInteger("1"); // Первый и второй член последовательности равен единице;
        BigInteger two = new BigInteger("1"); // Первый и второй член последовательности равен единице;
        BigInteger three;

        System.out.println("Введите число n - кол-во членов последовательности Фибоначчи");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(one + " " + two + " "); // Выводи первые числа последовательности

        for (int i = 3; i <= n; i++) {
            three = one.add(two); // Сумма предшествующих двух чисел
            System.out.print(three + " ");
            one = two;
            two = three;
        }
    }
}

