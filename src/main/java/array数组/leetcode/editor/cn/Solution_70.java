

//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 2
//输出：2
//解释：有两种方法可以爬到楼顶。
//1. 1 阶 + 1 阶
//2. 2 阶 
//
// 示例 2： 
//
// 
//输入：n = 3
//输出：3
//解释：有三种方法可以爬到楼顶。
//1. 1 阶 + 1 阶 + 1 阶
//2. 1 阶 + 2 阶
//3. 2 阶 + 1 阶
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 45 
// 
// Related Topics 记忆化搜索 数学 动态规划 👍 2462 👎 0


package array数组.leetcode.editor.cn;

/**
 * 70.爬楼梯.climbing-stairs
 *
 * @author wangcy
 * @since 2022-06-13 11:11:10
 **/

public class Solution_70 {
    public static void main(String[] args) {

        Solution solution = new Solution_70().new Solution();
        int i = solution.climbStairs(4);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int climbStairs(int n) {
            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return 2;
            }
            int a = 1, b = 1, c = 2;
            for (int i = 2; i < n; i++) {
                a = b;      // f(x - 2)
                b = c;      // f(x - 1)
                c = a + b;  // f(x)
            }
            return c;
        }

}
//leetcode submit region end(Prohibit modification and deletion)

}