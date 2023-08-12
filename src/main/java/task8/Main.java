package task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);10
        System.out.println("Введіть перше число:");
        int a = scanner.nextInt();
        System.out.println("Введіть друге число:");
        int b = scanner.nextInt();

        Operation add = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation div = (x, y) -> (double)x / y;
        Operation multiple = (x, y) -> x * y;

        System.out.println(a + " + " + b + " = " + add.calculate(a, b));
        System.out.println(a + " - " + b + " = " + sub.calculate(a, b));
        System.out.println(a + " * " + b + " = " + multiple.calculate(a, b));
        System.out.println(a + " / " + b + " = " + div.calculate(a, b));

    }
}