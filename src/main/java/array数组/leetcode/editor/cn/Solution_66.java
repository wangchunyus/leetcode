

//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = [1,2,3]
//输出：[1,2,4]
//解释：输入数组表示数字 123。
// 
//
// 示例 2： 
//
// 
//输入：digits = [4,3,2,1]
//输出：[4,3,2,2]
//解释：输入数组表示数字 4321。
// 
//
// 示例 3： 
//
// 
//输入：digits = [0]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// 
// Related Topics 数组 
// 👍 703 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 66.加一.plus-one
 *
 * @author wangcy
 * @since  2021-06-08 17:08:11
 **/

  public class Solution_66{
      public static void main(String[] args) {

          Solution solution = new Solution_66().new Solution();
          int[] dis = {9,9,9};
          int[] ints = solution.plusOne(dis);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {

        if(digits == null){
            return null;
        }else if(digits.length < 2 && digits[0] == 0){
            digits[0] = 1;
            return digits;
        }
        for (int i = digits.length-1; i >=0; i--) {
            digits[i]++;
            digits[i]  = digits[i] % 10;//判断加一之后是否需要进位
            if(digits[i] != 0 ) return digits;
        }
        //循环没结束 表示前面的数组变为 999....  需要进位 数组加空间 将第一个位置变为1
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }