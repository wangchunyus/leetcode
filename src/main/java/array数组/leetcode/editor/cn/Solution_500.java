

//给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。 
//
// 美式键盘 中： 
//
// 
// 第一行由字符 "qwertyuiop" 组成。 
// 第二行由字符 "asdfghjkl" 组成。 
// 第三行由字符 "zxcvbnm" 组成。 
// 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：words = ["Hello","Alaska","Dad","Peace"]
//输出：["Alaska","Dad"]
// 
//
// 示例 2： 
//
// 
//输入：words = ["omk"]
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：words = ["adsdf","sfd"]
//输出：["adsdf","sfd"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 20 
// 1 <= words[i].length <= 100 
// words[i] 由英文字母（小写和大写字母）组成 
// 
// Related Topics 数组 哈希表 字符串 👍 211 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 500.键盘行.keyboard-row
 *
 * @author wangcy
 * @since 2022-06-06 17:17:19
 **/

public class Solution_500 {
    public static void main(String[] args) {

        Solution solution = new Solution_500().new Solution();
        String[] str = {"omk"};
        String[] words = solution.findWords(str);
        for (String word : words) {
            System.out.println(word);
            System.out.println("---------------");
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] findWords(String[] words) {
            String rOne = "qwertyuiop";
            String rTwo = "asdfghjkl";
            String rThree = "zxcvbnm";
            List<Integer> indexs = new ArrayList<>();
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                Set<Integer> set = new HashSet<>();
                char[] chars = word.toCharArray();
                for (char aChar : chars) {
                    if (rOne.indexOf(aChar) != -1) {
                        set.add(1);
                    } else if (rTwo.indexOf(aChar) != -1) {
                        set.add(2);
                    } else if (rThree.indexOf(aChar) != -1) {
                        set.add(3);
                    }
                }
                if (set.size() <= 1) {
                    indexs.add(i);
                }
            }
            String[] result = new String[indexs.size()];
            for (int i = 0; i < indexs.size(); i++) {
                result[i] = words[indexs.get(i)];
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}