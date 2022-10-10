

//给你一个仅包含小写英文字母和 '?' 字符的字符串 s，请你将所有的 '?' 转换为若干小写字母，使最终的字符串不包含任何 连续重复 的字符。 
//
// 注意：你 不能 修改非 '?' 字符。 
//
// 题目测试用例保证 除 '?' 字符 之外，不存在连续重复的字符。 
//
// 在完成所有转换（可能无需转换）后返回最终的字符串。如果有多个解决方案，请返回其中任何一个。可以证明，在给定的约束条件下，答案总是存在的。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "?zs"
//输出："azs"
//解释：该示例共有 25 种解决方案，从 "azs" 到 "yzs" 都是符合题目要求的。只有 "z" 是无效的修改，因为字符串 "zzs" 中有连续重复的两
//个 'z' 。 
//
// 示例 2： 
//
// 
//输入：s = "ubv?w"
//输出："ubvaw"
//解释：该示例共有 24 种解决方案，只有替换成 "v" 和 "w" 不符合题目要求。因为 "ubvvw" 和 "ubvww" 都包含连续重复的字符。
// 
//
// 
//
// 提示： 
//
// 
// 
// 1 <= s.length <= 100 
// 
// 
// s 仅包含小写英文字母和 '?' 字符 
// 
// 
// Related Topics 字符串 👍 105 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashSet;

/**
 * 1576.替换所有的问号.replace-all-s-to-avoid-consecutive-repeating-characters
 *
 * @author wangcy
 * @since  2022-07-20 10:46:29
 **/

  public class Solution_1576{
      public static void main(String[] args) {

          Solution solution = new Solution_1576().new Solution();
          String s = solution.modifyString("ab?");
          System.out.println(s);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String modifyString(String s) {
            //输入：s = "?zs"
            //输出："azs"
            //解释：该示例共有 25 种解决方案，从 "azs" 到 "yzs" 都是符合题目要求的。只有 "z" 是无效的修改，因为字符串 "zzs" 中有连续重复的两
            //个 'z' 。
        if(s.length() == 1 && !Character.isLetter(s.charAt(0))){
            return "a";
        }
        char[] y = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u'
                ,'v','w','x','y','z'};
        char[] chars = s.toCharArray();
        char left = ' ';
        char right = ' ';
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isLetter(chars[i])){
                if( i == 0){
                    right = chars[i+1];
                }else if(i == s.length()-1){
                     left = chars[i-1];
                }else{
                    left = chars[i-1];
                    right = chars[i+1];
                }
                for (char c : y) {
                    if(c != left && c != right){
                        chars[i] = c;
                        break;
                    }
                }
            }
        }
        return String.valueOf(chars);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }