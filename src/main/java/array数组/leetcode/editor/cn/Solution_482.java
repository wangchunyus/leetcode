

//给定一个许可密钥字符串 s，仅由字母、数字字符和破折号组成。字符串由 n 个破折号分成 n + 1 组。你也会得到一个整数 k 。 
//
// 我们想要重新格式化字符串 s，使每一组包含 k 个字符，除了第一组，它可以比 k 短，但仍然必须包含至少一个字符。此外，两组之间必须插入破折号，并且应该将
//所有小写字母转换为大写字母。 
//
// 返回 重新格式化的许可密钥 。 
//
// 
//
// 示例 1： 
//
// 
//输入：S = "5F3Z-2e-9-w", k = 4
//输出："5F3Z-2E9W"
//解释：字符串 S 被分成了两个部分，每部分 4 个字符；
//     注意，两个额外的破折号需要删掉。
// 
//
// 示例 2： 
//
// 
//输入：S = "2-5g-3-J", k = 2
//输出："2-5G-3J"
//解释：字符串 S 被分成了 3 个部分，按照前面的规则描述，第一部分的字符可以少于给定的数量，其余部分皆为 2 个字符。
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 10⁵ 
// s 只包含字母、数字和破折号 '-'. 
// 1 <= k <= 10⁴ 
// 
// Related Topics 字符串 👍 143 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 482.密钥格式化.license-key-formatting
 *
 * @author wangcy
 * @since  2022-07-11 10:11:18
 **/

  public class Solution_482{
      public static void main(String[] args) {
           Solution solution = new Solution_482().new Solution();
           String s = "2-5g-3-J";
           int k = 2;
          String s1 = solution.licenseKeyFormatting(s, k);
          System.out.println(s1);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String licenseKeyFormatting(String s, int k) {

        int length = s.length();
        //获取秘钥的所有数字和字符
        StringBuffer all = new StringBuffer();
        for (int i = 0; i < length; i++) {
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                all.append(s.charAt(i));
            }
        }
        if(all.length() < 1){
            return "";
        }
        // 1求出 需要组的个数
        int groupNum = all.length() / k ;
        int oneGroup = all.length()-k*groupNum;//第一组的个数
        String allString = all.toString();
        StringBuffer result = new StringBuffer();
        int point = 0;
        //先插入第一组数据
        for (int i = 0; i < oneGroup; i++) {
            if(Character.isLetter(allString.charAt(i))){
                result.append(Character.toUpperCase(allString.charAt(i)));
            }else{
                result.append(allString.charAt(i));
            }
            point++;
        }
        //如果第组不为空 需要插入 '-'
        if(oneGroup != 0){
            result.append("-");
        }
        for (int i = 0; i < groupNum; i++) {
            int avgNum = k + point;
            for (int j = point; j < avgNum ; j++) {
                char c = allString.charAt(j);
                if(Character.isLetter(c)){
                    result.append(Character.toUpperCase(c));
                }else{
                    result.append(c);
                }
                point++;
            }
            result.append("-");
        }
        return result.substring(0,result.length()-1);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }