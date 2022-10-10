

//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。 
//
// 请注意，你可以假定字符串里不包括任何不可打印的字符。 
//
// 示例: 
//
// 输入: "Hello, my name is John"
//输出: 5
//解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
// 
// Related Topics 字符串 👍 173 👎 0


package array数组.leetcode.editor.cn;

/**
 * 434.字符串中的单词数.number-of-segments-in-a-string
 *
 * @author wangcy
 * @since 2022-07-01 11:07:01
 **/

public class Solution_434 {
    public static void main(String[] args) {

        Solution solution = new Solution_434().new Solution();
        String s = ", , , ,        a, eaefa";
        int i = solution.countSegments(s);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countSegments(String s) {
            if(s == null || s.equals("")) return 0;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                    count++;
                }
            }

            return count;
        }

    }//leetcode submit region end(Prohibit modification and deletion)

}