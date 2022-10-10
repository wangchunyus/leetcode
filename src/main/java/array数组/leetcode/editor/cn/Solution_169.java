

//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1： 
//
// 
//输入：[3,2,3]
//输出：3 
//
// 示例 2： 
//
// 
//输入：[2,2,1,1,1,2,2]
//输出：2
// 
//
// 
//
// 进阶： 
//
// 
// 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。 
// 
// Related Topics 数组 哈希表 分治 计数 排序 
// 👍 1193 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 169.多数元素.majority-element
 *
 * @author wangcy
 * @since  2021-11-10 16:01:38
 **/

  public class Solution_169{
      public static void main(String[] args) {

          Solution solution = new Solution_169().new Solution();
          int[] arr = {2,2,1,1,1,2,2};
          int i = solution.majorityElement(arr);
          System.out.println(i);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Long> collect = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int count = nums.length >> 1;
        for(Map.Entry<Integer,Long> map:collect.entrySet()){
            if(map.getValue() > count){
                return map.getKey();
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }