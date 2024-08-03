package String.problem;

public class twoStringEqual {
    public static void main(String[] args) {

        String s = "Hello";
        String s1 = new String("Hello1");
        boolean ans;

        if (s.equals(s1)) {
            ans = true;
        } else {
            ans = false;
        }

        System.out.println(ans);
    }
}
