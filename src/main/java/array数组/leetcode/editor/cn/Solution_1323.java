

//给你一个仅由数字 6 和 9 组成的正整数 num。 
//
// 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。 
//
// 请返回你可以得到的最大数字。 
//
// 
//
// 示例 1： 
//
// 输入：num = 9669
//输出：9969
//解释：
//改变第一位数字可以得到 6669 。
//改变第二位数字可以得到 9969 。
//改变第三位数字可以得到 9699 。
//改变第四位数字可以得到 9666 。
//其中最大的数字是 9969 。
// 
//
// 示例 2： 
//
// 输入：num = 9996
//输出：9999
//解释：将最后一位从 6 变到 9，其结果 9999 是最大的数。 
//
// 示例 3： 
//
// 输入：num = 9999
//输出：9999
//解释：无需改变就已经是最大的数字了。 
//
// 
//
// 提示： 
//
// 
// 1 <= num <= 10^4 
// num 每一位上的数字都是 6 或者 9 。 
// 
//
// Related Topics 贪心 数学 👍 83 👎 0


package array数组.leetcode.editor.cn;

import java.nio.Buffer;

/**
 * 1323.6 和 9 组成的最大数字.maximum-69-number
 *
 * @author wangcy
 * @since 2023-09-25 11:41:33
 **/

public class Solution_1323 {
    public static void main(String[] args) {
        Solution solution = new Solution_1323().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maximum69Number (int num) {
            String s = Integer.toString(num);
            char[] ch = s.toCharArray();
            for(int i = 0; i < ch.length; i++){
                if(ch[i] == '6'){
                    ch[i] = '9';
                    break;
                }
            }
            return Integer.parseInt(new String(ch));
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}