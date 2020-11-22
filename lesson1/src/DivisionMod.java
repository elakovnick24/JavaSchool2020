import java.util.Scanner;

public class DivisionMod {
    public static void main(String[] args){
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое: ");
        a = scanner.nextInt();
        System.out.println("Введите делитель: ");
        b = scanner.nextInt();
        scanner.close();

        int integerPart = a/b;
        int modul = a%b;

        System.out.println("a = " + a + " ," + "b = " + b + ":");
        System.out.println(a + "/" + b + " = " + integerPart + " и "+modul+" в остатке");
    }
}

