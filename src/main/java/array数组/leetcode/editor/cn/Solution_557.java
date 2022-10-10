

//给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "Let's take LeetCode contest"
//输出："s'teL ekat edoCteeL tsetnoc"
// 
//
// 示例 2: 
//
// 
//输入： s = "God Ding"
//输出："doG gniD"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 5 * 10⁴ 
// s 包含可打印的 ASCII 字符。 
// s 不包含任何开头或结尾空格。 
// s 里 至少 有一个词。 
// s 中的所有单词都用一个空格隔开。 
// 
// Related Topics 双指针 字符串 👍 454 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 557.反转字符串中的单词 III.reverse-words-in-a-string-iii
 *
 * @author wangcy
 * @since  2022-06-27 15:47:31
 **/

  public class Solution_557{
      public static void main(String[] args) {

          Solution solution = new Solution_557().new Solution();
          String str = "Let's take LeetCode contest";
          String s = solution.reverseWords(str);
          System.out.println(s);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            char[] chars = str[i].toCharArray();
            for (int i1 = chars.length-1; i1 >= 0; i1--) {
                result.append(chars[i1]);
                if(i != str.length-1 && i1==0){
                    result.append(" ");
                }
            }
        }
        return result.toString();
    }

}
//leetcode submit region end(Prohibit modification and deletion)

  }