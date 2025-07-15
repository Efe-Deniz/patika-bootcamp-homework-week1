package patika_1_basic_1_paractice;
import java.util.Scanner;

public class LeapYearCalculation {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yıl Giriniz: ");
        int year = scanner.nextInt();

        boolean leapYear;

        if(year % 4 == 0){
            if(year % 100 ==0){
                leapYear= (year % 400 == 0);
            }else {
                leapYear=true;
            }
        }else{
            leapYear=false;
        }

        if(leapYear){
            System.out.println(year + " bir artık yıldır !");
        }else{
            System.out.println(year + " bir artık yıl değildir!");
        }

        scanner.close();
    }
}
