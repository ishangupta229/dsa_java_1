import java.util.*;

public class anagram {
    public static boolean anagram(String str1, String str2){
        if (str1.length()!=str2.length()) {
            return false;
        }

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        
        char[] str1_array = str1.toCharArray();
        char[] str2_array = str2.toCharArray();

        Arrays.sort(str1_array);
        Arrays.sort(str2_array);

        // boolean ans = str1_array==str2_array? true:false;
        // this is wrong .. as the location is not same .. so use equals
        
        boolean ans = Arrays.equals(str1_array,str2_array)? true:false;
        return ans;
    }
    public static void main(String[] args) {
        String s1 = "earth";
        String s2 = "heart";
        if (anagram(s1, s2)==true) {
            System.out.println("yep");
        } else { 
            System.out.println("Nah");
        }
    }
}
