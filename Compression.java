import javax.print.DocFlavor.STRING;

public class Compression {

    public static String Compression(String str) {
        StringBuilder ans = new StringBuilder();
        int count=1;
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i-1);
            if(ch == str.charAt(i)){
                count++;
                // System.out.println(ch+" "+ count);
            }
            else{
                ans.append(ch);
                ans.append(count);
                count=1;
            }
            if(i==str.length()-1){
                ans.append(ch);
                ans.append(count);
            }
            
        }
        String q = ans.toString();
        return q;
    }
    public static void main(String[] args) {
        String str = "aaabbccccdddeeeeeffqqqkkaalopdd";
        System.out.println(Compression(str));

    }

}
