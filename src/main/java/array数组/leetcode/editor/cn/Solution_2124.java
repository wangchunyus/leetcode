

//给你一个 仅 由字符 'a' 和 'b' 组成的字符串 s 。如果字符串中 每个 'a' 都出现在 每个 'b' 之前，返回 true ；否则，返回 
//false 。 
//
// 
//
// 示例 1： 
//
// 输入：s = "aaabbb"
//输出：true
//解释：
//'a' 位于下标 0、1 和 2 ；而 'b' 位于下标 3、4 和 5 。
//因此，每个 'a' 都出现在每个 'b' 之前，所以返回 true 。
// 
//
// 示例 2： 
//
// 输入：s = "abab"
//输出：false
//解释：
//存在一个 'a' 位于下标 2 ，而一个 'b' 位于下标 1 。
//因此，不能满足每个 'a' 都出现在每个 'b' 之前，所以返回 false 。
// 
//
// 示例 3： 
//
// 输入：s = "bbb"
//输出：true
//解释：
//不存在 'a' ，因此可以视作每个 'a' 都出现在每个 'b' 之前，所以返回 true 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 100 
// s[i] 为 'a' 或 'b' 
// 
// Related Topics 字符串 👍 7 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 2124.检查是否所有 A 都在 B 之前.check-if-all-as-appears-before-all-bs
 *
 * @author wangcy
 * @since  2022-10-02 10:49:00
 **/

  public class Solution_2124{
      public static void main(String[] args) {
           Solution solution = new Solution_2124().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkString(String s) {
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if('a' == c){
                boolean b = vaildB(s,i);
                if(!b){
                    return false;
                }

            }
        }
        return true;
    }
    boolean vaildB(String s,int index){
        for (int i = 0; i < index; i++) {
            if('b' == s.charAt(i)){
                return false;
            }
        }
        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }