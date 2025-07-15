package patika_1_basic_1_paractice;

import java.util.Scanner;

public class FindingThePerfectNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isExit = false;

        while(!isExit){
            System.out.println("Devam etmek için (e) çıkmak için (h) yazınız: ");
            String input=scanner.nextLine();

            if(input.equals("e")){
                System.out.println("Bir sayı giriniz: ");
                int number = scanner.nextInt();
                scanner.nextLine();
                int total =0;

                for (int i = 1; i <number ; i++) {
                    if(number % i==0){
                        total+=i;
                    }
                }

                if(total==number && number !=0){
                    System.out.println(number + " mükemmel sayıdır.");
                }else{
                    System.out.println(number + " mükemmel sayı değildir!!!");
                }
            }else if (input.equals("h")){
                System.out.println("Programdan çıkış yapılıyor...");
                isExit=true;
            }else{
                System.out.println("Geçersiz giriş yaptınız sadece 'e' veya 'h' giriniz");
            }
        }
        scanner.close();
    }
}
