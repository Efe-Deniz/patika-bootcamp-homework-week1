package patika_1_basic_1_paractice;

import java.util.Scanner;

public class CastingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz: ");
        int num1 = scanner.nextInt();

        System.out.println("Bir ondalık sayı giriniz: ");
        double num2 = scanner.nextDouble();

        // Converting integer to decimal(auto-widenning)
        double integerToDoub = (double) num1;

        //Converting a decimal number to an integer(narrowing-casting)

        int doubleToInteger = (int) num2;

        System.out.println("Tam Sayıdan Double Sayıya Dönüştürüldü: " + integerToDoub + " tam sayı değer: " + num1);
        System.out.println("Ondalık Sayıdan Tam sayıya Dönüştürüldü: " + doubleToInteger + " ondalık sayı değeri: " + num2);

        scanner.close();
    }
}
