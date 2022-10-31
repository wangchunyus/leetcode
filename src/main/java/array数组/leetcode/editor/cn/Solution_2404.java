

//给你一个整数数组 nums ，返回出现最频繁的偶数元素。 
//
// 如果存在多个满足条件的元素，只需要返回 最小 的一个。如果不存在这样的元素，返回 -1 。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [0,1,2,2,4,4,1]
//输出：2
//解释：
//数组中的偶数元素为 0、2 和 4 ，在这些元素中，2 和 4 出现次数最多。
//返回最小的那个，即返回 2 。 
//
// 示例 2： 
//
// 输入：nums = [4,4,4,9,2,4]
//输出：4
//解释：4 是出现最频繁的偶数元素。
// 
//
// 示例 3： 
//
// 输入：nums = [29,47,21,41,13,37,25,7]
//输出：-1
//解释：不存在偶数元素。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 2000 
// 0 <= nums[i] <= 10⁵ 
// 
//
// Related Topics 数组 哈希表 计数 👍 13 👎 0


package array数组.leetcode.editor.cn;

/**
 * 2404.出现最频繁的偶数元素.most-frequent-even-element
 *
 * @author wangcy
 * @since 2022-10-31 16:09:58
 **/

public class Solution_2404 {
    public static void main(String[] args) {
        Solution solution = new Solution_2404().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int mostFrequentEven(int[] nums) {
            int max = 0;
            //桶
            int[] con = new int[50001];
            int tmp = 0;
            for (int num : nums) {
                if (num % 2 == 0) {
                    //减少空间占用，忽略奇数
                    con[num / 2]++;
                    //最大前缀值
                    if (con[num / 2] > max) {
                        tmp = num;
                        max = con[num / 2];
                    }
                    if (con[num / 2] == max && tmp > num) {
                        tmp = num;
                    }
                }
            }
            if (max == 0)
                return -1;
            return tmp;
        }


}
//leetcode submit region end(Prohibit modification and deletion)

  }