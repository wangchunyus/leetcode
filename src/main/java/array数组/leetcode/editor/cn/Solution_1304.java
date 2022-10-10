

//给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。 
//
// 
//
// 示例 1： 
//
// 输入：n = 5
//输出：[-7,-1,1,3,4]
//解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
// 
//
// 示例 2： 
//
// 输入：n = 3
//输出：[-1,0,1]
// 
//
// 示例 3： 
//
// 输入：n = 1
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 1000 
// 
// Related Topics 数组 数学 👍 65 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 1304.和为零的 N 个不同整数.find-n-unique-integers-sum-up-to-zero
 *
 * @author wangcy
 * @since  2022-07-20 10:26:08
 **/

  public class Solution_1304{
      public static void main(String[] args) {

          Solution solution = new Solution_1304().new Solution();
          int[] ints = solution.sumZero(999);
          for (int anInt : ints) {
              System.out.print(anInt+",");
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sumZero(int n) {
        int[] r = new int[n];
        List<Integer> list = new ArrayList<>();
        if(n % 2 != 0){
            //奇数
            for (int i = 1; i <=(n-1)/2 ; i++) {
                 list.add(i);
                 list.add(-i);
            }
        }else{
            //偶数
            for (int i = 1; i <=n/2 ; i++) {
                list.add(i);
                list.add(-i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            r[i] = list.get(i);
        }
        return r;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }