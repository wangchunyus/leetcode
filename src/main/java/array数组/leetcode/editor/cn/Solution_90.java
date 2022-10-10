

//给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。 
//
// 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。 
//
// 
// 
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,2]
//输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
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
// 
// 
// 
// Related Topics 位运算 数组 回溯 👍 884 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 90.子集 II.subsets-ii
 *
 * @author wangcy
 * @since 2022-07-25 14:36:04
 **/

public class Solution_90 {
    public static void main(String[] args) {
        Solution solution = new Solution_90().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> track = new LinkedList<>();

        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            backTrack(nums, 0);
            return res;
        }
        private void backTrack(int[] nums, int start) {
            //每个节点都需要保存
            res.add(new LinkedList<>(track));
            //base case
            for (int i = start; i <nums.length ; i++) {
                if(i > start && nums[i-1] == nums[i]){
                    continue;
                }
                //选择前
                track.addLast(nums[i]);
                //下一个回溯树
                backTrack(nums,i+1);
                //选择后
                track.removeLast();
            }



        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}