package patika_1_basic_1_paractice;
import java.util.Scanner;

public class BodyMassIndexExample {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        double size = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();


        //BMI formülü kilo/(boy*boy)

        double bmi = kilo/(size*size);

        if(bmi < 18.5){
            System.out.println("Vücut Kitle Endeksi: " + bmi + " " +"Durum: Zayıf");
        }else if(bmi<24.9){
            System.out.println("Vücut Kitle Endeksi: " + bmi + " " +"Durum: Normal");
        } else if (bmi<29.9) {
            System.out.println("Vücut Kitle Endeksi: " + bmi + " " +"Durum: Fazla Kilolu");
        }else{
            System.out.println("Vücut Kitle Endeksi: " + bmi + " " +"Durum: Obez");
        }

        scanner.close();
    }
}
