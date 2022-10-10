

//给你一个二进制字符串 s 。如果字符串中由 1 组成的 最长 连续子字符串 严格长于 由 0 组成的 最长 连续子字符串，返回 true ；否则，返回 
//false 。 
//
// 
// 例如，s = "110100010" 中，由 1 组成的最长连续子字符串的长度是 2 ，由 0 组成的最长连续子字符串的长度是 3 。 
// 
//
// 注意，如果字符串中不存在 0 ，此时认为由 0 组成的最长连续子字符串的长度是 0 。字符串中不存在 1 的情况也适用此规则。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "1101"
//输出：true
//解释：
//由 1 组成的最长连续子字符串的长度是 2："1101"
//由 0 组成的最长连续子字符串的长度是 1："1101"
//由 1 组成的子字符串更长，故返回 true 。
// 
//
// 示例 2： 
//
// 
//输入：s = "111000"
//输出：false
//解释：
//由 1 组成的最长连续子字符串的长度是 3："111000"
//由 0 组成的最长连续子字符串的长度是 3："111000"
//由 1 组成的子字符串不比由 0 组成的子字符串长，故返回 false 。
// 
//
// 示例 3： 
//
// 
//输入：s = "110100010"
//输出：false
//解释：
//由 1 组成的最长连续子字符串的长度是 2："110100010"
//由 0 组成的最长连续子字符串的长度是 3："110100010"
//由 1 组成的子字符串不比由 0 组成的子字符串长，故返回 false 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 100 
// s[i] 不是 '0' 就是 '1' 
// 
// Related Topics 字符串 👍 20 👎 0


package array数组.leetcode.editor.cn;

/**
 * 1869.哪种连续子字符串更长.longer-contiguous-segments-of-ones-than-zeros
 *
 * @author wangcy
 * @since 2022-08-12 18:36:44
 **/

public class Solution_1869 {
    public static void main(String[] args) {
        Solution solution = new Solution_1869().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkZeroOnes(String s) {
            int len = s.length();
            int ans1 = 0;
            int ans0 = 0;
            int result1 = 0;
            int result0 = 0;
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                if (c == '1') {
                    ans0 = 0;
                    ans1++;
                    result1 = Math.max(ans1, result1);
                } else {
                    ans1 = 0;
                    ans0++;
                    result0 = Math.max(ans0, result0);
                }

            }
            return result1 > result0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}