

//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。 
//
// 
//
// 示例： 
//
// s = "leetcode"
//返回 0
//
//s = "loveleetcode"
//返回 2
// 
//
// 
//
// 提示：你可以假定该字符串只包含小写字母。 
// Related Topics 哈希表 字符串 
// 👍 399 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;

/**
 * 387.字符串中的第一个唯一字符.first-unique-character-in-a-string
 *
 * @author wangcy
 * @since  2021-06-10 17:39:35
 **/

  public class Solution_387{
      public static void main(String[] args) {

          Solution solution = new Solution_387().new Solution();
          int leetcode = solution.firstUniqChar("leetcode");
          System.out.println(leetcode);
      }

      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            //记录每一个字符出现的次数
            char c = s.charAt(i);
            characterIntegerHashMap.put(c,characterIntegerHashMap.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(characterIntegerHashMap.get(c) == 1) return i;
        }
        return -1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }