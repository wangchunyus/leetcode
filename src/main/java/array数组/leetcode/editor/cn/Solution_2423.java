

//给你一个下标从 0 开始的字符串 word ，字符串只包含小写英文字母。你需要选择 一个 下标并 删除 下标处的字符，使得 word 中剩余每个字母出现 频
//率 相同。 
//
// 如果删除一个字母后，word 中剩余所有字母的出现频率都相同，那么返回 true ，否则返回 false 。 
//
// 注意： 
//
// 
// 字母 x 的 频率 是这个字母在字符串中出现的次数。 
// 你 必须 恰好删除一个字母，不能一个字母都不删除。 
// 
//
// 
//
// 示例 1： 
//
// 输入：word = "abcc"
//输出：true
//解释：选择下标 3 并删除该字母，word 变成 "abc" 且每个字母出现频率都为 1 。
// 
//
// 示例 2： 
//
// 输入：word = "aazz"
//输出：false
//解释：我们必须删除一个字母，所以要么 "a" 的频率变为 1 且 "z" 的频率为 2 ，要么两个字母频率反过来。所以不可能让剩余所有字母出现频率相同。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= word.length <= 100 
// word 只包含小写英文字母。 
// 
//
// Related Topics 哈希表 字符串 计数 👍 10 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 2423.删除字符使频率相同.remove-letter-to-equalize-frequency
 *
 * @author wangcy
 * @since 2022-10-31 16:17:13
 **/

public class Solution_2423 {
    public static void main(String[] args) {
        Solution solution = new Solution_2423().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean equalFrequency(String word) {

            Map<Character, Integer> f = new HashMap<>();
            TreeMap<Integer, Integer> ff = new TreeMap<>();
            for (char c : word.toCharArray())
                f.put(c, f.getOrDefault(c, 0) + 1);
            for (var e : f.entrySet())
                ff.put(e.getValue(), ff.getOrDefault(e.getValue(), 0) + 1);
            if (ff.size() > 2)
                return false;
            if (ff.size() == 1)
                return ff.containsKey(1) || f.size() == 1;
            return ff.containsKey(1) && ff.get(1) == 1
                    || ff.lastEntry().getValue() == 1 && ff.lastKey() - ff.firstKey() == 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}