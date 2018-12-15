package answers.LongestCommonPrefix;

public class LongestCommonPrefix_201812151351 {
    public static void main(String args[]) {
        String[] strs = new String[]{"dog","racecar","car"};
        System.out.printf(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        int strLength = 9999;
        for (String str : strs) {
            if (strLength > str.length()) {
                strLength = str.length();
            }
        }
        for (int i = 0; i < strLength; ++i) {
            char c = '_';
            for (int j = 0; j < strs.length; ++j) {
                if (0 == j) {
                    c = strs[j].charAt(i);
                } else {
                    if (c != strs[j].charAt(i)) {
                        return res;
                    }
                }
                if ( strs.length -1 == j) {
                    res = res + c;
                }
            }
        }
        return res;
    }

}
