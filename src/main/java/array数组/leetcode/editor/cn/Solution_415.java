

//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。 
//
// 你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。 
//
// 
//
// 示例 1： 
//
// 
//输入：num1 = "11", num2 = "123"
//输出："134"
// 
//
// 示例 2： 
//
// 
//输入：num1 = "456", num2 = "77"
//输出："533"
// 
//
// 示例 3： 
//
// 
//输入：num1 = "0", num2 = "0"
//输出："0"
// 
//
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num1.length, num2.length <= 10⁴ 
// num1 和num2 都只包含数字 0-9 
// num1 和num2 都不包含任何前导零 
// 
// Related Topics 数学 字符串 模拟 👍 572 👎 0


package array数组.leetcode.editor.cn;

import java.awt.*;

/**
 * 415.字符串相加.add-strings
 *
 * @author wangcy
 * @since  2022-06-13 10:25:34
 **/

  public class Solution_415{
      public static void main(String[] args) {

          Solution solution = new Solution_415().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuffer stringBuffer = new StringBuffer();
        int n1 = num1.length()-1,n2 = num2.length()-1,c = 0;
        while (n1>=0 || n2>= 0){
            int i =  n1 >= 0 ? num1.charAt(n1) -'0': 0;
            int j = n2 >= 0 ? num2.charAt(n2)-'0' : 0;
            int temp = i + j + c;
            c = temp / 10;
            stringBuffer.append(temp % 10);
            n1--;
            n2--;
        }
        if(c == 1){
            stringBuffer.append(1);
        }
        return stringBuffer.reverse().toString();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }