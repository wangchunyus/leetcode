

//子字符串 是字符串中的一个连续（非空）的字符序列。 
//
// 元音子字符串 是 仅 由元音（'a'、'e'、'i'、'o' 和 'u'）组成的一个子字符串，且必须包含 全部五种 元音。 
//
// 给你一个字符串 word ，统计并返回 word 中 元音子字符串的数目 。 
//
// 
//
// 示例 1： 
//
// 
//输入：word = "aeiouu"
//输出：2
//解释：下面列出 word 中的元音子字符串（斜体加粗部分）：
//- "aeiouu"
//- "aeiouu"
// 
//
// 示例 2： 
//
// 
//输入：word = "unicornarihan"
//输出：0
//解释：word 中不含 5 种元音，所以也不会存在元音子字符串。
// 
//
// 示例 3： 
//
// 
//输入：word = "cuaieuouac"
//输出：7
//解释：下面列出 word 中的元音子字符串（斜体加粗部分）：
//- "cuaieuouac"
//- "cuaieuouac"
//- "cuaieuouac"
//- "cuaieuouac"
//- "cuaieuouac"
//- "cuaieuouac"
//- "cuaieuouac" 
//
// 示例 4： 
//
// 
//输入：word = "bbaeixoubb"
//输出：0
//解释：所有包含全部五种元音的子字符串都含有辅音，所以不存在元音子字符串。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= word.length <= 100 
// word 仅由小写英文字母组成 
// 
// Related Topics 哈希表 字符串 👍 26 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * 2062.统计字符串中的元音子字符串.count-vowel-substrings-of-a-string
 *
 * @author wangcy
 * @since 2022-09-27 15:14:59
 **/

public class Solution_2062 {
    public static void main(String[] args) {

        Solution solution = new Solution_2062().new Solution();
        String word = "cuaieuouac";
        int i = solution.countVowelSubstrings(word);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countVowelSubstrings(String word) {
            //输入：word = "cuaieuouac"
            //输出：7
            //解释：下面列出 word 中的元音子字符串（斜体加粗部分）：
            //- "cuaieuouac"
            //- "cuaieuouac"
            //- "cuaieuouac"
            //- "cuaieuouac"
            //- "cuaieuouac"
            //- "cuaieuouac"
            //- "cuaieuouac"
            // 暴力法+小优化
            char[] chArr = word.toCharArray();
            int len = chArr.length;
            int ans = 0;
            for (int i = 0; i < len - 4; i++) {
                char ch = chArr[i];
                // 从元音字母开始数
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    continue;
                }
                Set<Character> set = new HashSet<>();
                for (int j = i; j < len; j++) {
                    char ch2 = chArr[j];
                    if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
                        set.add(ch2);
                        if (set.size() == 5) {
                            ans++;
                        }
                    } else {
                        break;
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}