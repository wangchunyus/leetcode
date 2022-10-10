


//0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字。
// 
//
// 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。 
//
// 
//
// 示例 1： 
//
// 
//输入: n = 5, m = 3
//输出: 3
// 
//
// 示例 2： 
//
// 
//输入: n = 10, m = 17
//输出: 2
// 
//
// 
//
// 限制： 
//
// 
// 1 <= n <= 10^5 
// 1 <= m <= 10^6 
// 
// Related Topics 递归 数学 👍 625 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.ListNode;
import array数组.leetcode.editor.cn.util.ListNodeUtil;

import java.util.*;

/**
 * 剑指 Offer 62.圆圈中最后剩下的数字.yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof
 *
 * @author wangcy
 * @since 2022-06-17 10:34:34
 **/

class Offer_62 {
    public static void main(String[] args) {

        Solution solution = new Offer_62().new Solution();
        int i = solution.lastRemaining(5, 3);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lastRemaining(int n, int m) {
            return f(n, m);
        }

        public int f(int n, int m) {
            if (n == 1) {
                return 0;
            }
            int x = f(n - 1, m);
            return (m + x) % n;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}