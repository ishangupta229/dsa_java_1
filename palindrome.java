public class palindrome {
    public static boolean palindrome(String str) {
        for (int i = 0; i < (str.length()+1)/2; i++) {
            if(str.charAt(i)!= str.charAt(str.length()-(i+1))){
                return false;
            }          
        }
        return true;
    }   
    public static void main(String[] args) {
        String str = "ishan";
        if (palindrome(str)==true) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }    
        
    } 
}
