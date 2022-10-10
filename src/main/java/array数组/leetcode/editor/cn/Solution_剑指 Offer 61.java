


//从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，
//可以看成任意数字。A 不能视为 14。 
//
// 
//
// 示例 1: 
//
// 
//输入: [1,2,3,4,5]
//输出: True 
//
// 
//
// 示例 2: 
//
// 
//输入: [0,0,1,2,5]
//输出: True 
//
// 
//
// 限制： 
//
// 数组长度为 5 
//
// 数组的数取值为 [0, 13] . 
// Related Topics 数组 排序 👍 249 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashSet;

/**
 * 剑指 Offer 61.扑克牌中的顺子.bu-ke-pai-zhong-de-shun-zi-lcof
 *
 * @author wangcy
 * @since  2022-06-24 10:22:56
 **/

 class Offer_61{
      public static void main(String[] args) {
           Solution solution = new Offer_61().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isStraight(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for (int num : nums) {
            if(num == 0) continue;
            if(set.contains(num)) return false;
            set.add(num);
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        return max-min<5;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }