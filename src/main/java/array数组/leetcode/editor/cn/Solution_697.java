

//给定一个非空且只包含非负数的整数数组 nums，数组的 度 的定义是指数组里任一元素出现频数的最大值。 
//
// 你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,2,3,1]
//输出：2
//解释：
//输入数组的度是 2 ，因为元素 1 和 2 的出现频数最大，均为 2 。
//连续子数组里面拥有相同度的有如下所示：
//[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
//最短连续子数组 [2, 2] 的长度为 2 ，所以返回 2 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,2,3,1,4,2]
//输出：6
//解释：
//数组的度是 3 ，因为元素 2 重复出现 3 次。
//所以 [2,2,3,1,4,2] 是最短子数组，因此返回 6 。
// 
//
// 
//
// 提示： 
//
// 
// nums.length 在 1 到 50,000 范围内。 
// nums[i] 是一个在 0 到 49,999 范围内的整数。 
// 
// Related Topics 数组 哈希表 👍 413 👎 0


package array数组.leetcode.editor.cn;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 697.数组的度.degree-of-an-array
 *
 * @author wangcy
 * @since 2022-06-08 15:38:31
 **/

public class Solution_697 {
    public static void main(String[] args) {

        Solution solution = new Solution_697().new Solution();
        int[] arr = {1,2,2,3,1,4,2};
        int shortestSubArray = solution.findShortestSubArray(arr);
        System.out.println(shortestSubArray);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findShortestSubArray(int[] nums) {
            int l = 0, r = 0, len = nums.length, res = len + 1;
            Map<Integer, Integer> map = new HashMap<>();
            int maxDegree = getDegree(nums);
            while (r < len) {
                map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
                r++;
                while (map.get(nums[r - 1]) == maxDegree) {
                    map.put(nums[l], map.get(nums[l]) - 1);
                    res = Math.min(res, r - l);
                    l++;
                }
            }
            return res;
        }

        public int getDegree(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int res = 0;
            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                res = Math.max(res, map.get(i));
            }
            return res;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}