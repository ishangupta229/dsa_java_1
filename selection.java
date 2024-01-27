import java.util.*;
public class selection {

    public static void selection(int arry[]) {
        for(int turn=0; turn < arry.length; turn++){
            int smallest= Integer.MAX_VALUE;
            int temp;
            int position=turn;
            for (int i = turn; i < arry.length; i++) {
                if(arry[i]<smallest){
                    smallest=arry[i];
                    position = i;
                }
            }
            temp = arry[turn];
            arry[turn]=smallest;
            arry[position]= temp;
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]);
        }
    }
    public static void main(String[] args) {
        int arry[]= {5,4,1,2,3,5,9,7};
        selection(arry);
    }
}
