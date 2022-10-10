

//全字母句 指包含英语字母表中每个字母至少一次的句子。 
//
// 给你一个仅由小写英文字母组成的字符串 sentence ，请你判断 sentence 是否为 全字母句 。 
//
// 如果是，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：sentence = "thequickbrownfoxjumpsoverthelazydog"
//输出：true
//解释：sentence 包含英语字母表中每个字母至少一次。
// 
//
// 示例 2： 
//
// 
//输入：sentence = "leetcode"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= sentence.length <= 1000 
// sentence 由小写英语字母组成 
// 
// Related Topics 哈希表 字符串 👍 26 👎 0


package array数组.leetcode.editor.cn;

/**
 * 1832.判断句子是否为全字母句.check-if-the-sentence-is-pangram
 *
 * @author wangcy
 * @since 2022-08-15 10:56:24
 **/

public class Solution_1832 {
    public static void main(String[] args) {

        Solution solution = new Solution_1832().new Solution();
        String s ="thequickbrownfoxjumpsoverthelazydog";
        boolean b = solution.checkIfPangram(s);
        System.out.println(b);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkIfPangram(String sentence) {
            int[] res = new int[26];
            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                int i1 = c - 'a';
                res[i1]++;
            }
            for (int re : res) {
                if (re < 1) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}