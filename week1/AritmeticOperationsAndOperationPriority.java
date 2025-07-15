package patika_1_basic_1_paractice;
import java.util.Scanner;

public class AritmeticOperationsAndOperationPriority {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı 1: ");
        int number1= input.nextInt();
        System.out.println("Sayı2: ");
        int number2 = input.nextInt();
        System.out.println("Sayı3: ");
        int number3 = input.nextInt();

        int result = number1+number2*number3-number2;
        System.out.println("İşlemin sonucu= " + result);
    }
}
