

//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics 数学 
// 👍 2857 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 7.整数反转.reverse-integer
 *
 * @author wangcy
 * @since  2021-06-10 17:21:28
 **/

  public class Solution_7{
      public static void main(String[] args) {

          Solution solution = new Solution_7().new Solution();

          int reverse = solution.reverse(234);
          System.out.println(reverse);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {

        int result = 0;
        while (x!=0){
            int s = x%10;//每次去取末尾的数字
            //判断是否 大于 最大32位整数
            if (result>214748364 || (result==214748364 && s>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (result<-214748364 || (result==-214748364 && s<-8)) {
                return 0;
            }
            result = result*10+s;
            x /= 10;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }