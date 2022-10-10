

//给你一个整数数组 nums 和一个整数 k 。你需要找到 nums 中长度为 k 的 子序列 ，且这个子序列的 和最大 。 
//
// 请你返回 任意 一个长度为 k 的整数子序列。 
//
// 子序列 定义为从一个数组里删除一些元素后，不改变剩下元素的顺序得到的数组。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [2,1,3,3], k = 2
//输出：[3,3]
//解释：
//子序列有最大和：3 + 3 = 6 。 
//
// 示例 2： 
//
// 输入：nums = [-1,-2,3,4], k = 3
//输出：[-1,3,4]
//解释：
//子序列有最大和：-1 + 3 + 4 = 6 。
// 
//
// 示例 3： 
//
// 输入：nums = [3,4,3,3], k = 2
//输出：[3,4]
//解释：
//子序列有最大和：3 + 4 = 7 。
//另一个可行的子序列为 [4, 3] 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 1000 
// -10⁵ <= nums[i] <= 10⁵ 
// 1 <= k <= nums.length 
// 
// Related Topics 数组 哈希表 排序 堆（优先队列） 👍 25 👎 0


package array数组.leetcode.editor.cn;

import java.util.*;

/**
 * 2099.找到和最大的长度为 K 的子序列.find-subsequence-of-length-k-with-the-largest-sum
 *
 * @author wangcy
 * @since  2022-10-02 09:35:43
 **/

  public class Solution_2099{
      public static void main(String[] args) {

          Solution solution = new Solution_2099().new Solution();
          int[] nums = {-1,-2,3,4};
          int k = 3;
          int[] ints = solution.maxSubsequence(nums, k);
          for (int anInt : ints) {
              System.out.println(anInt);
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        // 输入：nums = [2,1,3,3], k = 2
        //输出：[3,3]
        //解释：
        //子序列有最大和：3 + 3 = 6 。
        int[] res = new int[k];
        PriorityQueue<Pair> priorityQueue =new PriorityQueue<>(k, (a,b)-> b.value-a.value);
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(new Pair(i,nums[i]));
        }
        PriorityQueue<Pair> priorityQueue2 =new PriorityQueue<>(k, Comparator.comparingInt(a->a.index));
        for (int i = 0; i < k; i++) {
            if(!priorityQueue.isEmpty()){
                priorityQueue2.add(priorityQueue.poll());

            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = priorityQueue2.poll().getValue();
        }
        return  res;
    }

    class Pair{
        private  int index;
        private  int value;

        public Pair() {
        }

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public int getIndex() {
            return index;
        }
        public void setIndex(int index) {
            this.index = index;
        }

        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }