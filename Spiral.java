import java.util.*;;
public class Spiral {
    public static void spiral(int mat[][]) {
        int start_col =  0;
        int start_row =  0;
        int end_col =  mat.length-1;//3
        int end_row =  mat[0].length-1;//4

        // System.out.println(end_col);
        // System.out.println(end_row);
        
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0+i; j < mat[0].length-i; j++) {
                System.out.print(mat[start_row][j] + " ");
                
            }
            for (int j = i+1; j < mat.length-i; j++) { // 1 4
                System.out.print(mat[j][end_col] + " ");
            }


            for (int j = mat[0].length-i-2; j >i+0 ; j--) {
                System.out.print(mat[end_row][j] + " ");
                
            }
            for (int j = mat[0].length-i-1; j>0+i; j--) {
                System.out.print(mat[j][start_col] + " ");
            }
            start_col++;
            start_row++;
            end_col--;
            end_row--;

        }
        
    }


    public static void main(String[] args) {
        int mat[][] = new int[3][3];

        int val =1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j]=val;
                val++;
            }
        }
        spiral(mat);
    }

}
