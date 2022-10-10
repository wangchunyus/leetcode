

//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 字符串 滑动窗口 👍 7927 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;

/**
 * 3.无重复字符的最长子串.longest-substring-without-repeating-characters
 *
 * @author wangcy
 * @since  2022-08-01 10:55:17
 **/

  public class Solution_3{
      public static void main(String[] args) {
           Solution solution = new Solution_3().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //输入: s = "abcabcbb"
        //输出: 3
        //解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
        HashMap<Character, Integer> windos = new HashMap<>();
        int left = 0;
        int right = 0;
        int res = 0;
        while (right < s.length()){
            char c = s.charAt(right);
            right++;
            //将字符滑入窗口
            windos.put(c,windos.getOrDefault(c,0)+1);
            //判断什么时候收缩窗口
            while (windos.get(c) > 1){
                char c1 = s.charAt(left);
                left++;
                windos.put(c1,windos.getOrDefault(c1,0)-1);
            }
            res = Math.max(res,right-left);

        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }