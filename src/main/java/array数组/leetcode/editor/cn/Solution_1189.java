

//给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。 
//
// 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：text = "nlaebolko"
//输出：1
// 
//
// 示例 2： 
//
// 
//
// 输入：text = "loonbalxballpoon"
//输出：2
// 
//
// 示例 3： 
//
// 输入：text = "leetcode"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10^4 
// text 全部由小写英文字母组成 
// 
//
// Related Topics 哈希表 字符串 计数 👍 127 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 1189.“气球” 的最大数量.maximum-number-of-balloons
 *
 * @author wangcy
 * @since 2023-04-28 14:12:01
 **/

public class Solution_1189 {
    public static void main(String[] args) {
        Solution solution = new Solution_1189().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxNumberOfBalloons(String text) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            // a = 1 ; b = 1  ;l = 2;o = 2 ;n = 1
            int count = 0;
            Integer a = map.get('a');
            Integer b = map.get('b');
            Integer o = map.get('o');
            Integer n = map.get('n');
            Integer l = map.get('l');
            while (a > 0 && b > 0 && n > 0 && o > 1 && l > 1) {
                a--;
                b--;
                n--;
                o -= 2;
                l -= 2;
                count++;
            }
            return count;


        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}