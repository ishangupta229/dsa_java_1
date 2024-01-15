import java.util.*;

public class LinearSearch {
    public static int LnrSrch(int arry[], int num) {
        for (int i = 0; i < arry.length; i++) {
            if(arry[i]== num){
                return i;
            }
        }
        return 0;
        
    }

    public static void main(String[] args) {
        int ary[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want ot find : ");
        int num = sc.nextInt();

        int result = LnrSrch(ary, num);
        if(result >= 1){
            System.out.println("The number is founded at index : " + result);
        }else{
            System.out.println("Error");
        }

    }
}
