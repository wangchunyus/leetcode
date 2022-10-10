

//给你两个数组，arr1 和 arr2，arr2 中的元素各不相同，arr2 中的每个元素都出现在 arr1 中。 
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
// 
//
// 示例 2: 
//
// 
//输入：arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
//输出：[22,28,8,6,17,44]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr1.length, arr2.length <= 1000 
// 0 <= arr1[i], arr2[i] <= 1000 
// arr2 中的元素 arr2[i] 各不相同 
// arr2 中的每个元素 arr2[i] 都出现在 arr1 中 
// 
// Related Topics 数组 哈希表 计数排序 排序 👍 225 👎 0


package array数组.leetcode.editor.cn;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 1122.数组的相对排序.relative-sort-array
 *
 * @author wangcy
 * @since  2022-07-13 15:35:44
 **/

  public class Solution_1122{
      public static void main(String[] args) {

          Solution solution = new Solution_1122().new Solution();
          int[] a1 = {2,3,1,3,2,4,6,7,9,2,19}; //7 19
          int[] a2 = {2,1,4,3,9,6};
          int[] ints = solution.relativeSortArray(a1, a2);
          for (int anInt : ints) {
              System.out.print(anInt+" ");
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i : arr2) {
            map.put(i,new ArrayList<>());
        }
//        SortedMap<Integer,Integer> sortedMap= new TreeMap<>();
        List<Integer> noMapNumList = new ArrayList<>();
        for (int i : arr1) {
            if(map.containsKey(i)){
                List<Integer> list = map.get(i);
                list.add(i);
            }else{
                noMapNumList.add(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            List<Integer> list = map.get(arr2[i]);
            if(list != null){
                for (Integer integer : list) {
                    result.add(integer);
                }
            }
        }
        //升序排列 未在 arr2中的数据
        List<Integer> collect = noMapNumList.stream().sorted().collect(Collectors.toList());
        for (Integer integer : collect) {
            result.add(integer);
        }
        int[] arr= result.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }