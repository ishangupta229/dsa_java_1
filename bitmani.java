public class bitmani {

    public static void oddeve(int num){
        int bitmask = 1;
        if((num & bitmask) == 1){
            System.out.println("Odd number");
        } else{
            System.out.println("Even number");
        }
    }

    public static int Getithbit(int num, int i) {
        int bit = 1<<i;
        if((num & bit)==0){
            return 0;
        } else{
            return 1;
        }
    }


    public static int setithbit(int num, int i) {
        int bitmask = 1<<i;
        return(num|bitmask); 
    }

    public static int clearithbit(int num, int i) {
        int bitmask = ~(1<<i);
        return (num & bitmask);
    }

    public static int updateithbit(int num,int i, int k) {
        if(k ==0){
            return clearithbit(num, i);
        } else{
            return setithbit(num, i);
        }
    }

    public static int clearrange(int num,int end, int start) {
        int a = ((~0)<<(start+1));
        int b = (1<<end)-1;
        int bitmask = a|b;  
        return (num&bitmask);
    }

    public static void checkpow2(int num) {
        int i = num-1;
        if((num&i)==0){
            System.out.println("Yes, it is a power of 2");
        } else{
            System.out.println("Nah");
        }
    }

    public static int countsetbits(int num) {
        int count =0;
        for(int i=0; i<=Math.sqrt(num)+1;i++){
            int bitmask = 1<<i;
            if((num&bitmask)>=1){
                count++;
            }
            // System.out.println(count);
        }
        return count;
    }

    public static int fastexpo(int num, int pow) {
        int a =num;
        int ans=1;
        // for (int i = 0; i <= Math.sqrt(pow)+1; i++) {
        //     int bitmask = 1<<i;
        //     int b = pow
        // }
        
        while(pow>0){
            int b = pow&1;
            if(b==1){
                ans=ans*a;
            }
            a *=a;
            pow=pow>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 6; //110
        oddeve(num);
        System.out.println(Getithbit(num,0));//
        System.out.println(setithbit(num,0));//
        System.out.println(clearithbit(num,1));//
        System.out.println(updateithbit(num,0,1));//
        System.out.println(clearrange(num,1,2));//0
        checkpow2(num);
        System.out.println(countsetbits(16));//
        System.out.println(fastexpo(2,10));//
    }
}
