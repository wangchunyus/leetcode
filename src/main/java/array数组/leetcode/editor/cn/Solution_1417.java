

//给你一个混合了数字和字母的字符串 s，其中的字母均为小写英文字母。 
//
// 请你将该字符串重新格式化，使得任意两个相邻字符的类型都不同。也就是说，字母后面应该跟着数字，而数字后面应该跟着字母。 
//
// 请你返回 重新格式化后 的字符串；如果无法按要求重新格式化，则返回一个 空字符串 。 
//
// 
//
// 示例 1： 
//
// 输入：s = "a0b1c2"
//输出："0a1b2c"
//解释："0a1b2c" 中任意两个相邻字符的类型都不同。 "a0b1c2", "0a1b2c", "0c2a1b" 也是满足题目要求的答案。
// 
//
// 示例 2： 
//
// 输入：s = "leetcode"
//输出：""
//解释："leetcode" 中只有字母，所以无法满足重新格式化的条件。
// 
//
// 示例 3： 
//
// 输入：s = "1229857369"
//输出：""
//解释："1229857369" 中只有数字，所以无法满足重新格式化的条件。
// 
//
// 示例 4： 
//
// 输入：s = "covid2019"
//输出："c2o0v1i9d"
// 
//
// 示例 5： 
//
// 输入：s = "ab123"
//输出："1a2b3"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 500 
// s 仅由小写英文字母和/或数字组成。 
// 
// Related Topics 字符串 👍 25 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1417.重新格式化字符串.reformat-the-string
 *
 * @author wangcy
 * @since  2022-07-18 17:24:55
 **/

  public class Solution_1417{
      public static void main(String[] args) {

          Solution solution = new Solution_1417().new Solution();
          String s = "a0b1c2";
          String reformat = solution.reformat(s);
          System.out.println(reformat);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reformat(String s) {
        Deque<Character> deque1 = new ArrayDeque<>();//字母
        Deque<Character> deque2 = new ArrayDeque<>();//数字
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if(Character.isLetter(aChar)){
                deque1.offer(aChar);
            }else{
                deque2.offer(aChar);
            }
        }
        int size1 = deque1.size();
        int size2 = deque2.size();
        if(Math.abs(size1-size2) > 1){
            return "";
        }
        StringBuffer buffer  = new StringBuffer();
        while (!deque1.isEmpty() || !deque2.isEmpty()){
            if(deque1.size() > deque2.size()){
                buffer.append(deque1.poll());
            }else {
                if(buffer.length() < 1){
                    buffer.append(deque2.poll());
                }else{
                    char c = buffer.charAt(buffer.length() - 1);
                    if(Character.isLetter(c)){
                        //最后一个是字符那就 删除 数字队列
                        buffer.append(deque2.poll());
                    }else{
                        buffer.append(deque1.poll());
                    }
                }
            }
        }
        return buffer.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }