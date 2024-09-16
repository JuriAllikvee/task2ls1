import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("трёхзначное число");
        int x = sc.nextInt();

        int ed = x % 10;

        int tens = (x / 10) % 10;

        int hundred = (x / 100) % 10;

        int sum = ed + tens + hundred;

        System.out.println("Кол единиц: " + ed);
        System.out.println("Кол десятков: " + tens);
        System.out.println("Кол сотен: " + hundred);
        System.out.println("Сумма цифр: " + sum);

    }
}