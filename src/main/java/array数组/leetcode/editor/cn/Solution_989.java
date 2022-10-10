

//整数的 数组形式 num 是按照从左到右的顺序表示其数字的数组。 
//
// 
// 例如，对于 num = 1321 ，数组形式是 [1,3,2,1] 。 
// 
//
// 给定 num ，整数的 数组形式 ，和整数 k ，返回 整数 num + k 的 数组形式 。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：num = [1,2,0,0], k = 34
//输出：[1,2,3,4]
//解释：1200 + 34 = 1234
// 
//
// 示例 2： 
//
// 
//输入：num = [2,7,4], k = 181
//输出：[4,5,5]
//解释：274 + 181 = 455
// 
//
// 示例 3： 
//
// 
//输入：num = [2,1,5], k = 806
//输出：[1,0,2,1]
//解释：215 + 806 = 1021
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num.length <= 10⁴ 
// 0 <= num[i] <= 9 
// num 不包含任何前导零，除了零本身 
// 1 <= k <= 10⁴ 
// 
// Related Topics 数组 数学 👍 204 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 989.数组形式的整数加法.add-to-array-form-of-integer
 *
 * @author wangcy
 * @since  2022-07-06 18:30:24
 **/

  public class Solution_989{
      public static void main(String[] args) {

          Solution solution = new Solution_989().new Solution();
          int[] num= {9,2,0};
          int k = 134;
          List<Integer> list = solution.addToArrayForm(num, k);
          for (Integer integer : list) {
              System.out.print(integer+",");
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> l = new ArrayList<>();
        int length = num.length;
        for (int i = length-1; i >=0 ; i--) {
            int sum = num[i] + k % 10;//相同位置相加结果
            k /=10;//相加之后k的位数向前移动一位
            if(sum >= 10){
                k++;
                sum -=10;
            }
            l.add(sum);
        }
        for (; k > 0; k /= 10) {
            l.add(k % 10);
        }
        Collections.reverse(l);
        return l;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }