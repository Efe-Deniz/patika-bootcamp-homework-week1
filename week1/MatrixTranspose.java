package patika_1_basic_1_paractice;

public class MatrixTranspose {

    public static void main(String[] args) {
        int[][] matris = {
                {1,2,3},
                {4,5,6}
        };

        int line = matris.length;
        int column = matris[0].length;

        int[][] transpoz = new int[column][line];

        for(int i=0; i< line; i++){
            for (int j = 0; j < column; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris : ");
        for (int i = 0; i <line ; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matris[i][j]);
            }
            System.out.println();
        }

        System.out.println("Transpoze: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
