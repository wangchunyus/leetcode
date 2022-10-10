

//实现 strStr() 函数。 
//
// 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如
//果不存在，则返回 -1 。 
//
// 
//
// 说明： 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。 
//
// 
//
// 示例 1： 
//
// 
//输入：haystack = "llohe", needle = "ll"
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：haystack = "aaaaa", needle = "bba"
//输出：-1
// 
//
// 示例 3： 
//
// 
//输入：haystack = "", needle = ""
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= haystack.length, needle.length <= 5 * 104 
// haystack 和 needle 仅由小写英文字符组成 
// 
// Related Topics 双指针 字符串 
// 👍 932 👎 0


package array数组.leetcode.editor.cn;

import java.util.logging.Level;

/**
 * 28.实现 strStr().implement-strstr
 *
 * @author wangcy
 * @since 2021-06-11 17:41:40
 **/

public class Solution_28 {
    public static void main(String[] args) {

        Solution solution = new Solution_28().new Solution();
        //haystack = "llohe", needle = "ll"
        String haystack = "";
        String needle = "a";
        int i = solution.strStr(haystack, needle);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle == null) {
                return 0;
            } else if (haystack.length() < 1 && needle.length() > 0) return -1;
            char[] charH = haystack.toCharArray();
            char[] charN = needle.toCharArray();
            int h = haystack.length();
            int n = needle.length();
            for (int i = 0; i <= h - n; i++) {
                //原始串a开始  匹配串 b开始
                int a = i;
                int b = 0;
                while (b < n && charH[a] == charN[b]) {
                    a++;
                    b++;
                }
                if (b == n) return i;
            }
            return -1;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}