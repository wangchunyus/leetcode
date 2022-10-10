


//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。 
//
// 
//
// 示例： 
//
// 
//输入：nums = [1,2,3,4]
//输出：[1,3,2,4] 
//注：[3,1,2,4] 也是正确的答案之一。 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 50000 
// 0 <= nums[i] <= 10000 
// 
// Related Topics 数组 双指针 排序 👍 230 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 剑指 Offer 21.调整数组顺序使奇数位于偶数前面.diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof
 *
 * @author wangcy
 * @since  2022-06-17 15:35:30
 **/

 class Offer_21{
      public static void main(String[] args) {
          Solution solution = new Offer_21().new Solution();
          int[] arr ={3,4,6,7,5,20,21,18};
          int[] exchange = solution.exchange(arr);
          for (int i : exchange) {
              System.out.print(i+" ");
          }

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            //左边奇数  右边偶数
            if(nums[left]%2 != 0 && nums[right]%2 ==0 ){
                left++;
                right--;
                //左边偶数 右边奇数
            }else if(nums[left]%2 == 0 && nums[right]%2 != 0){
                int temp;
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
                //左边奇数  右边奇数
            }else if(nums[left]%2 !=0 && nums[right]%2 != 0){
                left++;
            }else{
                //左边偶数 右边偶数
                right--;
            }
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }