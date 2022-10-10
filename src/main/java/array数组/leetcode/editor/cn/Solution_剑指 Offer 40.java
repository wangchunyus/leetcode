


//输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [3,2,1], k = 2
//输出：[1,2] 或者 [2,1]
// 
//
// 示例 2： 
//
// 输入：arr = [0,1,2,1], k = 1
//输出：[0] 
//
// 
//
// 限制： 
//
// 
// 0 <= k <= arr.length <= 10000 
// 0 <= arr[i] <= 10000 
// 
// Related Topics 数组 分治 快速选择 排序 堆（优先队列） 👍 443 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 剑指 Offer 40.最小的k个数.zui-xiao-de-kge-shu-lcof
 *
 * @author wangcy
 * @since  2022-06-17 10:24:16
 **/

 class Offer_40{
      public static void main(String[] args) {

          Solution solution = new Offer_40().new Solution();
          int[] arr = {0,1,2,1};
          int[] leastNumbers = solution.getLeastNumbers(arr, 1);
          for (int leastNumber : leastNumbers) {
              System.out.println(leastNumber);
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        if(arr.length < k) return null;
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }