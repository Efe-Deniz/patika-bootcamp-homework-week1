package patika_1_basic_1_paractice;

import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Basamak Sayısı: ");
        int number = scanner.nextInt();

        for (int i = 0; i <number ; i++) {

            for(int star =0; star < (2*(number - i )-1); star++ ){
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
