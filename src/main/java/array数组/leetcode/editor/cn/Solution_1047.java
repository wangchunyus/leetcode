

//给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。 
//
// 在 S 上反复执行重复项删除操作，直到无法继续删除。 
//
// 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。 
//
// 
//
// 示例： 
//
// 输入："abbaca"
//输出："ca"
//解释：
//例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又
//只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= S.length <= 20000 
// S 仅由小写英文字母组成。 
// 
// Related Topics 栈 字符串 👍 396 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 1047.删除字符串中的所有相邻重复项.remove-all-adjacent-duplicates-in-string
 *
 * @author wangcy
 * @since  2022-06-23 10:43:33
 **/

  public class Solution_1047{
      public static void main(String[] args) {

          Solution solution = new Solution_1047().new Solution();
          String str = solution.removeDuplicates("abbaca");
          System.out.println(str);

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String s) {
        if(s ==  null || s.equals("") ){
            return null;
        }
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(deque.isEmpty()){
                deque.add(chars[i]);
            }else{
                //获取队列的最后一个元素
                Character topE = deque.peekLast();
                if(chars[i]==topE){
                    deque.removeLast();//删除最后一个元素
                }else{
                    deque.add(chars[i]);
                }
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!deque.isEmpty()){
            stringBuffer.append(deque.pop());
        }
        return stringBuffer.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }