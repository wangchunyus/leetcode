

//给你一个字符串 s ，由 n 个字符组成，每个字符不是 'X' 就是 'O' 。 
//
// 一次 操作 定义为从 s 中选出 三个连续字符 并将选中的每个字符都转换为 'O' 。注意，如果字符已经是 'O' ，只需要保持 不变 。 
//
// 返回将 s 中所有字符均转换为 'O' 需要执行的 最少 操作次数。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "XXX"
//输出：1
//解释：XXX -> OOO
//一次操作，选中全部 3 个字符，并将它们转换为 'O' 。
// 
//
// 示例 2： 
//
// 
//输入：s = "XXOX"
//输出：2
//解释：XXOX -> OOOX -> OOOO
//第一次操作，选择前 3 个字符，并将这些字符转换为 'O' 。
//然后，选中后 3 个字符，并执行转换。最终得到的字符串全由字符 'O' 组成。 
//
// 示例 3： 
//
// 
//输入：s = "OOOO"
//输出：0
//解释：s 中不存在需要转换的 'X' 。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= s.length <= 1000 
// s[i] 为 'X' 或 'O' 
// 
// Related Topics 贪心 字符串 👍 13 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 2027.转换字符串的最少操作次数.minimum-moves-to-convert-string
 *
 * @author wangcy
 * @since  2022-09-26 18:22:58
 **/

  public class Solution_2027{
      public static void main(String[] args) {

          Solution solution = new Solution_2027().new Solution();
          String s = "OXOX";
          int i = solution.minimumMoves(s);
          System.out.println(i);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumMoves(String s) {
        //输入：s = "XXX"
        //输出：1
        //解释：XXX -> OOO
        //一次操作，选中全部 3 个字符，并将它们转换为 'O' 。
        int count = 0;
        int p = 0;
        while (p < s.length()){
            if(s.charAt(p) == 'X'){
                count++;
                p+=3;
            }else {
                p++;
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }