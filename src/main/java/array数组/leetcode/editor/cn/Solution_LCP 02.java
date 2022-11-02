


//有一个同学在学习分式。他需要将一个连分数化成最简分数，你能帮助他吗？ 
//
// 
//
// 连分数是形如上图的分式。在本题中，所有系数都是大于等于0的整数。 
//
// 
//
// 输入的cont代表连分数的系数（cont[0]代表上图的a0，以此类推）。返回一个长度为2的数组[n, m]，使得连分数的值等于n / m，且n, m最大
//公约数为1。 
//
// 
//
// 示例 1： 
//
// 
//输入：cont = [3, 2, 0, 2]
//输出：[13, 4]
//解释：原连分数等价于3 + (1 / (2 + (1 / (0 + 1 / 2))))。注意[26, 8], [-13, -4]都不是正确答案。 
//
// 示例 2： 
//
// 
//输入：cont = [0, 0, 3]
//输出：[3, 1]
//解释：如果答案是整数，令分母为1即可。 
//
// 
//
// 限制： 
//
// 
// cont[i] >= 0 
// 1 <= cont的长度 <= 10 
// cont最后一个元素不等于0 
// 答案的n, m的取值都能被32位int整型存下（即不超过2 ^ 31 - 1）。 
// 
//
// Related Topics 数组 数学 数论 模拟 👍 111 👎 0


package array数组.leetcode.editor.cn;

/**
 * LCP 02.分式化简.deep-dark-fraction
 *
 * @author wangcy
 * @since 2022-11-02 17:05:42
 **/

class LCP_02 {
    public static void main(String[] args) {
        Solution solution = new LCP_02().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] fraction(int[] cont) {
            int[] ans = {0, 1};
            for (int i = cont.length - 1; i >= 0; i--)
                ans = addAndInverse(ans, cont[i]);
            return inverse(ans);
        }

        int[] addAndInverse(int[] frac, int x) {
            frac[0] += frac[1] * x;
            int g = gcd(frac[0], frac[1]);
            frac[0] /= g;
            frac[1] /= g;
            return inverse(frac);
        }

        int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        int[] inverse(int[] frac) {
            int temp = frac[0];
            frac[0] = frac[1];
            frac[1] = temp;
            return frac;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}