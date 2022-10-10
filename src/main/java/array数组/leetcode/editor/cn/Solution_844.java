

//给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。 
//
// 注意：如果对空文本输入退格字符，文本继续为空。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "ab#c", t = "ad#c"
//输出：true
//解释：s 和 t 都会变成 "ac"。
// 
//
// 示例 2： 
//
// 
//输入：s = "ab##", t = "c#d#"
//输出：true
//解释：s 和 t 都会变成 ""。
// 
//
// 示例 3： 
//
// 
//输入：s = "a#c", t = "b"
//输出：false
//解释：s 会变成 "c"，但 t 仍然是 "b"。 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length, t.length <= 200 
// s 和 t 只含有小写字母以及字符 '#' 
// 
//
// 
//
// 进阶： 
//
// 
// 你可以用 O(n) 的时间复杂度和 O(1) 的空间复杂度解决该问题吗？ 
// 
// Related Topics 栈 双指针 字符串 模拟 👍 454 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 844.比较含退格的字符串.backspace-string-compare
 *
 * @author wangcy
 * @since 2022-07-05 14:48:42
 **/

public class Solution_844 {
    public static void main(String[] args) {

        Solution solution = new Solution_844().new Solution();
        String s = "y#fo##f";
        String t = "y#f#o##f";
        boolean b = solution.backspaceCompare(s, t);
        System.out.println(b);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            Deque<Character> deque1 = new ArrayDeque<>();
            Deque<Character> deque2 = new ArrayDeque<>();
            char[] chars1 = s.toCharArray();
            char[] chars2 = t.toCharArray();
            for (char c : chars1) {
                if (!deque1.isEmpty() && c == '#') {
                    deque1.pollLast();
                } else if (deque1.isEmpty() && c == '#') {
                    continue;
                } else {
                    deque1.add(c);

                }
            }
            for (char c : chars2) {
                if (!deque2.isEmpty() && c == '#') {
                    deque2.pollLast();
                }else if (deque2.isEmpty() && c == '#'){
                    continue;
                }
                else {
                    deque2.add(c);
                }
            }
            if (deque1.size() != deque2.size()) return false;
            while (!deque1.isEmpty()) {
                if (deque1.pop() != deque2.pop()) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}