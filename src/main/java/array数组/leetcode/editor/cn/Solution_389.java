

//给定两个字符串 s 和 t ，它们只包含小写字母。 
//
// 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。 
//
// 请找出在 t 中被添加的字母。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "abcd", t = "abcde"
//输出："e"
//解释：'e' 是那个被添加的字母。
// 
//
// 示例 2： 
//
// 
//输入：s = "", t = "y"
//输出："y"
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 1000 
// t.length == s.length + 1 
// s 和 t 只包含小写字母 
// 
// Related Topics 位运算 哈希表 字符串 排序 👍 328 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashSet;

/**
 * 389.找不同.find-the-difference
 *
 * @author wangcy
 * @since  2022-06-29 19:08:43
 **/

  public class Solution_389{
      public static void main(String[] args) {

          Solution solution = new Solution_389().new Solution();
          String s = "";
          String t = "a";
          char theDifference = solution.findTheDifference(s, t);
          System.out.println(theDifference);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char findTheDifference(String s, String t) {
        if(s == null || s.equals("")) return t.toCharArray()[0];
        int[] ints = new int[26];
        char[] sChars = s.toCharArray();
        for (char sChar : sChars) {
            int i = sChar % 97;
            ints[i] = ints[i]+1;
        }
        char[] tChars = t.toCharArray();
        for (char tChar : tChars) {
            int j = tChar % 97;
            if(ints[j] -1 < 0){
                return tChar;
            }else{
                ints[j]  = ints[j]-1;
            }
        }
        return ' ';
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }