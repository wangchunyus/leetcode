

//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串 
// 👍 386 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 125.验证回文串.valid-palindrome
 *
 * @author wangcy
 * @since  2021-06-11 17:25:04
 **/

  public class Solution_125{
      public static void main(String[] args) {

          Solution solution = new Solution_125().new Solution();
          String s = "A man, a plan, a canal: Panama";
          boolean palindrome = solution.isPalindrome(s);
          System.out.println(palindrome);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        //将是字符或者数字的值存入buffer中
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                stringBuffer.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int leftPoint = 0;
        int rightPoint = stringBuffer.length()-1;
        while (leftPoint<rightPoint){
            if(stringBuffer.charAt(leftPoint) != stringBuffer.charAt(rightPoint)) {
                return false;
            }else {
                leftPoint++;
                rightPoint--;
            }
        }
        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }