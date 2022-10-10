

//给你一个由若干 0 和 1 组成的字符串 s ，请你计算并返回将该字符串分割成两个 非空 子字符串（即 左 子字符串和 右 子字符串）所能获得的最大得分。 
//
//
// 「分割字符串的得分」为 左 子字符串中 0 的数量加上 右 子字符串中 1 的数量。 
//
// 
//
// 示例 1： 
//
// 输入：s = "011101"
//输出：5 
//解释：
//将字符串 s 划分为两个非空子字符串的可行方案有：
//左子字符串 = "0" 且 右子字符串 = "11101"，得分 = 1 + 4 = 5 
//左子字符串 = "01" 且 右子字符串 = "1101"，得分 = 1 + 3 = 4 
//左子字符串 = "011" 且 右子字符串 = "101"，得分 = 1 + 2 = 3 
//左子字符串 = "0111" 且 右子字符串 = "01"，得分 = 1 + 1 = 2 
//左子字符串 = "01110" 且 右子字符串 = "1"，得分 = 2 + 1 = 3
// 
//
// 示例 2： 
//
// 输入：s = "00111"
//输出：5
//解释：当 左子字符串 = "00" 且 右子字符串 = "111" 时，我们得到最大得分 = 2 + 3 = 5
// 
//
// 示例 3： 
//
// 输入：s = "1111"
//输出：3
// 
//
// 
//
// 提示： 
//
// 
// 2 <= s.length <= 500 
// 字符串 s 仅由字符 '0' 和 '1' 组成。 
// 
// Related Topics 字符串 👍 34 👎 0


package array数组.leetcode.editor.cn;

/**
 * 1422.分割字符串的最大得分.maximum-score-after-splitting-a-string
 *
 * @author wangcy
 * @since 2022-07-15 14:29:03
 **/

public class Solution_1422 {
    public static void main(String[] args) {
        Solution solution = new Solution_1422().new Solution();
        String s = "110000";
        int i = solution.maxScore(s);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxScore(String s) {
            // 输入：s = "011101"
            //输出：5
            //解释：
            //将字符串 s 划分为两个非空子字符串的可行方案有：
            //左子字符串 = "0" 且 右子字符串 = "11101"，得分 = 1 + 4 = 5
            //左子字符串 = "01" 且 右子字符串 = "1101"，得分 = 1 + 3 = 4
            //左子字符串 = "011" 且 右子字符串 = "101"，得分 = 1 + 2 = 3
            //左子字符串 = "0111" 且 右子字符串 = "01"，得分 = 1 + 1 = 2
            //左子字符串 = "01110" 且 右子字符串 = "1"，得分 = 2 + 1 = 3
            int p = 1;
            int max = 0;
            while (p < s.length()) {
                int leftscore = 0;
                int rightscore = 0;
                    //计算左边的得分
                    for (int i = 0; i < p; i++) {
                        if (s.charAt(i) == '0') {
                            leftscore++;
                        }
                    }
                    //计算右边的得分
                    for (int i = p; i < s.length(); i++) {
                        if (s.charAt(i) == '1') {
                            rightscore++;
                        }
                    }
                max = Math.max(max, leftscore + rightscore);
                p++;
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    }