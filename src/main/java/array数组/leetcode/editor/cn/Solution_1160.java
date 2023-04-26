

//给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。 
//
// 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。 
//
// 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。 
//
// 返回词汇表 words 中你掌握的所有单词的 长度之和。 
//
// 
//
// 示例 1： 
//
// 输入：words = ["cat","bt","hat","tree"], chars = "atach"
//输出：6
//解释： 
//可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
// 
//
// 示例 2： 
//
// 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//输出：10
//解释：
//可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 1000 
// 1 <= words[i].length, chars.length <= 100 
// 所有字符串中都仅包含小写英文字母 
// 
//
// Related Topics 数组 哈希表 字符串 👍 173 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 1160.拼写单词.find-words-that-can-be-formed-by-characters
 *
 * @author wangcy
 * @since 2023-04-26 16:52:52
 **/

public class Solution_1160 {
    public static void main(String[] args) {

        Solution solution = new Solution_1160().new Solution();
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        int i = solution.countCharacters(words, chars);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countCharacters(String[] words, String chars) {
            int len = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < chars.length(); i++) {
                if (map.containsKey(chars.charAt(i))) {
                    map.put(chars.charAt(i), map.get(chars.charAt(i)) + 1);
                } else {
                    map.put(chars.charAt(i), 1);
                }
            }
            for (int i = 0; i < words.length; i++) {
                Map<Character, Integer> map2 = new HashMap<>();
                String word = words[i];
                for (int j = 0; j < word.length(); j++) {
                    if (map2.containsKey(word.charAt(j))) {
                        map2.put(word.charAt(j), map2.get(word.charAt(j)) + 1);
                    } else {
                        map2.put(word.charAt(j), 1);
                    }
                }
                int temp = 0;
                for (int i1 = 0; i1 < word.length(); i1++) {
                    if (map.containsKey(word.charAt(i1)) && map.get(word.charAt(i1)) >= map2.get(word.charAt(i1))) {
                        temp++;
                    }
                }
                if (temp == word.length()) {
                    len += temp;
                }
            }
            return len;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}