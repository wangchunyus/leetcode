

//你总共有 n 枚硬币，并计划将它们按阶梯状排列。对于一个由 k 行组成的阶梯，其第 i 行必须正好有 i 枚硬币。阶梯的最后一行 可能 是不完整的。 
//
// 给你一个数字 n ，计算并返回可形成 完整阶梯行 的总行数。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 5
//输出：2
//解释：因为第三行不完整，所以返回 2 。
// 
//
// 示例 2： 
//
// 
//输入：n = 8
//输出：3
//解释：因为第四行不完整，所以返回 3 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 2³¹ - 1 
// 
// Related Topics 数学 二分查找 👍 226 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 441.排列硬币.arranging-coins
 *
 * @author wangcy
 * @since  2022-07-01 14:02:20
 **/

  public class Solution_441{
      public static void main(String[] args) {
           Solution solution = new Solution_441().new Solution();
          int i = solution.arrangeCoins(8);
          System.out.println(i);

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int arrangeCoins(int n) {
        int stairNum = 1;//每层硬币数
        int plieNum = 0;//层数
        int residue = n;//剩余硬币数
        while (stairNum <= residue){
            plieNum++;//每循环一次 加一层
            residue = residue-stairNum;//剩余硬币数 = 上次剩余数-当前层的硬币数
            stairNum++;//每次循环 楼层的硬币数+1
        }
        return plieNum;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }