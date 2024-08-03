package String.problem;

public class vailedPalindrom {

    static boolean isVailedPalindrom(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
                sb.append(s.charAt(i));
            }
        }

        int n = sb.length();
        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) != sb.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isVailedPalindrom(s));
        // System.out.println(isPalindrom(s));
    }
}
