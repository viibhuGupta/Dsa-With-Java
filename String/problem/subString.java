package String.problem;

public class subString {

    static String subString(String str , int si , int ei){
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";

        String ans = str.substring(0,5);
        
        System.out.println(ans);
        // System.out.println(subString(str,1,5));
    }
}
