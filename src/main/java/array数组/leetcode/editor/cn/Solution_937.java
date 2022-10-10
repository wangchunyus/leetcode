

//给你一个日志数组 logs。每条日志都是以空格分隔的字串，其第一个字为字母与数字混合的 标识符 。 
//
// 有两种不同类型的日志： 
//
// 
// 字母日志：除标识符之外，所有字均由小写字母组成 
// 数字日志：除标识符之外，所有字均由数字组成 
// 
//
// 请按下述规则将日志重新排序： 
//
// 
// 所有 字母日志 都排在 数字日志 之前。 
// 字母日志 在内容不同时，忽略标识符后，按内容字母顺序排序；在内容相同时，按标识符排序。 
// 数字日志 应该保留原来的相对顺序。 
// 
//
// 返回日志的最终顺序。 
//
// 
//
// 示例 1： 
//
// 
//输入：logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 
//art zero"]
//输出：["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6
//"]
//解释：
//字母日志的内容都不同，所以顺序为 "art can", "art zero", "own kit dig" 。
//数字日志保留原来的相对顺序 "dig1 8 1 5 1", "dig2 3 6" 。
// 
//
// 示例 2： 
//
// 
//输入：logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
//
//输出：["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= logs.length <= 100 
// 3 <= logs[i].length <= 100 
// logs[i] 中，字与字之间都用 单个 空格分隔 
// 题目数据保证 logs[i] 都有一个标识符，并且在标识符之后至少存在一个字 
// 
// Related Topics 数组 字符串 排序 👍 192 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 937.重新排列日志文件.reorder-data-in-log-files
 *
 * @author wangcy
 * @since 2022-07-06 11:17:40
 **/

public class Solution_937 {
    public static void main(String[] args) {

        Solution solution = new Solution_937().new Solution();
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] strings = solution.reorderLogFiles(logs);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] reorderLogFiles(String[] logs) {
            //输入：logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3
            //art zero"]
            //输出：["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6
            //"]
            //解释：
            //字母日志的内容都不同，所以顺序为 "art can", "art zero", "own kit dig" 。
            //数字日志保留原来的相对顺序 "dig1 8 1 5 1", "dig2 3 6" 。
            int length = logs.length;
            Pair[] arr = new Pair[length];
            for (int i = 0; i < length; i++) {
                arr[i] = new Pair(logs[i], i);
            }
            Arrays.sort(arr, (a, b) -> logCompare(a, b));
            String[] reordered = new String[length];
            for (int i = 0; i < length; i++) {
                reordered[i] = arr[i].log;
            }
            return reordered;
        }

        public int logCompare(Pair pair1, Pair pair2) {
            String log1 = pair1.log, log2 = pair2.log;
            int index1 = pair1.index, index2 = pair2.index;
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            if (isDigit1 && isDigit2) {
                return index1 - index2;
            }
            if (!isDigit1 && !isDigit2) {
                int sc = split1[1].compareTo(split2[1]);
                if (sc != 0) {
                    return sc;
                }
                return split1[0].compareTo(split2[0]);
            }
            return isDigit1 ? 1 : -1;
        }
    }

    class Pair {
        String log;
        int index;

        public Pair(String log, int index) {
            this.log = log;
            this.index = index;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}