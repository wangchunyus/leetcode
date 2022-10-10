


//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。 
//
// 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1: 
//
// 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
//输出: 2 
//
// 
//
// 限制： 
//
// 1 <= 数组长度 <= 50000 
//
// 
//
// 注意：本题与主站 169 题相同：https://leetcode-cn.com/problems/majority-element/ 
//
// 
// Related Topics 数组 哈希表 分治 计数 排序 👍 290 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 剑指 Offer 39.数组中出现次数超过一半的数字.shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof
 *
 * @author wangcy
 * @since  2022-06-24 18:29:40
 **/

 class Offer_39{
      public static void main(String[] args) {

          Solution solution = new Offer_39().new Solution();
          int[] arr = {3,2,3};
          int i = solution.majorityElement(arr);
          System.out.println(i);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int half = nums.length / 2;
        int left = 0;
        int right = 0;
        while (right < nums.length){
            if(nums[left] == nums[right]){
                right++;
            }else if(right-left > half){
                return nums[left];
            }else {
                left = right;
            }
        }
        return nums[left];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }