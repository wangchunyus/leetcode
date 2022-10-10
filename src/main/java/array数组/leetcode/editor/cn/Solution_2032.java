

//给你三个整数数组 nums1、nums2 和 nums3 ，请你构造并返回一个 元素各不相同的 数组，且由 至少 在 两个 数组中出现的所有值组成。数组中的
//元素可以按 任意 顺序排列。
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
//输出：[3,2]
//解释：至少在两个数组中出现的所有值为：
//- 3 ，在全部三个数组中都出现过。
//- 2 ，在数组 nums1 和 nums2 中出现过。
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
//输出：[2,3,1]
//解释：至少在两个数组中出现的所有值为：
//- 2 ，在数组 nums2 和 nums3 中出现过。
//- 3 ，在数组 nums1 和 nums2 中出现过。
//- 1 ，在数组 nums1 和 nums3 中出现过。
// 
//
// 示例 3： 
//
// 
//输入：nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
//输出：[]
//解释：不存在至少在两个数组中出现的值。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums1.length, nums2.length, nums3.length <= 100 
// 1 <= nums1[i], nums2[j], nums3[k] <= 100 
// 
// Related Topics 数组 哈希表 👍 18 👎 0


package array数组.leetcode.editor.cn;

import java.util.*;

/**
 * 2032.至少在两个数组中出现的值.two-out-of-three
 *
 * @author wangcy
 * @since 2022-09-27 10:44:34
 **/

public class Solution_2032 {
    public static void main(String[] args) {

        Solution solution = new Solution_2032().new Solution();
        int[] n1 = {1, 2, 2};
        int[] n2 = {4, 3, 3};
        int[] n3 = {5};
        List<Integer> list = solution.twoOutOfThree(n1, n2, n3);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            List<Integer> res = new ArrayList<>();
            int[] cache = new int[101];
            for (int x : nums1) {
                cache[x] = 1;
            }
            for (int x : nums2) {
                if (cache[x] <= 1) {
                    cache[x] += 1;
                    cache[x] <<= 1;
                    if (cache[x] == 4) res.add(x);
                }

            }
            for (int x : nums3) {
                if (cache[x] == 1 || cache[x] == 2) {
                    cache[x] += 4;
                    res.add(x);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}