

//给你个整数数组 arr，其中每个元素都 不相同。 
//
// 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。 
//
// 每对元素对 [a,b] 如下： 
//
// 
// a , b 均为数组 arr 中的元素 
// a < b 
// b - a 等于 arr 中任意两个元素的最小绝对差 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：arr = [4,2,1,3]
//输出：[[1,2],[2,3],[3,4]]
// 
//
// 示例 2： 
//
// 
//输入：arr = [1,3,6,10,15]
//输出：[[1,3]]
// 
//
// 示例 3： 
//
// 
//输入：arr = [3,8,-10,23,19,-4,-14,27]
//输出：[[-14,-10],[19,23],[23,27]]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= arr.length <= 10^5 
// -10^6 <= arr[i] <= 10^6 
// 
//
// Related Topics 数组 排序 👍 138 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1200.最小绝对差.minimum-absolute-difference
 *
 * @author wangcy
 * @since 2023-04-28 14:02:00
 **/

public class Solution_1200 {
    public static void main(String[] args) {
        Solution solution = new Solution_1200().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            int min = Integer.MAX_VALUE;
            Arrays.sort(arr);
            for (int i = 0; i < arr.length - 1; i++) {
                min = Math.min(min, arr[i+1] - arr[i]);
            }
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < arr.length-1; i++) {
                if (min == arr[i+1] - arr[i]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[i + 1]);
                    res.add(list);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}