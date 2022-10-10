

//给你一个仅由整数组成的有序数组，其中每个元素都会出现两次，唯有一个数只会出现一次。 
//
// 请你找出并返回只出现一次的那个数。 
//
// 你设计的解决方案必须满足 O(log n) 时间复杂度和 O(1) 空间复杂度。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,1,2,3,3,4,4,8,8]
//输出: 2
// 
//
// 示例 2: 
//
// 
//输入: nums =  [3,3,7,7,10,11,11]
//输出: 10
// 
//
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 10⁵ 
// 0 <= nums[i] <= 10⁵ 
// 
// Related Topics 数组 二分查找 👍 529 👎 0


package array数组.leetcode.editor.cn;

import javax.swing.text.TabableView;

/**
 * 540.有序数组中的单一元素.single-element-in-a-sorted-array
 *
 * @author wangcy
 * @since 2022-07-28 14:38:31
 **/

public class Solution_540 {
    public static void main(String[] args) {

        Solution solution = new Solution_540().new Solution();
          int[] arr = {1,1,2,3,3,4,4,8,8,};
//        int[] arr = {1, 1, 2, 2, 3, 3, 4, 6, 6, 7, 7};
        int i = solution.singleNonDuplicate(arr);
        System.out.println(i);
        System.out.println(5^1);
        System.out.println(6^1);
        System.out.println(7^1);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNonDuplicate(int[] nums) {

            int low = 0, high = nums.length - 1;
            while (low < high) {
                int mid = (high - low) / 2 + low;
                int i = mid ^ 1;
                if (nums[mid] == nums[i]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return nums[low];
        }

}
//leetcode submit region end(Prohibit modification and deletion)

  }