

//给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。 
//
// 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [1,2,2,1,1,3]
//输出：true
//解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。 
//
// 示例 2： 
//
// 输入：arr = [1,2]
//输出：false
// 
//
// 示例 3： 
//
// 输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 1000 
// -1000 <= arr[i] <= 1000 
// 
// Related Topics 数组 哈希表 👍 138 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 1207.独一无二的出现次数.unique-number-of-occurrences
 *
 * @author wangcy
 * @since 2022-07-14 15:34:16
 **/

public class Solution_1207 {
    public static void main(String[] args) {
        Solution solution = new Solution_1207().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i : arr) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                }else{
                    map.put(i,1);
                }
            }
            HashSet<Integer> set = new HashSet<>();
            for (Integer key : map.keySet()) {
                Integer count = map.get(key);
                if(set.contains(count)){
                    return false;
                }else{
                    set.add(count);
                }
            }
            return true;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}