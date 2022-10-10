

//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1]
//输出：[[0,1],[1,0]]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// nums 中的所有整数 互不相同 
// 
// Related Topics 数组 回溯 👍 2118 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 46.全排列.permutations
 *
 * @author wangcy
 * @since 2022-07-22 15:32:40
 **/

public class Solution_46 {
    public static void main(String[] args) {

        Solution solution = new Solution_46().new Solution();
        int[] ar ={1,2,3};
        solution.permute(ar);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        public List<List<Integer>> permute(int[] nums) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            backtrack(nums,linkedList);
            return res;
        }

        private void backtrack(int[] nums, LinkedList<Integer> linkedList) {
            if(linkedList.size() == nums.length){
                res.add(new LinkedList<>(linkedList));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if(linkedList.contains(nums[i])){
                    continue;
                }
                //选择前
                linkedList.add(nums[i]);
                //进入下一个节点
                backtrack(nums,linkedList);
                //选择后
                linkedList.removeLast();

            }
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

  }