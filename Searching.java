import java.util.*;

public class Searching {
    public static void searching(int arry[][],int key) {
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[0].length; j++) {
                if (arry[i][j]==key) { 
                    System.out.println("Found at index : " + i+ " "+ j+ " " );
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int mat[][]= new int[3][3];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j]= sc.nextInt();
            } 
        }

        searching(mat,3);
    }
}
