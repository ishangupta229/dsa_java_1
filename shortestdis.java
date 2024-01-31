import java.util.*;
public class shortestdis {
    public static double shortestdis(String str) {
        // String west= "W";
        // String east= "E";
        // String north= "N";
        // String south= "S";
        int horitontal = 0;
        int vertical= 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='W' || str.charAt(i)=='w' ){
                horitontal--;
            }
            if(str.charAt(i)=='E'|| str.charAt(i)=='e'  ){
                horitontal++;
            }
            if(str.charAt(i)=='N'|| str.charAt(i)=='n'  ){
                vertical++;
            }
            if(str.charAt(i)=='S' || str.charAt(i)=='s' ){
                vertical--;
            }
        }
        double displace= Math.pow(horitontal, 2) + Math.pow(vertical,2);
        double ans= Math.sqrt(displace);
        return ans;

    }
    public static void main(String[] args) {
        String direction = "WNEENESENNNwnsesnw";
        
        System.out.println(shortestdis(direction));
    }
}
