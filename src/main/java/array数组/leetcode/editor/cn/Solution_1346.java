

//给你一个整数数组 arr，请你检查是否存在两个整数 N 和 M，满足 N 是 M 的两倍（即，N = 2 * M）。 
//
// 更正式地，检查是否存在两个下标 i 和 j 满足： 
//
// 
// i != j 
// 0 <= i, j < arr.length 
// arr[i] == 2 * arr[j] 
// 
//
// 
//
// 示例 1： 
//
// 输入：arr = [10,2,5,3]
//输出：true
//解释：N = 10 是 M = 5 的两倍，即 10 = 2 * 5 。
// 
//
// 示例 2： 
//
// 输入：arr = [7,1,14,11]
//输出：true
//解释：N = 14 是 M = 7 的两倍，即 14 = 2 * 7 。
// 
//
// 示例 3： 
//
// 输入：arr = [3,1,7,11]
//输出：false
//解释：在该情况下不存在 N 和 M 满足 N = 2 * M 。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= arr.length <= 500 
// -10^3 <= arr[i] <= 10^3 
// 
// Related Topics 数组 哈希表 双指针 二分查找 排序 👍 63 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 1346.检查整数及其两倍数是否存在.check-if-n-and-its-double-exist
 *
 * @author wangcy
 * @since  2022-07-12 14:04:49
 **/

  public class Solution_1346{
      public static void main(String[] args) {

          Solution solution = new Solution_1346().new Solution();
          int[] arr ={7,1,14,11};
          boolean b = solution.checkIfExist(arr);
          System.out.println(b);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j == i) continue;
                if(arr[j] == arr[i] * 2){
                    return true;
                }
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }