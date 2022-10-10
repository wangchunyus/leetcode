

//给你一个字符串 s 和一个 长度相同 的整数数组 indices 。 
//
// 请你重新排列字符串 s ，其中第 i 个字符需要移动到 indices[i] 指示的位置。 
//
// 返回重新排列后的字符串。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//输出："leetcode"
//解释：如图所示，"codeleet" 重新排列后变为 "leetcode" 。
// 
//
// 示例 2： 
//
// 
//输入：s = "abc", indices = [0,1,2]
//输出："abc"
//解释：重新排列后，每个字符都还留在原来的位置上。
// 
//
// 
//
// 提示： 
//
// 
// s.length == indices.length == n 
// 1 <= n <= 100 
// s 仅包含小写英文字母 
// 0 <= indices[i] < n 
// indices 的所有的值都是 唯一 的 
// 
// Related Topics 数组 字符串 👍 45 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1528.重新排列字符串.shuffle-string
 *
 * @author wangcy
 * @since  2022-07-15 14:18:59
 **/

  public class Solution_1528{
      public static void main(String[] args) {

          Solution solution = new Solution_1528().new Solution();
          String s = "codeleet";
          int[] ar = {4,5,6,7,0,2,1,3};
          String s1 = solution.restoreString(s, ar);
          System.out.println(s1);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String restoreString(String s, int[] indices) {

        //输入：s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        //输出："leetcode"
        //解释：如图所示，"codeleet" 重新排列后变为 "leetcode" 。
        HashMap<Integer, Character> hashMap = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            hashMap.put(indices[i],s.charAt(i));
        }
        StringBuffer buffer = new StringBuffer();
        Arrays.sort(indices);
        for (int index : indices) {
            buffer.append(hashMap.get(index));
        }
        return buffer.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }