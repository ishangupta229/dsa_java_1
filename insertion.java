public class insertion{
    public static void insertion(int arry[]) {
        for (int i = 1; i < arry.length; i++) {
            int curr = arry[i];
            int prev = i-1;
            while(prev>=0 && curr<arry[prev]){
                arry[prev+1]=arry[prev];
                prev--;
            }
            arry[prev+1]=curr;
        }        
    }
    public static void print(int arry[]) {
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arry[]={6,4,9,7,5,1,3,2,8};
        // int arry[]={8,2,3,4};
        insertion(arry);
        print(arry);
    }
}
