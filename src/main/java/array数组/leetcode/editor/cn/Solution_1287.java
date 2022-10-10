

//给你一个非递减的 有序 整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。 
//
// 请你找到并返回这个整数 
//
// 
//
// 示例： 
//
// 
//输入：arr = [1,2,2,6,6,6,6,7,10]
//输出：6
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10^4 
// 0 <= arr[i] <= 10^5 
// 
// Related Topics 数组 👍 64 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 1287.有序数组中出现次数超过25%的元素.element-appearing-more-than-25-in-sorted-array
 *
 * @author wangcy
 * @since  2022-07-14 18:14:16
 **/

  public class Solution_1287{
      public static void main(String[] args) {

          Solution solution = new Solution_1287().new Solution();
          int[] arr ={1,1,1,1,1,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12};
          int specialInteger = solution.findSpecialInteger(arr);
          System.out.println(specialInteger);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findSpecialInteger(int[] arr) {
        double percent = arr.length * 0.25;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if(map.containsKey(i)){
                if(map.get(i) > percent){
                    return i;
                }
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int count = 0;
        int index = 0;
        for (Integer key : map.keySet()) {
            if(map.get(key) > count){
                index = key;
                count = map.get(key);
            }
        }
        return index;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }