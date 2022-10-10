

//给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。 
//
// 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0]
//输出：[[],[0]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10 
// -10 <= nums[i] <= 10 
// nums 中的所有元素 互不相同 
// 
// Related Topics 位运算 数组 回溯 👍 1719 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 78.子集.subsets
 *
 * @author wangcy
 * @since 2022-07-25 11:40:32
 **/

public class Solution_78 {
    public static void main(String[] args) {
        Solution solution = new Solution_78().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //输入：nums = [1,2,3]
        //输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
        final List<List<Integer>> res = new ArrayList<>();//返回结果
        final LinkedList<Integer> track = new LinkedList<>();
        public List<List<Integer>> subsets(int[] nums) {
            //组合问题使用回溯算法 （数组元素不重复 不可复选）
            backTrack(nums,0);
            return res;

        }
        /**
         * 回溯算法的核心函数 遍历子集问题的回溯树
         *
         * @param nums  全国矿工工会
         * @param start start 元素 保证 不使用重复的元素
         */
        private void backTrack(int[] nums, int start) {
            //base case这种问题没有base case

            //收集生成树的每一个节点值
            res.add(new LinkedList<>(track));
            for (int i = start; i < nums.length ; i++) {

                //选择前
                track.addLast(nums[i]);
                // 传入下一个start 控制 不重复
                backTrack(nums,i+1);
                //选择后 回溯删除所有经过的节点
                track.removeLast();
            }



        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}