


//统计一个数字在排序数组中出现的次数。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [5,7,7,8,8,10], target = 8
//输出: 2 
//
// 示例 2: 
//
// 
//输入: nums = [5,7,7,8,8,10], target = 6
//输出: 0 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums 是一个非递减数组 
// -10⁹ <= target <= 10⁹ 
// 
//
// 
//
// 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-
//position-of-element-in-sorted-array/ 
// Related Topics 数组 二分查找 👍 324 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 剑指 Offer 53 - I.在排序数组中查找数字 I.zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof
 *
 * @author wangcy
 * @since  2022-06-22 10:13:39
 **/

 class Offer_53_I{
      public static void main(String[] args) {
           Solution solution = new Offer_53_I().new Solution();
           int[] arr = new int[]{1,1,2};
          int search = solution.search(arr, 1);
          System.out.println(search);

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return 0;
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)/2;
        int count = 0;
        if(nums[mid] <= target){
            for (int i = mid;i<=right;i++){
                if(nums[i] == target){
                    count++;
                }
            }
        }
        if(nums[mid] >= target){
            for (int i = left; i <mid ; i++) {
                if(nums[i] == target){
                    count++;
                }
            }
        }
        return count;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }