

//给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,2]
//输出：
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 8 
// -10 <= nums[i] <= 10 
// 
// Related Topics 数组 回溯 👍 1140 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 47.全排列 II.permutations-ii
 *
 * @author wangcy
 * @since 2022-07-26 10:55:43
 **/

public class Solution_47 {
    public static void main(String[] args) {
        Solution solution = new Solution_47().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //输入：nums = [1,1,2]
        //输出：
        //[[1,1,2],
        // [1,2,1],
        // [2,1,1]]
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> track = new LinkedList<>();
        boolean[] u;
        public List<List<Integer>> permuteUnique(int[] nums) {
            if(nums.length == 0){
                return res;
            }
            Arrays.sort(nums);
            u = new boolean[nums.length];
            backTrack(nums);
            return res;

        }
        private void backTrack(int[] nums ) {
            //base case
            if(track.size() == nums.length){
                res.add(new LinkedList<>(track));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if(u[i]){
                    continue;
                }
                if(i > 0 && nums[i-1] == nums[i] && !u[i-1]){
                    continue;
                }
                //选择前
                u[i] = true;
                track.addLast(nums[i]);
                //递归回溯树
                backTrack(nums);
                //选择后
                track.removeLast();
                u[i] = false;
            }


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}