

//给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。 
//
// 请你返回字符串 s 的 能量。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "leetcode"
//输出：2
//解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
// 
//
// 示例 2： 
//
// 
//输入：s = "abbcccddddeeeeedcba"
//输出：5
//解释：子字符串 "eeeee" 长度为 5 ，只包含字符 'e' 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 500 
// s 只包含小写英文字母。 
// 
// Related Topics 字符串 👍 103 👎 0


package array数组.leetcode.editor.cn;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * 1446.连续字符.consecutive-characters
 *
 * @author wangcy
 * @since  2022-07-18 18:31:04
 **/

  public class Solution_1446{
      public static void main(String[] args) {
           Solution solution = new Solution_1446().new Solution();
          int leetcode = solution.maxPower("abbcccddddeeeeedcba");
          System.out.println(leetcode);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxPower(String s) {
        if(s.length() == 1) return 1;
        int slow = 0;
        int fast = 1;
        int count = 1;
        while (fast<=s.length()){
            if(fast< s.length() && (s.charAt(slow) == s.charAt(fast))){
                fast++;
            }else{
                count = Math.max(count,fast-slow);
                slow = fast;
                fast++;
            }
        }
        return  count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }