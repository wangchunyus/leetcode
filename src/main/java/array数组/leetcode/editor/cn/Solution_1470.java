

//给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。 
//
// 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [2,5,1,3,4,7], n = 3
//输出：[2,3,5,4,1,7] 
//解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
// 
//
// 示例 2： 
//
// 输入：nums = [1,2,3,4,4,3,2,1], n = 4
//输出：[1,4,2,3,3,2,4,1]
// 
//
// 示例 3： 
//
// 输入：nums = [1,1,2,2], n = 2
//输出：[1,2,1,2]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 500 
// nums.length == 2n 
// 1 <= nums[i] <= 10^3 
// 
// Related Topics 数组 👍 90 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 1470.重新排列数组.shuffle-the-array
 *
 * @author wangcy
 * @since  2022-07-19 10:55:03
 **/

  public class Solution_1470{
      public static void main(String[] args) {

          Solution solution = new Solution_1470().new Solution();
          int[] arr = {1,2,3,4,4,3,2,1};
          int n = 4;
          int[] shuffle = solution.shuffle(arr, n);
          for (int i : shuffle) {
              System.out.print(i+",");
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] r = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length ; i+=2,j++) {
            r[i] = nums[j];
        }
        for (int k = 1,j = n; k < nums.length; k+=2,j++) {
            r[k] = nums[j];
        }
        System.out.println(1);
        return r;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }