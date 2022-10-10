

//给你一个字符串 s ，如果 s 是一个 好 字符串，请你返回 true ，否则请返回 false 。 
//
// 如果 s 中出现过的 所有 字符的出现次数 相同 ，那么我们称字符串 s 是 好 字符串。 
//
// 
//
// 示例 1： 
//
// 输入：s = "abacbc"
//输出：true
//解释：s 中出现过的字符为 'a'，'b' 和 'c' 。s 中所有字符均出现 2 次。
// 
//
// 示例 2： 
//
// 输入：s = "aaabb"
//输出：false
//解释：s 中出现过的字符为 'a' 和 'b' 。
//'a' 出现了 3 次，'b' 出现了 2 次，两者出现次数不同。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 只包含小写英文字母。 
// 
// Related Topics 哈希表 字符串 计数 👍 11 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 1941.检查是否所有字符出现次数相同.check-if-all-characters-have-equal-number-of-occurrences
 *
 * @author wangcy
 * @since  2022-07-22 17:57:28
 **/

  public class Solution_1941{
      public static void main(String[] args) {
           Solution solution = new Solution_1941().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean areOccurrencesEqual(String s) {

        // 输入：s = "abacbc"
        //输出：true
        //解释：s 中出现过的字符为 'a'，'b' 和 'c' 。s 中所有字符均出现 2 次。
        HashMap<Character, Integer> map = new HashMap<>();

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if(map.containsKey(aChar)){
                map.put(aChar,map.get(aChar)+1);
            }else{
                map.put(aChar,map.getOrDefault(aChar,1));
            }
        }
        int c =0;
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            if(c == 0){
                c = characterIntegerEntry.getValue();
            }else if(c != characterIntegerEntry.getValue()){
                return false;

            }
        }
        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }