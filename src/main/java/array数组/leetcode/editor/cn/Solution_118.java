

//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//] 
// Related Topics 数组 动态规划 
// 👍 527 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 118.杨辉三角.pascals-triangle
 *
 * @author wangcy
 * @since  2021-07-14 16:18:52
 **/

  public class Solution_118{
      public static void main(String[] args) {

          Solution solution = new Solution_118().new Solution();
          List<List<Integer>> generate = solution.generate(5);
          for (List<Integer> integers : generate) {
              for (Integer integer : integers) {
                  System.out.print(integer);
                  System.out.print(",");
              }
              System.out.println("");
          }

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> rows = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j== i){
                    rows.add(1);
                }else {
                    rows.add(ret.get(i-1).get(j-1)+ret.get(i-1).get(j));
                }
            }
            ret.add(rows);
        }
        return ret;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }