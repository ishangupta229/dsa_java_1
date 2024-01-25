public class subarry {

    public static void sub(int arry[]) {
        for (int i = 0; i < arry.length; i++) {
            for (int j = i; j < arry.length; j++) {
                for (int z = i; z < j; z++) {
                    System.out.print(arry[z]);
                }
                System.out.println();
            }
            //System.out.println();
        }
    }
    public static void main(String[] args) {
        int arry [] = {1,2,3,4,5,6,7};
        sub(arry);
    }    
}
