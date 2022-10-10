

//给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [12,345,2,6,7896]
//输出：2
//解释：
//12 是 2 位数字（位数为偶数） 
//345 是 3 位数字（位数为奇数）  
//2 是 1 位数字（位数为奇数） 
//6 是 1 位数字 位数为奇数） 
//7896 是 4 位数字（位数为偶数）  
//因此只有 12 和 7896 是位数为偶数的数字
// 
//
// 示例 2： 
//
// 输入：nums = [555,901,482,1771]
//输出：1 
//解释： 
//只有 1771 是位数为偶数的数字。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 500 
// 1 <= nums[i] <= 10^5 
// 
// Related Topics 数组 👍 74 👎 0


package array数组.leetcode.editor.cn;

/**
 * 1295.统计位数为偶数的数字.find-numbers-with-even-number-of-digits
 *
 * @author wangcy
 * @since 2022-07-14 18:36:22
 **/

public class Solution_1295 {
    public static void main(String[] args) {
        Solution solution = new Solution_1295().new Solution();
        int[] num = {12, 345, 2, 6, 7896};
        int numbers = solution.findNumbers(num);
        System.out.println(numbers);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findNumbers(int[] nums) {
            int count = 0;
            for (int num : nums) {
                int i = 0;
                while (num > 0) {
                    i++;
                    num /= 10;
                }
                if (i % 2 == 0) {
                    count++;
                }
            }
            return count;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}