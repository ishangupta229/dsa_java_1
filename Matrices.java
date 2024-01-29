import java.util.*;

public class Matrices {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //creating
        int matrice [][] = new int[3][3];
        int row=3, col =3;

        //creating -2

        int mat[][]= { {1,2,3},
                       {4,5,6},
                       {7,8,9},
                       {10,11,12},
                       {13,14,15}
                    };
        

        //input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrice[i][j]= sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }
    }
}
