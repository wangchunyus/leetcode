

//我们定义，在以下情况时，单词的大写用法是正确的： 
//
// 
// 全部字母都是大写，比如 "USA" 。 
// 单词中所有字母都不是大写，比如 "leetcode" 。 
// 如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。 
// 
//
// 给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：word = "USA"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：word = "FlaG"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= word.length <= 100 
// word 由小写和大写英文字母组成 
// 
// Related Topics 字符串 👍 206 👎 0


package array数组.leetcode.editor.cn;

/**
 * 520.检测大写字母.detect-capital
 *
 * @author wangcy
 * @since 2022-07-11 17:58:50
 **/

public class Solution_520 {
    public static void main(String[] args) {

        Solution solution = new Solution_520().new Solution();
        String word = "FlaG";
        boolean b = solution.detectCapitalUse(word);
        System.out.println(b);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean detectCapitalUse(String word) {
            //三种情况都判断一次
            boolean flagOne = true;
            boolean flagTwo = true;
            boolean flagThree = true;
            int length = word.length();
            //全部大写
            for (int i = 0; i < length; i++) {
                if (!Character.isUpperCase(word.charAt(i))) {
                    flagOne = false;
                    break;
                }
            }
            //全部小写
            for (int j = 0; j < length; j++) {
                if (!Character.isLowerCase(word.charAt(j))) {
                    flagTwo = false;
                    break;
                }
            }
            //首字母大写 其他小写
            for (int z = 0; z < length; z++) {
                if (z == 0) {
                    if (!Character.isUpperCase(word.charAt(z))) {
                        flagThree = false;
                        break;
                    }
                }else{
                    if (!Character.isLowerCase(word.charAt(z))) {
                        flagThree = false;
                        break;
                    }
                }
            }
            return flagOne || flagTwo || flagThree;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}