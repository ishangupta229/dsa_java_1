import java.util.*;
public class subarry {

    public static void sub(int arry[]) {
        int min= Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arry.length; i++) {
            for (int j = i; j < arry.length; j++) {
                int sum = 0;
                for (int z = i; z < j; z++) {
                    System.out.print(arry[z]);
                    sum += arry[z];
                }
                System.out.println();
                if(sum!=0){
                    if(sum>=max){
                        max = sum;
                    }
                    if(sum<=min){
                        min = sum;
                    }
                    
                    System.out.println("sum here is : "+ sum);
                }
                System.out.println();
            }
            //System.out.println();
        }
        System.out.println("max : " + max );
        System.out.println("min : " + min );
    }
    public static void main(String[] args) {
        int arry [] = {1,-2,6,-1,3};
        sub(arry);
    }    
}
