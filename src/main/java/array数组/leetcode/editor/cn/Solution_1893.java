

//给你一个二维整数数组 ranges 和两个整数 left 和 right 。每个 ranges[i] = [starti, endi] 表示一个从 
//starti 到 endi 的 闭区间 。 
//
// 如果闭区间 [left, right] 内每个整数都被 ranges 中 至少一个 区间覆盖，那么请你返回 true ，否则返回 false 。 
//
// 已知区间 ranges[i] = [starti, endi] ，如果整数 x 满足 starti <= x <= endi ，那么我们称整数x 被覆盖了
//。 
//
// 
//
// 示例 1： 
//
// 
//输入：ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5
//输出：true
//解释：2 到 5 的每个整数都被覆盖了：
//- 2 被第一个区间覆盖。
//- 3 和 4 被第二个区间覆盖。
//- 5 被第三个区间覆盖。
// 
//
// 示例 2： 
//
// 
//输入：ranges = [[1,10],[10,20]], left = 21, right = 21
//输出：false
//解释：21 没有被任何一个区间覆盖。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= ranges.length <= 50 
// 1 <= starti <= endi <= 50 
// 1 <= left <= right <= 50 
// 
// Related Topics 数组 哈希表 前缀和 👍 120 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 1893.检查是否区域内所有整数都被覆盖.check-if-all-the-integers-in-a-range-are-covered
 *
 * @author wangcy
 * @since  2022-08-11 18:12:34
 **/

  public class Solution_1893{
      public static void main(String[] args) {

          Solution solution = new Solution_1893().new Solution();
          int[][] range ={{6,29},{33,43},{7,50},{11,34},{24,26},{32,47}};
          int left = 2;
          int right = 31;
          boolean covered = solution.isCovered(range, left, right);
          System.out.println(covered);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] res = new int[right+1];
        for (int[] range : ranges) {
            for (int i = left; i <=right ; i++) {
                if(range[0] <= i && range[1] >= i){
                    res[i] = -1;
                }
            }
        }
        for (int i = left; i <=right ; i++) {
            if(res[i] != -1){
                return false;
            }
        }
        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }