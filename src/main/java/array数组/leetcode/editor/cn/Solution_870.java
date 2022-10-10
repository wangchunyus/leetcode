

//给定两个大小相等的数组 nums1 和 nums2，nums1 相对于 nums 的优势可以用满足 nums1[i] > nums2[i] 的索引 i 的数
//目来描述。 
//
// 返回 nums1 的任意排列，使其相对于 nums2 的优势最大化。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [2,7,11,15], nums2 = [1,10,4,11]
//输出：[2,11,7,15]
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [12,24,8,32], nums2 = [13,25,32,11]
//输出：[24,32,8,12]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums1.length <= 10⁵ 
// nums2.length == nums1.length 
// 0 <= nums1[i], nums2[i] <= 10⁹ 
// 
// Related Topics 贪心 数组 排序 👍 194 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 870.优势洗牌.advantage-shuffle
 *
 * @author wangcy
 * @since 2022-08-09 10:34:18
 **/

public class Solution_870 {
    public static void main(String[] args) {

        Solution solution = new Solution_870().new Solution();
        int[] nums1 = {718967141,189971378,341560426,23521218,339517772};
        int[] nums2 = {967482459,978798455,744530040,3454610,940238504};
        solution.advantageCount(nums1,nums2);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] advantageCount(int[] nums1, int[] nums2) {
            //输入：nums1 = [2,7,11,15], nums2 = [1,10,4,11]
            //输出：[2,11,7,15]
            int length = nums2.length;
            PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o2[1] - o1[1];
                }
            });
            //将nums2 放入大顶堆中排序
            for (int i = 0; i < length; i++) {
                queue.offer(new int[]{i, nums2[i]});
            }
            int left = 0;
            int right = length - 1;
            int[] res = new int[length];
            Arrays.sort(nums1);
            while (!queue.isEmpty()) {
                //获取大顶堆中的第一个数据
                int[] poll = queue.poll();
                int i = poll[0];
                int max = poll[1];
                if (nums1[right] > max) {
                    //num1中最大的数 大于 num2中的最大的数 ， 那就直接比拼
                    res[i] = nums1[right];
                    right--;
                } else {
                    //num1中最大的数 小于 num2中的最大的数 ，那就用最小的数跟他比拼
                    res[i] = nums1[left];
                    left++;
                }

            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}