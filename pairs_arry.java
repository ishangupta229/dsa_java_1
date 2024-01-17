public class pairs_arry {
    public static void pairs(int arry[]) {
        for( int i =0; i<arry.length-1; i++){
            int b= arry[i];
            for (int j = i+1; j < arry.length; j++) {
                int a = arry[j];
                System.out.print(("(" + arry[i]+ "&" + arry[j] + ") "));
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int ary[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        pairs(ary);
    }
}
