

//键盘出现了一些故障，有些字母键无法正常工作。而键盘上所有其他键都能够正常工作。 
//
// 给你一个由若干单词组成的字符串 text ，单词间由单个空格组成（不含前导和尾随空格）；另有一个字符串 brokenLetters ，由所有已损坏的不同字
//母键组成，返回你可以使用此键盘完全输入的 text 中单词的数目。 
//
// 
//
// 示例 1： 
//
// 输入：text = "hello world", brokenLetters = "ad"
//输出：1
//解释：无法输入 "world" ，因为字母键 'd' 已损坏。
// 
//
// 示例 2： 
//
// 输入：text = "leet code", brokenLetters = "lt"
//输出：1
//解释：无法输入 "leet" ，因为字母键 'l' 和 't' 已损坏。
// 
//
// 示例 3： 
//
// 输入：text = "leet code", brokenLetters = "e"
//输出：0
//解释：无法输入任何单词，因为字母键 'e' 已损坏。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10⁴ 
// 0 <= brokenLetters.length <= 26 
// text 由若干用单个空格分隔的单词组成，且不含任何前导和尾随空格 
// 每个单词仅由小写英文字母组成 
// brokenLetters 由 互不相同 的小写英文字母组成 
// 
// Related Topics 哈希表 字符串 👍 15 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashSet;

/**
 * 1935.可以输入的最大单词数.maximum-number-of-words-you-can-type
 *
 * @author wangcy
 * @since 2022-08-09 14:45:16
 **/

public class Solution_1935 {
    public static void main(String[] args) {

        Solution solution = new Solution_1935().new Solution();
        String text = "leet code";
        String brokenLetters = "e";
        int i = solution.canBeTypedWords(text, brokenLetters);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int canBeTypedWords(String text, String brokenLetters) {
            // 输入：text = "hello world", brokenLetters = "ad"
            //输出：1
            //解释：无法输入 "world" ，因为字母键 'd' 已损坏。
            String[] split = text.split(" ");
            HashSet<Character> hashSet = new HashSet<>();
            for (int i = 0; i < brokenLetters.length(); i++) {
                hashSet.add(brokenLetters.charAt(i));
            }
            int count = 0;
            for (String s : split) {
                boolean flag = false;
                for (int i = 0; i < s.length(); i++) {
                    if (hashSet.contains(s.charAt(i))) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    count++;
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}