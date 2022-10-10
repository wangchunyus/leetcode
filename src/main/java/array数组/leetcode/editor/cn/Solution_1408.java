

//给你一个字符串数组 words ，数组中的每个字符串都可以看作是一个单词。请你按 任意 顺序返回 words 中是其他单词的子字符串的所有单词。 
//
// 如果你可以删除 words[j] 最左侧和/或最右侧的若干字符得到 word[i] ，那么字符串 words[i] 就是 words[j] 的一个子字符串
//。 
//
// 
//
// 示例 1： 
//
// 输入：words = ["mass","as","hero","superhero"]
//输出：["as","hero"]
//解释："as" 是 "mass" 的子字符串，"hero" 是 "superhero" 的子字符串。
//["hero","as"] 也是有效的答案。
// 
//
// 示例 2： 
//
// 输入：words = ["leetcode","et","code"]
//输出：["et","code"]
//解释："et" 和 "code" 都是 "leetcode" 的子字符串。
// 
//
// 示例 3： 
//
// 输入：words = ["blue","green","bu"]
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 100 
// 1 <= words[i].length <= 30 
// words[i] 仅包含小写英文字母。 
// 题目数据 保证 每个 words[i] 都是独一无二的。 
// 
// Related Topics 字符串 字符串匹配 👍 28 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 1408.数组中的字符串匹配.string-matching-in-an-array
 *
 * @author wangcy
 * @since  2022-07-15 11:07:28
 **/

  public class Solution_1408{
      public static void main(String[] args) {

          Solution solution = new Solution_1408().new Solution();
          String[] arr = {"leetcoder","leetcode","od","hamlet","am"};
          List<String> stringList = solution.stringMatching(arr);
          for (String s : stringList) {
              System.out.print(s+",");
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <words.length ; j++) {
                if(i != j && words[i].contains(words[j])){
                    if(!set.contains(words[j])){
                        list.add(words[j]);
                        set.add(words[j]);
                    }
                }
            }
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }