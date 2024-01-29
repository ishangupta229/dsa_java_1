import java.util.*;
public class diagonalsum {
    public static void diagonalsum(int mat[][]) {
        int d1 = mat.length-1;
        int sum =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(i+j==d1){
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);
        sum=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(i==j){
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);


    }   
    public static void main(String[] args) {
        int mat[][] = { {1,2,3},
                        {4,5,6},
                        {7,8,9}};

        diagonalsum(mat);

    }
}
