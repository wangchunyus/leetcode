

//给定一个 无重复元素 的 有序 整数数组 nums 。 
//
// 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表 。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 
//nums 的数字 x 。 
//
// 列表中的每个区间范围 [a,b] 应该按如下格式输出： 
//
// 
// "a->b" ，如果 a != b 
// "a" ，如果 a == b 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [0,1,2,4,5,7]
//输出：["0->2","4->5","7"]
//解释：区间范围是：
//[0,2] --> "0->2"
//[4,5] --> "4->5"
//[7,7] --> "7"
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,2,3,4,6,8,9]
//输出：["0","2->4","6","8->9"]
//解释：区间范围是：
//[0,0] --> "0"
//[2,4] --> "2->4"
//[6,6] --> "6"
//[8,9] --> "8->9"
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 20 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// nums 中的所有值都 互不相同 
// nums 按升序排列 
// 
// Related Topics 数组 👍 216 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 228.汇总区间.summary-ranges
 *
 * @author wangcy
 * @since 2022-06-02 10:39:41
 **/

public class Solution_228 {
    public static void main(String[] args) {

        Solution solution = new Solution_228().new Solution();
        int[] nums = {0,2,3,4,6,8,9};
        solution.summaryRanges(nums);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> res = new ArrayList<>();
            // i 初始指向第 1 个区间的起始位置
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                // j 向后遍历，直到不满足连续递增(即 nums[j] + 1 != nums[j + 1])
                // 或者 j 达到数组边界，则当前连续递增区间 [i, j] 遍历完毕，将其写入结果列表。
                if (j + 1 == nums.length || nums[j] + 1 != nums[j + 1]) {
                    // 将当前区间 [i, j] 写入结果列表
                    StringBuilder sb = new StringBuilder();
                    sb.append(nums[i]);
                    if (i != j) {
                        sb.append("->").append(nums[j]);
                    }
                    res.add(sb.toString());
                    // 将 i 指向更新为 j + 1，作为下一个区间的起始位置
                    i = j + 1;
                }
            }
            return res;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}