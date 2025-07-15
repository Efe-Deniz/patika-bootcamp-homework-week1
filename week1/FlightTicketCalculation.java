package patika_1_basic_1_paractice;
import java.util.Scanner;

public class FlightTicketCalculation {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi kilometre cinsinden giriniz: ");
        int distance = scanner.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.println("Yolculuk Tipini Giriniz (1=> Tek Yön, 2 => Gidiş Dönüş): ");
        int type = scanner.nextInt();

        if (distance<=0 || age<=0 || (type != 1 && type != 2)){
            System.out.println("Hatalı Veri Girdiniz!!!");
        }else{
            double unitPrice = 0.10;
            double regularPrice = distance*unitPrice;
            double discountedPrice = regularPrice;

            if (age<12){
                discountedPrice -= regularPrice*0.50;
            } else if (age<=24) {
                discountedPrice -= regularPrice*0.10;
            } else if (age>=65) {
                discountedPrice -=regularPrice*0.30;
            }

            if(type == 2){
                discountedPrice  -= discountedPrice*0.20;
                discountedPrice*=2;
            }
            System.out.println("Toplam Tutar = " + discountedPrice + "TL");

        }
        scanner.close();
    }
}
