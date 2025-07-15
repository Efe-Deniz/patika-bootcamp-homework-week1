package patika_1_basic_1_paractice;

import java.util.Scanner;

public class GroceryCashRegisterProgramExample {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        System.out.println("Armut Kaç Kilo: ");
        double kiloArmut=input.nextDouble();

        System.out.println("Elma Kaç Kilo: ");
        double kiloElma=input.nextDouble();

        System.out.println("Domates Kaç Kilo: ");
        double kiloDomates=input.nextDouble();

        System.out.println("Muz Kaç Kilo: ");
        double kiloMuz=input.nextDouble();

        System.out.println("Patlican Kaç Kilo: ");
        double kiloPatlican = input.nextDouble();

        double tutar = (kiloArmut*armut)+(kiloElma*elma)+(kiloDomates*domates)+(kiloMuz*muz)+(kiloPatlican*patlican);

        System.out.println("Toplam Tutar: "+ tutar);

        input.close();

    }
}
