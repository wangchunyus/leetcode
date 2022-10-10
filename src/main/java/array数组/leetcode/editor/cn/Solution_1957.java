

//一个字符串如果没有 三个连续 相同字符，那么它就是一个 好字符串 。 
//
// 给你一个字符串 s ，请你从 s 删除 最少 的字符，使它变成一个 好字符串 。 
//
// 请你返回删除后的字符串。题目数据保证答案总是 唯一的 。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "leeetcode"
//输出："leetcode"
//解释：
//从第一组 'e' 里面删除一个 'e' ，得到 "leetcode" 。
//没有连续三个相同字符，所以返回 "leetcode" 。
// 
//
// 示例 2： 
//
// 
//输入：s = "aaabaaaa"
//输出："aabaa"
//解释：
//从第一组 'a' 里面删除一个 'a' ，得到 "aabaaaa" 。
//从第二组 'a' 里面删除两个 'a' ，得到 "aabaa" 。
//没有连续三个相同字符，所以返回 "aabaa" 。
// 
//
// 示例 3： 
//
// 
//输入：s = "aab"
//输出："aab"
//解释：没有连续三个相同字符，所以返回 "aab" 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁵ 
// s 只包含小写英文字母。 
// 
// Related Topics 字符串 👍 17 👎 0


package array数组.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 1957.删除字符使字符串变好.delete-characters-to-make-fancy-string
 *
 * @author wangcy
 * @since 2022-08-09 14:04:56
 **/

public class Solution_1957 {
    public static void main(String[] args) {

        Solution solution = new Solution_1957().new Solution();
        String s = "aaabaaaa";
        String s1 = solution.makeFancyString(s);
        System.out.println(s1);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String makeFancyString(String s) {
            //输入：s = "leeetcode"
            //输出："leetcode"
            //解释：
            //从第一组 'e' 里面删除一个 'e' ，得到 "leetcode" 。
            //没有连续三个相同字符，所以返回 "leetcode" 。
            Stack<Character> stack = new Stack<>();
            int length = s.length();
            int count = 1;
            for (int i = 0; i < length; i++) {
               if(!stack.isEmpty()){
                   Character peek = stack.peek();
                   if(s.charAt(i) == peek){
                       count++;
                   }else{
                       count = 1;
                   }
                   if(count == 3){
                       stack.pop();
                       count--;
                   }
               }
               stack.push(s.charAt(i));
            }
            StringBuffer buffer = new StringBuffer();
            while (!stack.isEmpty()) {
                buffer.append(stack.pop());
            }
            return buffer.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}