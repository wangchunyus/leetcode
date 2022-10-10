

//给你一个字符串 num ，表示一个大整数。请你在字符串 num 的所有 非空子字符串 中找出 值最大的奇数 ，并以字符串形式返回。如果不存在奇数，则返回一个
//空字符串 "" 。 
//
// 子字符串 是字符串中的一个连续的字符序列。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = "52"
//输出："5"
//解释：非空子字符串仅有 "5"、"2" 和 "52" 。"5" 是其中唯一的奇数。
// 
//
// 示例 2： 
//
// 
//输入：num = "4206"
//输出：""
//解释：在 "4206" 中不存在奇数。
// 
//
// 示例 3： 
//
// 
//输入：num = "35427"
//输出："35427"
//解释："35427" 本身就是一个奇数。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num.length <= 10⁵ 
// num 仅由数字组成且不含前导零 
// 
// Related Topics 贪心 数学 字符串 👍 23 👎 0


package array数组.leetcode.editor.cn;

/**
 * 1903.字符串中的最大奇数.largest-odd-number-in-string
 *
 * @author wangcy
 * @since 2022-08-11 10:34:40
 **/

public class Solution_1903 {
    public static void main(String[] args) {

        Solution solution = new Solution_1903().new Solution();
        String num = "7542351161";
        String s = solution.largestOddNumber(num);
        System.out.println(s);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String largestOddNumber(String num) {
            int index = -1;
            for (int i = 0; i < num.length(); i++) {
                if ((num.charAt(i) - '0') % 2 != 0) {
                    index = i;
                }
            }
            return num.substring(0, index + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}