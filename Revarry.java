import java.util.*;
public class Revarry {

    public static void rev(int arry[]) {
        int f=0, e= arry.length-1;
        while (e>=f) {
            int i = arry[e];
            arry[e] =arry[f];
            arry[f]= i;
            f++;
            e--;
        }
    }

    public static void main(String[] args) {
        int arry[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        rev(arry);
        System.out.println(Arrays.toString(arry));
    }
}
