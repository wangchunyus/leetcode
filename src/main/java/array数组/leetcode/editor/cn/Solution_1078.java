

//给出第一个词 first 和第二个词 second，考虑在某些文本 text 中可能以 "first second third" 形式出现的情况，其中 
//second 紧随 first 出现，third 紧随 second 出现。 
//
// 对于每种这样的情况，将第三个词 "third" 添加到答案中，并返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：text = "alice is a good girl she is a good student", first = "a", second = 
//"good"
//输出：["girl","student"]
// 
//
// 示例 2： 
//
// 
//输入：text = "we will we will rock you", first = "we", second = "will"
//输出：["we","rock"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 1000 
// text 由小写英文字母和空格组成 
// text 中的所有单词之间都由 单个空格字符 分隔 
// 1 <= first.length, second.length <= 10 
// first 和 second 由小写英文字母组成 
// 
//
// Related Topics 字符串 👍 77 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 1078.Bigram 分词.occurrences-after-bigram
 *
 * @author wangcy
 * @since  2023-04-28 17:02:09
 **/

  public class Solution_1078{
      public static void main(String[] args) {
           Solution solution = new Solution_1078().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] findOcurrences(String text, String first, String second) {

        List<Integer> list = new ArrayList<>();
        String[] s = text.split(" ");
        for (int i = 0; i < s.length; i++) {
            if(i+1 < s.length  && s[i].equals(first) && s[i+1].equals(second)){
                list.add(i+2);
            }
        }
        List<Integer> collect = list.stream().filter(l -> l < s.length).collect(Collectors.toList());
        String[] res = new String[collect.size()];
        for (int i = 0; i < collect.size(); i++) {
            res[i] = s[collect.get(i)];
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }