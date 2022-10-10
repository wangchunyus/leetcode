

//给定两个字符串, s 和 goal。如果在若干次旋转操作之后，s 能变成 goal ，那么返回 true 。 
//
// s 的 旋转操作 就是将 s 最左边的字符移动到最右边。 
//
// 
// 例如, 若 s = 'abcde'，在旋转一次之后结果就是'bcdea' 。 
// 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcde", goal = "cdeab"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "abcde", goal = "abced"
//输出: false
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, goal.length <= 100 
// s 和 goal 由小写英文字母组成 
// 
// Related Topics 字符串 字符串匹配 👍 259 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 796.旋转字符串.rotate-string
 *
 * @author wangcy
 * @since 2022-07-04 15:48:02
 **/

public class Solution_796 {
    public static void main(String[] args) {

        Solution solution = new Solution_796().new Solution();
        String s = "abcde";
        String goal = "abced";
        boolean b = solution.rotateString(s, goal);
        System.out.println(b);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean rotateString(String s, String goal) {
            if (s == null || s.equals("") || (s.length() != goal.length())) return false;
            String resuleStr = s;
            for (int i = 0; i < s.length(); i++) {
                String reStr = revolveStr(resuleStr);
                if(reStr.equals(goal)){
                    return true;
                }
                resuleStr = reStr;
            }
            return false;
        }

        private String revolveStr(String s) {
            StringBuffer stringBuffer = new StringBuffer();
            char[] chars = s.toCharArray();
            for (int i = 1; i < chars.length; i++) {
                stringBuffer.append(chars[i]);
            }
            stringBuffer.append(chars[0]);
            return stringBuffer.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}