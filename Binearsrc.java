import java.util.*;

public class Binearsrc {
    public static int BinSrc(int arry[], int key) {
        int start = 0;
        int end = arry.length -1;
        int mid = (start+end)/2;

        while (start<=end) {
            if(key == arry[mid]){
                return mid;
            }else if( key>arry[mid]){
                start = mid+1;
                mid = (start + end)/2;
            }else if( key<arry[mid]){
                end = mid -1;
                mid = (start + end)/2;
            }
        }
        
        
        return -1;
    }

    public static void main(String[] args) {
        int ary[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find : ");
        int num = sc.nextInt();

        int result = BinSrc(ary, num);
        if(result >= 0){
            System.out.println("The number is founded at index : " + result);
        }else{
            System.out.println("Error");
        }

    }
}
