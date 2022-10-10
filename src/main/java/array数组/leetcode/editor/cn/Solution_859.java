

//给你两个字符串 s 和 goal ，只要我们可以通过交换 s 中的两个字母得到与 goal 相等的结果，就返回 true ；否则返回 false 。 
//
// 交换字母的定义是：取两个下标 i 和 j （下标从 0 开始）且满足 i != j ，接着交换 s[i] 和 s[j] 处的字符。 
//
// 
// 例如，在 "abcd" 中交换下标 0 和下标 2 的元素可以生成 "cbad" 。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "ab", goal = "ba"
//输出：true
//解释：你可以交换 s[0] = 'a' 和 s[1] = 'b' 生成 "ba"，此时 s 和 goal 相等。 
//
// 示例 2： 
//
// 
//输入：s = "ab", goal = "ab"
//输出：false
//解释：你只能交换 s[0] = 'a' 和 s[1] = 'b' 生成 "ba"，此时 s 和 goal 不相等。 
//
// 示例 3： 
//
// 
//输入：s = "aa", goal = "aa"
//输出：true
//解释：你可以交换 s[0] = 'a' 和 s[1] = 'a' 生成 "aa"，此时 s 和 goal 相等。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length, goal.length <= 2 * 10⁴ 
// s 和 goal 由小写英文字母组成 
// 
// Related Topics 哈希表 字符串 👍 258 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashSet;

/**
 * 859.亲密字符串.buddy-strings
 *
 * @author wangcy
 * @since 2022-06-10 11:09:28
 **/

public class Solution_859 {
    public static void main(String[] args) {

        Solution solution = new Solution_859().new Solution();
        String s = "aaaaaaabc";
        String goal = "aaaaaaacb";
        boolean b = solution.buddyStrings(s, goal);
        System.out.println(b);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean buddyStrings(String s, String goal) {
            int n = s.length(), m = goal.length();
            if (n != m) return false;
            int[] cnt1 = new int[26], cnt2 = new int[26];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int a = s.charAt(i) - 'a', b = goal.charAt(i) - 'a';
                cnt1[a]++;
                cnt2[b]++;
                if (a != b) sum++;
            }
            boolean ok = false;
            for (int i = 0; i < 26; i++) {
                if (cnt1[i] != cnt2[i]) return false;
                if (cnt1[i] > 1) ok = true;
            }
            return sum == 2 || (sum == 0 && ok);
        }


}
//leetcode submit region end(Prohibit modification and deletion)

        }