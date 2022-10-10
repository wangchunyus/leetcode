

//给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abab"
//输出: true
//解释: 可由子串 "ab" 重复两次构成。
// 
//
// 示例 2: 
//
// 
//输入: s = "aba"
//输出: false
// 
//
// 示例 3: 
//
// 
//输入: s = "abcabcabcabc"
//输出: true
//解释: 可由子串 "abc" 重复四次构成。 (或子串 "abcabc" 重复两次构成。)
// 
//
// 
//
// 提示： 
//
// 
//
// 
// 1 <= s.length <= 10⁴ 
// s 由小写英文字母组成 
// 
// Related Topics 字符串 字符串匹配 👍 720 👎 0


package array数组.leetcode.editor.cn;

/**
 * 459.重复的子字符串.repeated-substring-pattern
 *
 * @author wangcy
 * @since 2022-06-24 15:44:28
 **/

public class Solution_459 {
    public static void main(String[] args) {

        Solution solution = new Solution_459().new Solution();
        boolean abab = solution.repeatedSubstringPattern("abab");
        System.out.println(abab);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            int i = (s + s).indexOf(s, 1);

            return i != s.length();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}