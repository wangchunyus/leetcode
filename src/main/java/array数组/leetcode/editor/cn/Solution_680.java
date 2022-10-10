

//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "aba"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "abca"
//输出: true
//解释: 你可以删除c字符。
// 
//
// 示例 3: 
//
// 
//输入: s = "abc"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 10⁵ 
// s 由小写英文字母组成 
// 
// Related Topics 贪心 双指针 字符串 👍 507 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashSet;

/**
 * 680.验证回文字符串 Ⅱ.valid-palindrome-ii
 *
 * @author wangcy
 * @since  2022-06-28 10:17:22
 **/

  public class Solution_680{
      public static void main(String[] args) {

          Solution solution = new Solution_680().new Solution();
          String  str = "deeeee";
          boolean b = solution.validPalindrome(str);
          System.out.println(b);

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() == 1) return true;
        int left = 0;
        int right = s.length()-1;
        char[] chars = s.toCharArray();
        while (left < right){
            if(chars[left] == chars[right]){
                left++;
                right--;
            }else{
                return isPalindrome(left+1,right,s) || isPalindrome(left,right-1,s);
            }
        }
        return true;
    }
    public boolean isPalindrome(int left,int right,String s){
        char[] chars = s.toCharArray();
        while (left <right){
            if(chars[left] != chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }