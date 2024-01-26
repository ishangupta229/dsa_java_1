public class trapping_rainwater {

    public static int water_area(int arry[]) {
        int area =0;
        for (int i = 1; i < arry.length; i++) {
            int left=0,right=0,height=0;
            
            //checking left side
            for (int j = i-1; j>=0; j--) {
                if(left<=arry[j]){
                    left=arry[j];
                }else{
                    break;
                }
            }
            for (int j = i+1; j<arry.length; j++) {
                if(right<=arry[j]){
                    right=arry[j];
                }else{
                    break;
                }
            }
            height = right>=left ? left:right;
            int diff = height - arry[i];
            // if(diff<0){
            //     diff=0;
            // }

            diff = diff>0? diff:0;
            area += diff;
        }
        return area;
    }
    public static void main(String[] args) {
        int arry[]= {4,2,0,6,3,2,5};
        System.out.println("Area of water is : " +  water_area(arry)+ " units.");
    }
}
