

//由范围 [0,n] 内所有整数组成的 n + 1 个整数的排列序列可以表示为长度为 n 的字符串 s ，其中: 
//
// 
// 如果 perm[i] < perm[i + 1] ，那么 s[i] == 'I' 
// 如果 perm[i] > perm[i + 1] ，那么 s[i] == 'D' 
// 
//
// 给定一个字符串 s ，重构排列 perm 并返回它。如果有多个有效排列perm，则返回其中 任何一个 。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "IDID"
//输出：[0,4,1,3,2]
// 
//
// 示例 2： 
//
// 
//输入：s = "III"
//输出：[0,1,2,3]
// 
//
// 示例 3： 
//
// 
//输入：s = "DDI"
//输出：[3,2,0,1] 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁵ 
// s 只包含字符 "I" 或 "D" 
// 
// Related Topics 贪心 数组 数学 双指针 字符串 👍 393 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 942.增减字符串匹配.di-string-match
 *
 * @author wangcy
 * @since  2022-07-06 14:14:06
 **/

  public class Solution_942{
      public static void main(String[] args) {
           Solution solution = new Solution_942().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] diStringMatch(String s) {
        // 如果 perm[i] < perm[i + 1] ，那么 s[i] == 'I'
        // 如果 perm[i] > perm[i + 1] ，那么 s[i] == 'D'
        //输入：s = "IDID"
        //输出：[0,4,1,3,2]
        int length = s.length();
        int left = 0;
        int right = length;
        int[] ints = new int[length + 1];
        char[] chars = s.toCharArray();
        for (int i = 0; i < length; ++i) {
            if(chars[i] == 'I') {
                ints[i] = left;
                left++;
            }else{
                ints[i] = right;
                right--;
            }
        }
        ints[length] = left;
        return ints;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }