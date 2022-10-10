

//句子 是一串由空格分隔的单词。每个 单词 仅由小写字母组成。 
//
// 如果某个单词在其中一个句子中恰好出现一次，在另一个句子中却 没有出现 ，那么这个单词就是 不常见的 。 
//
// 给你两个 句子 s1 和 s2 ，返回所有 不常用单词 的列表。返回列表中单词可以按 任意顺序 组织。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：s1 = "this apple is sweet", s2 = "this apple is sour"
//输出：["sweet","sour"]
// 
//
// 示例 2： 
//
// 
//输入：s1 = "apple apple", s2 = "banana"
//输出：["banana"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s1.length, s2.length <= 200 
// s1 和 s2 由小写英文字母和空格组成 
// s1 和 s2 都不含前导或尾随空格 
// s1 和 s2 中的所有单词间均由单个空格分隔 
// 
// Related Topics 哈希表 字符串 👍 160 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 884.两句话中的不常见单词.uncommon-words-from-two-sentences
 *
 * @author wangcy
 * @since 2022-06-10 14:18:58
 **/

public class Solution_884 {
    public static void main(String[] args) {

        Solution solution = new Solution_884().new Solution();
        String s11 = "apple apple";
        String s22 = "banana";
        String[] strings = solution.uncommonFromSentences(s11, s22);
        for (String string : strings) {
            System.out.print(string + ",");
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] uncommonFromSentences(String s1, String s2) {
            HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
            String[] sn1 = s1.split(" ");
            String[] sn2 = s2.split(" ");
            for (String s11 : sn1) {
                stringIntegerHashMap.put(s11, stringIntegerHashMap.getOrDefault(s11, 0) + 1);
            }
            for (String s22 : sn2) {
                stringIntegerHashMap.put(s22, stringIntegerHashMap.getOrDefault(s22, 0) + 1);
            }
            HashSet<String> set = new HashSet<>();
            for (String s : stringIntegerHashMap.keySet()) {
                if(stringIntegerHashMap.get(s) == 1){
                    set.add(s);
                }
            }
            return set.toArray(new String[set.size()]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}