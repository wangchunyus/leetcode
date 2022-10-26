

//如果一个密码满足以下所有条件，我们称它是一个 强 密码： 
//
// 
// 它有至少 8 个字符。 
// 至少包含 一个小写英文 字母。 
// 至少包含 一个大写英文 字母。 
// 至少包含 一个数字 。 
// 至少包含 一个特殊字符 。特殊字符为："!@#$%^&*()-+" 中的一个。 
// 它 不 包含 2 个连续相同的字符（比方说 "aab" 不符合该条件，但是 "aba" 符合该条件）。 
// 
//
// 给你一个字符串 password ，如果它是一个 强 密码，返回 true，否则返回 false 。 
//
// 
//
// 示例 1： 
//
// 输入：password = "IloveLe3tcode!"
//输出：true
//解释：密码满足所有的要求，所以我们返回 true 。
// 
//
// 示例 2： 
//
// 输入：password = "Me+You--IsMyDream"
//输出：false
//解释：密码不包含数字，且包含 2 个连续相同的字符。所以我们返回 false 。
// 
//
// 示例 3： 
//
// 输入：password = "1aB!"
//输出：false
//解释：密码不符合长度要求。所以我们返回 false 。 
//
// 
//
// 提示： 
//
// 
// 1 <= password.length <= 100 
// password 包含字母，数字和 "!@#$%^&*()-+" 这些特殊字符。 
// 
//
// Related Topics 字符串 👍 6 👎 0


package array数组.leetcode.editor.cn;

/**
 * 2299.强密码检验器 II.strong-password-checker-ii
 *
 * @author wangcy
 * @since 2022-10-25 16:48:29
 **/

public class Solution_2299 {
    public static void main(String[] args) {

        Solution solution = new Solution_2299().new Solution();
        String pws = "IloveLe3tcode!";
        solution.strongPasswordCheckerII(pws);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        String ap = "!@#$%^&*()-+";

        public boolean strongPasswordCheckerII(String password) {
            int n = password.length();
            if (n < 8) return false;
            boolean hasMlet, hasBlet, hasDit, hasAp;
            hasMlet = hasBlet = hasDit = hasAp = false;
            for (int i = 0; i < n; i++) {
                char c = password.charAt(i);
                if (i > 0 && c == password.charAt(i - 1)) return false;
                if (Character.isDigit(c)) hasDit = true;
                else if (c >= 'a' && c <= 'z') hasMlet = true;
                else if (c >= 'A' && c <= 'Z') hasBlet = true;
                else {
                    for (int j = 0; j < ap.length(); j++) {
                        if (ap.charAt(j) == c) {
                            hasAp = true;
                            break;
                        }
                    }
                }
            }
            return hasMlet && hasAp && hasDit && hasBlet;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

  }