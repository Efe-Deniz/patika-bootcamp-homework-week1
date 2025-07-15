package patika_1_basic_1_paractice;
import java.util.Scanner;

public class ChineseZodiacCalculation {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz: ");
        int yearOfBirth=input.nextInt();
        double result = yearOfBirth % 12;
        System.out.println(result);

        if(result == 0){
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        } else if (result == 1) {
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        }else if (result == 2) {
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        }else if (result == 3) {
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        }else if (result == 4) {
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        }else if (result == 5) {
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        }else if (result == 6) {
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        }else if (result == 7) {
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        }else if (result == 8) {
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        }else if (result == 9) {
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        }else if (result == 10) {
            System.out.println("Çin Zodyağı Burcunuz: At");
        }else if (result == 11) {
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }

        input.close();
    }
}
