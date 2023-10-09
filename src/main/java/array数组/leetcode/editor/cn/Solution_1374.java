

//给你一个整数 n，请你返回一个含 n 个字符的字符串，其中每种字符在该字符串中都恰好出现 奇数次 。 
//
// 返回的字符串必须只含小写英文字母。如果存在多个满足题目要求的字符串，则返回其中任意一个即可。 
//
// 
//
// 示例 1： 
//
// 输入：n = 4
//输出："pppz"
//解释："pppz" 是一个满足题目要求的字符串，因为 'p' 出现 3 次，且 'z' 出现 1 次。当然，还有很多其他字符串也满足题目要求，比如：
//"ohhh" 和 "love"。
// 
//
// 示例 2： 
//
// 输入：n = 2
//输出："xy"
//解释："xy" 是一个满足题目要求的字符串，因为 'x' 和 'y' 各出现 1 次。当然，还有很多其他字符串也满足题目要求，比如："ag" 和 "ur"。
//
// 
//
// 示例 3： 
//
// 输入：n = 7
//输出："holasss"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 500 
// 
//
// Related Topics 字符串 👍 77 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 1374.生成每种字符都是奇数个的字符串.generate-a-string-with-characters-that-have-odd-counts
 *
 * @author wangcy
 * @since  2023-09-27 16:34:18
 **/

  public class Solution_1374{
      public static void main(String[] args) {

          Solution solution = new Solution_1374().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String generateTheString(int n) {

        StringBuffer buffer = new StringBuffer();
        if(n % 2 != 0){
            //奇数
            for (int i = 0; i < n; i++) {
                if(i < n-2){
                    buffer.append("a");
                }else if(i>=n-2 && i<n-1){
                    buffer.append("b");
                }else{
                    buffer.append("c");
                }
            }
        }else {
            for (int i = 0; i < n; i++) {
                //偶数
                if(i < n-1){
                    buffer.append("a");
                }else{
                    buffer.append("b");
                }
            }
        }
        return buffer.toString();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }