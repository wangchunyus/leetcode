

//给定两个数组，编写一个函数来计算它们的交集。 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2,3,4,5]
//输出：[2,2]
// 
//
// 示例 2: 
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[4,9] 
//
// 
//
// 说明： 
//
// 
// 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。 
// 我们可以不考虑输出结果的顺序。 
// 
//
// 进阶： 
//
// 
// 如果给定的数组已经排好序呢？你将如何优化你的算法？ 
// 如果 nums1 的大小比 nums2 小很多，哪种方法更优？ 
// 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？ 
// 
// Related Topics 排序 哈希表 双指针 二分查找 
// 👍 504 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;
import java.util.logging.Level;

/**
 * 350.两个数组的交集 II.intersection-of-two-arrays-ii
 *
 * @author wangcy
 * @since  2021-06-07 18:18:24
 **/

  public class Solution_350{
      public static void main(String[] args) {

          Solution solution = new Solution_350().new Solution();
          int[] nums1 = {4,9,5};
          int[] nums2 = {9,4,9,8,4};
          int[] intersect = solution.intersect(nums1, nums2);
          for (int i : intersect) {
              System.out.println(i);
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        if(nums1 == null || nums2 == null) return null;
        //nums1 = [3,4,5,9], nums2 = [4,4,8,9,9]

        int[] resultSect = new int[Math.min(nums1.length,nums2.length)];//返回结果数组
        //数组排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int num1Point = 0;//第一个数组指针
        int num2Point = 0;//第二个数组指针
        int index = 0;//新数组下标
        while (num1Point < nums1.length && num2Point < nums2.length){
            if(nums1[num1Point] < nums2[num2Point]){
                //数组1的值小于数组2的值 表示 数组2中不存在此值 则数组1的指针➡️移
                num1Point++;
            }else if(nums1[num1Point]>nums2[num2Point]){
                //数组1的值大于数组2的值 表示 数组1中不存在此值 则数组2的指针➡️移
                num2Point++;
            }else {
                //表示数组1和数组2产生交集 将此值存放到 新数组中 并且数组1和数组2指针同时➡️移 新数组下标++
                resultSect[index] = nums1[num1Point];
                num1Point++;
                num2Point++;
                index++;

            }
        }
        return Arrays.copyOfRange(resultSect,0,index);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }