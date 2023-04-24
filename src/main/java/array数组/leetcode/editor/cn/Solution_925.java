

//你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。 
//
// 你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。 
//
// 
//
// 示例 1： 
//
// 
//输入：name = "alex", typed = "aaleex"
//输出：true
//解释：'alex' 中的 'a' 和 'e' 被长按。
// 
//
// 示例 2： 
//
// 
//输入：name = "saeed", typed = "ssaaedd"
//输出：false
//解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= name.length, typed.length <= 1000 
// name 和 typed 的字符都是小写字母 
// 
//
// Related Topics 双指针 字符串 👍 266 👎 0


package array数组.leetcode.editor.cn;

/**
 * 925.长按键入.long-pressed-name
 *
 * @author wangcy
 * @since 2023-04-24 14:54:58
 **/

public class Solution_925 {
    public static void main(String[] args)
    {
        Solution solution = new Solution_925().new Solution();
        solution.isLongPressedName("vtkgn","vttkgnn");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isLongPressedName(String name, String typed) {
            int nameP = 0;
            int typedP = 0;
            while (typedP < typed.length()) {
                if (nameP < name.length() && name.charAt(nameP) == typed.charAt(typedP)) {
                    nameP++;
                    typedP++;
                } else if (typedP > 0 && typed.charAt(typedP) == typed.charAt(typedP - 1)) {
                    typedP++;
                } else {
                    return false;
                }
            }
            return nameP == name.length();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}