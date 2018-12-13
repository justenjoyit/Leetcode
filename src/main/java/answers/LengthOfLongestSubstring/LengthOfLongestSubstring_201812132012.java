package answers.LengthOfLongestSubstring;

public class LengthOfLongestSubstring_201812132012 {
    public static void main(String args[]) {
        String str = "pwwkew";
        System.out.printf("" + new Solution().lengthOfLongestSubstring(str));
    }

    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int result = 0;
            String longestSubString = "";
            for (int i = 0; i < s.length(); ++i) {
                boolean flag = false;
                if (i == s.length() - 1) {
                    flag = true;
                }
                //新字符不在最长字符里面
                if (!longestSubString.contains(s.subSequence(i, i + 1))) {
                    longestSubString = longestSubString + s.charAt(i);
                    if (result < longestSubString.length()) {
                        result = longestSubString.length();
                    }
                } else {
                    //新字符在最长字符里面
                    longestSubString = longestSubString.substring(1);
                    --i;
                }
                if (flag) {
                    return result;
                }
            }
            return result;
        }
    }
}
