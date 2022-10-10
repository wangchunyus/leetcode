

//假设 Andy 和 Doris 想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。 
//
// 你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设答案总是存在。 
//
// 
//
// 示例 1: 
//
// 
//输入: list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]，list2 = [
//"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
//输出: ["Shogun"]
//解释: 他们唯一共同喜爱的餐厅是“Shogun”。
// 
//
// 示例 2: 
//
// 
//输入:list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]，list2 = ["KFC",
// "Shogun", "Burger King"]
//输出: ["Shogun"]
//解释: 他们共同喜爱且具有最小索引和的餐厅是“Shogun”，它有最小的索引和1(0+1)。
// 
//
// 
//
// 提示: 
//
// 
// 1 <= list1.length, list2.length <= 1000 
// 1 <= list1[i].length, list2[i].length <= 30 
// list1[i] 和 list2[i] 由空格 ' ' 和英文字母组成。 
// list1 的所有字符串都是 唯一 的。 
// list2 中的所有字符串都是 唯一 的。 
// 
// Related Topics 数组 哈希表 字符串 👍 219 👎 0


package array数组.leetcode.editor.cn;

import java.util.*;

/**
 * 599.两个列表的最小索引总和.minimum-index-sum-of-two-lists
 *
 * @author wangcy
 * @since  2022-06-07 16:16:36
 **/

  public class Solution_599{
      public static void main(String[] args) {

          Solution solution = new Solution_599().new Solution();
          String[] list1 = {"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
          String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
          String[] restaurant = solution.findRestaurant(list1, list2);
          for (String s : restaurant) {
              System.out.print(s+",");
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<Integer, List<String>> integerStringHashMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            for (int i1 = 0; i1 < list2.length; i1++) {
                if(list1[i].equals(list2[i1])){
                    List<String> strings = integerStringHashMap.get(i+i1);
                    if(null != strings && strings.size() > 0){
                        strings.add(list1[i]);
                        integerStringHashMap.put(i+i1,strings);
                }else{
                        ArrayList<String> strings1 = new ArrayList<>();
                        strings1.add(list1[i]);
                        integerStringHashMap.put(i+i1,strings1);
                    }
                }
            }
        }
        //找到map中key最大的一个
        List<Integer> ee = new ArrayList<>();
        for (Integer integer : integerStringHashMap.keySet()) {
            ee.add(integer);
        }
        Collections.sort(ee);
        List<String> strings = integerStringHashMap.get(ee.get(0));
        String[] result = new String[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            result[i] = strings.get(i);
        }
        return result;



    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }