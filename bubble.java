public class bubble {
    
    public static void bubble(int arry[]) {
        for (int turn = 0; turn < arry.length-1; turn++) { // last wale tak jane ki jarurat nahi hai
            int swap = 0;
            for (int i = 0; i < arry.length-turn-1; i++) {
                if(arry[i]>arry[i+1]){
                    int temp = arry[i+1];
                    arry[i+1] = arry[i];
                    arry[i]= temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
        }
        }
        //print
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int arry [] = { 76,4,2,345,87,8,32,76,9,1,65,54,8,5,7,76,9,34,45,64,2};
        //int arry[]= {1,2,3,4,5,6,7,8,9};
        bubble(arry);
    }
}
