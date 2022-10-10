

//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 位运算 数学 字符串 模拟 👍 841 👎 0


package array数组.leetcode.editor.cn;

/**
 * 67.二进制求和.add-binary
 *
 * @author wangcy
 * @since 2022-07-07 17:07:47
 **/

public class Solution_67 {
    public static void main(String[] args) {

        Solution solution = new Solution_67().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            return Integer.toBinaryString(
                    Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}