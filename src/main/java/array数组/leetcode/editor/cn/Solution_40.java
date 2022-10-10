

//给定一个候选人编号的集合 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。 
//
// candidates 中的每个数字在每个组合中只能使用 一次 。 
//
// 注意：解集不能包含重复的组合。 
//
// 
//
// 示例 1: 
//
// 
//输入: candidates = [10,1,2,7,6,1,5], target = 8,
//输出:
//[
//[1,1,6],
//[1,2,5],
//[1,7],
//[2,6]
//] 
//
// 示例 2: 
//
// 
//输入: candidates = [2,5,2,1,2], target = 5,
//输出:
//[
//[1,2,2],
//[5]
//] 
//
// 
//
// 提示: 
//
// 
// 1 <= candidates.length <= 100 
// 1 <= candidates[i] <= 50 
// 1 <= target <= 30 
// 
// Related Topics 数组 回溯 👍 1046 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 40.组合总和 II.combination-sum-ii
 *
 * @author wangcy
 * @since 2022-07-26 10:05:47
 **/

public class Solution_40 {
    public static void main(String[] args) {
        Solution solution = new Solution_40().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> track = new LinkedList<>();
        int sum = 0;

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            if (candidates.length == 0) {
                return res;
            }
            Arrays.sort(candidates);
            backTrack(candidates, 0, target);
            return res;
        }
        private void backTrack(int[] candidates, int start, int target) {
            //base case
            if (sum == target) {
                res.add(new LinkedList<>(track));
            }
            if(sum > target){
                return;
            }
            for (int j = start; j < candidates.length; j++) {
                  //去重
                if(j > start && candidates[j-1] == candidates[j]){
                    continue;
                }
                //选择前
                sum+=candidates[j];
                track.addLast(candidates[j]);
                //递归回溯树
                backTrack(candidates,j+1,target);
                //选择后
                track.removeLast();
                sum-=candidates[j];
            }


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}