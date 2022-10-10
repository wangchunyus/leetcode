

//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表 
// 👍 393 👎 0


package array数组.leetcode.editor.cn;

import java.util.*;
import java.util.logging.Level;

/**
 * 242.有效的字母异位词.valid-anagram
 *
 * @author wangcy
 * @since  2021-06-10 18:01:29
 **/

  public class Solution_242{
      public static void main(String[] args) {

          Solution solution = new Solution_242().new Solution();
          String s = "anagram";
          String t = "nagaram";
          boolean anagram = solution.isAnagram(s, t);
          System.out.println(anagram);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        //解法 1
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            characterIntegerHashMap.put(c,characterIntegerHashMap.getOrDefault(c,0)+1);
        }
        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            characterIntegerHashMap.put(c,characterIntegerHashMap.getOrDefault(c,0)-1);
            if(characterIntegerHashMap.get(c) < 0) return false;
        }
        //解法2
//        char[] chars = s.toCharArray();
//        char[] chars1 = t.toCharArray();
//        Arrays.sort(chars);
//        Arrays.sort(chars1);
//        if(!String.valueOf(chars).equals(String.valueOf(chars1))) return false;
        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }