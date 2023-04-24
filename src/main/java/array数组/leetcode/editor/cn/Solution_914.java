

//给定一副牌，每张牌上都写着一个整数。 
//
// 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组： 
//
// 
// 每组都有 X 张牌。 
// 组内所有的牌上都写着相同的整数。 
// 
//
// 仅当你可选的 X >= 2 时返回 true。 
//
// 
//
// 示例 1： 
//
// 
//输入：deck = [1,2,3,4,4,3,2,1]
//输出：true
//解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
// 
//
// 示例 2： 
//
// 
//输入：deck = [1,1,1,2,2,2,3,3]
//输出：false
//解释：没有满足要求的分组。
// 
//
// 提示： 
//
// 
// 1 <= deck.length <= 10⁴ 
// 0 <= deck[i] < 10⁴ 
// 
//
// Related Topics 数组 哈希表 数学 计数 数论 👍 282 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 914.卡牌分组.x-of-a-kind-in-a-deck-of-cards
 *
 * @author wangcy
 * @since 2023-04-24 13:46:35
 **/

public class Solution_914 {
    public static void main(String[] args) {

        Solution solution = new Solution_914().new Solution();
        int[] nums = {1, 1, 2, 2, 2, 2};
        boolean b = solution.hasGroupsSizeX(nums);
        System.out.println(b);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean hasGroupsSizeX(int[] deck) {

            HashMap<Integer, Integer> integerHashMap = new HashMap<>();
            for (int i = 0; i < deck.length; i++) {
                if (integerHashMap.containsKey(deck[i])) {
                    integerHashMap.put(deck[i], integerHashMap.get(deck[i]) + 1);
                } else {
                    integerHashMap.put(deck[i], integerHashMap.getOrDefault(deck[i], 1));
                }
            }
            int temp = 0;
            for (Map.Entry<Integer, Integer> entry1 : integerHashMap.entrySet()) {
                if (2 > gcd(temp, entry1.getValue())) {
                    return false;
                } else {
                    temp = entry1.getValue();
                }
            }
            return true;
        }

        public int gcd(int m, int n) {
            while (n != 0) {
                int r = m % n;
                m = n;
                n = r;
            }
            return m;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}