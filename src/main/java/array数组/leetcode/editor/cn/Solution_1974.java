

//有一个特殊打字机，它由一个 圆盘 和一个 指针 组成， 圆盘上标有小写英文字母 'a' 到 'z'。只有 当指针指向某个字母时，它才能被键入。指针 初始时 
//指向字符 'a' 。 
//
// 每一秒钟，你可以执行以下操作之一： 
//
// 
// 将指针 顺时针 或者 逆时针 移动一个字符。 
// 键入指针 当前 指向的字符。 
// 
//
// 给你一个字符串 word ，请你返回键入 word 所表示单词的 最少 秒数 。 
//
// 
//
// 示例 1： 
//
// 
//输入：word = "abc"
//输出：5
//解释：
//单词按如下操作键入：
//- 花 1 秒键入字符 'a' in 1 ，因为指针初始指向 'a' ，故不需移动指针。
//- 花 1 秒将指针顺时针移到 'b' 。
//- 花 1 秒键入字符 'b' 。
//- 花 1 秒将指针顺时针移到 'c' 。
//- 花 1 秒键入字符 'c' 。
// 
//
// 示例 2： 
//
// 
//输入：word = "bza"
//输出：7
//解释：
//单词按如下操作键入：
//- 花 1 秒将指针顺时针移到 'b' 。
//- 花 1 秒键入字符 'b' 。
//- 花 2 秒将指针逆时针移到 'z' 。
//- 花 1 秒键入字符 'z' 。
//- 花 1 秒将指针顺时针移到 'a' 。
//- 花 1 秒键入字符 'a' 。
// 
//
// 示例 3： 
//
// 
//输入：word = "zjpc"
//输出：34
//解释：
//单词按如下操作键入：
//- 花 1 秒将指针逆时针移到 'z' 。
//- 花 1 秒键入字符 'z' 。
//- 花 10 秒将指针顺时针移到 'j' 。
//- 花 1 秒键入字符 'j' 。
//- 花 6 秒将指针顺时针移到 'p' 。
//- 花 1 秒键入字符 'p' 。
//- 花 13 秒将指针逆时针移到 'c' 。
//- 花 1 秒键入字符 'c' 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= word.length <= 100 
// word 只包含小写英文字母。 
// 
// Related Topics 贪心 字符串 👍 10 👎 0


package array数组.leetcode.editor.cn;

/**
 * 1974.使用特殊打字机键入单词的最少时间.minimum-time-to-type-word-using-special-typewriter
 *
 * @author wangcy
 * @since 2022-07-31 16:45:29
 **/

public class Solution_1974 {
    public static void main(String[] args) {

        Solution solution = new Solution_1974().new Solution();
        String str ="abz";
        int i = solution.minTimeToType(str);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minTimeToType(String word) {
            int[] dp = new int[word.length()];
            int i1 = 26 + 'a';
            dp[0] = Math.min(word.charAt(0) - 'a', i1 - word.charAt(0)) + 1;
            for (int i = 1; i < word.length(); i++) {
                int abs1 = Math.abs(word.charAt(i) - word.charAt(i - 1));
                int i2 = 26 - Math.abs(word.charAt(i) - word.charAt(i - 1));
                dp[i] = Math.min(dp[i - 1] + abs1, dp[i - 1] + i2) + 1;
            }
            return dp[word.length() - 1];
        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}