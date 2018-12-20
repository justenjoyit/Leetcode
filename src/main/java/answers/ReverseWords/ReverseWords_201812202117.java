package answers.ReverseWords;

public class ReverseWords_201812202117 {
    public static void main(String[] args) {
        System.out.println(reverseWords("  the sky is  blue"  ));
    }

    public static String reverseWords(String s) {
        String ans = "";
        String lastWord = "";
        for (int i = 0; i < s.length(); ++i) {
            if (' ' == s.charAt(i)) {
                ans = lastWord + ans;
                lastWord = "";
                if ( ans.length() != 0 &&' ' != ans.charAt(0)) {
                    ans = ' ' + ans;
                }
            } else {
                lastWord = lastWord + s.charAt(i);
            }
        }
        ans = lastWord + ans;

        //处理头部空格
        while (ans.length() != 0 && ' ' == ans.charAt(0)) {
            ans = ans.substring(1);
        }

        //处理尾部空格
        while (ans.length() != 0 && ' ' == ans.charAt(ans.length() - 1)) {
            ans = ans.substring(0, ans.length() - 1);
        }

        return ans;
    }

}
