

//给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符： 
//
// 
// 字符（'a' - 'i'）分别用（'1' - '9'）表示。 
// 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
// 
//
// 返回映射之后形成的新字符串。 
//
// 题目数据保证映射始终唯一。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "10#11#12"
//输出："jkab"
//解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
// 
//
// 示例 2： 
//
// 
//输入：s = "1326#"
//输出："acz"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s[i] 只包含数字（'0'-'9'）和 '#' 字符。 
// s 是映射始终存在的有效字符串。 
// 
//
// Related Topics 字符串 👍 84 👎 0


package array数组.leetcode.editor.cn;

/**
 * 1309.解码字母到整数映射.decrypt-string-from-alphabet-to-integer-mapping
 *
 * @author wangcy
 * @since 2023-09-25 10:42:01
 **/

public class Solution_1309 {
    public static void main(String[] args) {

        Solution solution = new Solution_1309().new Solution();
        String s = "10#11#12";
        String s1 = solution.freqAlphabets(s);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String freqAlphabets(String s) {
            char[] alphabetChars = new char[27];
            for (int i = 1; i < alphabetChars.length; i++) {
                alphabetChars[i] = (char) (96 + i);
            }
            StringBuilder builder = new StringBuilder();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i < chars.length - 2 && chars[i + 2] == '#') {
                    builder.append(alphabetChars[(chars[i] - '0') * 10 + (chars[i + 1] - '0')]);
                    i += 2;
                } else {
                    builder.append(alphabetChars[chars[i] - '0']);
                }
            }
            return builder.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}