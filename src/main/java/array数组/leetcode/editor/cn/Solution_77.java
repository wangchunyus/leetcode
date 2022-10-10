

//给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。 
//
// 你可以按 任何顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4, k = 2
//输出：
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
//
// 示例 2： 
//
// 
//输入：n = 1, k = 1
//输出：[[1]] 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
// Related Topics 回溯 👍 1062 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 77.组合.combinations
 *
 * @author wangcy
 * @since 2022-07-25 14:22:31
 **/

public class Solution_77 {
    public static void main(String[] args) {
        Solution solution = new Solution_77().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //输入：n = 4, k = 2
        //输出：
        //[
        //  [2,4],
        //  [3,4],
        //  [2,3],
        //  [1,2],
        //  [1,3],
        //  [1,4],
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> track = new LinkedList<>();
        public List<List<Integer>> combine(int n, int k) {
            backTrack(n, 1, k);
            return res;
        }
        private void backTrack(int n, int start, int k) {
            //base case
            if(k == track.size()){
                res.add(new LinkedList<>(track));
                return;
            }
            for (int i = start; i <=n ; i++) {
                //选择前
                track.addLast(i);
                //递归
                backTrack(n,i+1,k);
                //选择后
                track.removeLast();
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}