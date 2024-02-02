public class First_large {
    public static String uppercase(String str) {
        StringBuilder up = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (i==0) {
                char ch = Character.toUpperCase(str.charAt(i));
                up.append(ch);
            } else { 
                if(str.charAt(i-1)== ' '){
                    char ch = Character.toUpperCase(str.charAt(i));
                    up.append(ch);
                } else{
                    up.append(str.charAt(i));
                }
            }
            
        }
        String ans = up.toString();
        return ans;

    }
    public static void main(String[] args) {
        String line = "hi, this is ishan and i am sitting in LIB.";
        System.out.println(uppercase(line));
    }
}
