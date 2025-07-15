package patika_1_basic_1_paractice;
import java.util.Scanner;



public class CircleCalculatorExcample {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yarı çapını giriniz: ");
        double radius = scanner.nextDouble();

        double PI = 3.14159;

        double area = PI * radius *radius;
        double circunference = 2*PI*radius;

        double area2 = Math.PI*radius*radius;
        double circuference2 = 2*Math.PI*radius;

        System.out.println("Dairenin alanları: " +area + "-"+area2);
        System.out.println("Dairenin çevresi: " +circunference + "-" + circuference2);

        scanner.close();
    }
}
