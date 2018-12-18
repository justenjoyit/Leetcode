package answers.Multiply;

public class Multiply_2018121182033 {

    public static void main(String[] args) {
        String num1 = "3333";
        String num2 = "0";
        System.out.println(multiply(num1, num2));
    }

    public static String multiply(String num1, String num2) {
        String ans = "";
        char[] num1Chars = num1.toCharArray();
        char[] num2Chars = num2.toCharArray();

        if (num1Chars.length == 1 && num1Chars[0] == 48) {
            return "0";
        }
        if (num2Chars.length == 1 && num2Chars[0] == 48) {
            return "0";
        }

        for (int i = num1Chars.length - 1; i >= 0; --i) {
            int needAdd = 0;
            for (int j = num2Chars.length - 1; j >= 0; --j) {
                int n1 = num1Chars[i] - 48;
                int n2 = num2Chars[j] - 48;
                int multi = n1 * n2 + needAdd;
                int index = ans.length() - (num1Chars.length + num2Chars.length - i - j - 2) - 1;
                if (index < 0) {
                    ans = (multi % 10) + ans;
                } else {
                    multi += ans.charAt(index) - 48;
                    ans = (index - 1 < 0 ? "" : ans.substring(0, index)) + (multi % 10) + (index + 1 >= ans.length() ? "" : ans.substring(index + 1));
                }
                needAdd = multi / 10;
            }
            if (needAdd > 0) {
                int index = ans.length() - (num1Chars.length + num2Chars.length - i);
                if (index < 0) {
                    ans = (needAdd % 10) + ans;
                } else {
                    needAdd += ans.charAt(index);
                    ans = (index - 1 < 0 ? "" : ans.substring(0, index)) + (needAdd % 10) + (index + 1 >= ans.length() ? "" : ans.substring(index + 1));
                }
            }
        }
        return ans;
    }
}
