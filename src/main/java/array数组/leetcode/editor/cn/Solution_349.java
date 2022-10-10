

//给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4]
//解释：[4,9] 也是可通过的
// 
//
// 
//nums1 = [3,4,5], nums2 = [2,3,4]
// 提示： 
//
// 
// 1 <= nums1.length, nums2.length <= 1000 
// 0 <= nums1[i], nums2[i] <= 1000 
// 
// Related Topics 数组 哈希表 双指针 二分查找 排序 👍 551 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 349.两个数组的交集.intersection-of-two-arrays
 *
 * @author wangcy
 * @since  2022-06-02 14:08:55
 **/

  public class Solution_349{
      public static void main(String[] args) {

          Solution solution = new Solution_349().new Solution();
          int[] num1 = {4,9,5};
          int[] num2 = {9,4,9,8,4};
          int[] intersection = solution.intersection(num1, num2);
          for (int i : intersection) {
              System.out.print(i);
              System.out.print(",");
          }

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> set = new HashSet<>();
        int pointerOne = 0;
        int pointerTwo = 0;
        while (pointerOne<nums1.length && pointerTwo<nums2.length){
            if(nums1[pointerOne] == nums2[pointerTwo]){
                if(set.contains(nums1[pointerOne])){
                    pointerOne++;
                    pointerTwo++;
                }else{
                    set.add(nums1[pointerOne]);
                }
            }else if(nums1[pointerOne] > nums2[pointerTwo]){
                pointerTwo++;
            }else {
                pointerOne++;
            }
        }
        Object[] objects = set.toArray();
        int[] result = new int[objects.length];
        for (int i = 0; i < objects.length; i++) {
            result[i] =Integer.parseInt(objects[i].toString());
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }