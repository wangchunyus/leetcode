

//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 1078 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 283.移动零.move-zeroes
 *
 * @author wangcy
 * @since  2021-06-08 17:37:34
 **/

  public class Solution_283{
      public static void main(String[] args) {
           Solution solution = new Solution_283().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {

        int startPoint = 0;
        int endPoint = 0;

        while (endPoint<nums.length){
            if(nums[endPoint] != 0 ){
                swap(nums,startPoint,endPoint);
                startPoint++;
            }
            endPoint++;
        }
    }
    public void swap(int[] nums,int left,int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }