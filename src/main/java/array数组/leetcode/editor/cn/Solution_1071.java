

//对于字符串 s 和 t，只有在 s = t + ... + t（t 自身连接 1 次或多次）时，我们才认定 “t 能除尽 s”。 
//
// 给定两个字符串 str1 和 str2 。返回 最长字符串 x，要求满足 x 能除尽 str1 且 X 能除尽 str2 。 
//
// 
//
// 示例 1： 
//
// 
//输入：str1 = "ABCABC", str2 = "ABC"
//输出："ABC"
// 
//
// 示例 2： 
//
// 
//输入：str1 = "ABABAB", str2 = "ABAB"
//输出："AB"
// 
//
// 示例 3： 
//
// 
//输入：str1 = "LEET", str2 = "CODE"
//输出：""
// 
//
// 
//
// 提示： 
//
// 
// 1 <= str1.length, str2.length <= 1000 
// str1 和 str2 由大写英文字母组成 
// 
//
// Related Topics 数学 字符串 👍 273 👎 0


package array数组.leetcode.editor.cn;

/**
 * 1071.字符串的最大公因子.greatest-common-divisor-of-strings
 *
 * @author wangcy
 * @since 2023-04-26 15:32:12
 **/

public class Solution_1071 {
    public static void main(String[] args) {

        Solution solution = new Solution_1071().new Solution();
        String s1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String s2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        String s = solution.gcdOfStrings(s1, s2);
        System.out.println(s);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            int len1 = str1.length();
            int len2 = str2.length();
            if (str1.charAt(0) != str2.charAt(0)) {
                return "";
            }
            if (len1 == len2) {
                if (str1.equals(str2)) {
                    return str1;
                } else {
                    return "";
                }
            }
            if (len1 < len2) {
                int p = len1;
                while (p > 0) {
                    String m = str1.substring(0, p);
                    if(check(len2,m,str2) && check(len1,m,str1)){
                        return m;
                    }
                    p--;
                }
            } else {
                int l = len2;
                while (l > 0) {
                    String m = str2.substring(0, l);
                    if(check(len1,m,str1) && check(len2,m,str2)){
                        return m;
                    }
                    l--;
                }
            }
            return "";
        }

        /**
         * 检查
         *
         * @param len 长度长的那个字符串长度
         * @param m   公约数
         * @param str 需要比较的字符串
         * @return boolean
         */
        public boolean check(int len, String m, String str) {
            if (len % m.length() == 0) {
                StringBuffer buffer = new StringBuffer();
                for (int i = 0; i < len / m.length(); i++) {
                    buffer.append(m);
                }
                if (str.equals(buffer.toString())) {
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}