

//国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: 
//
// 
// 'a' 对应 ".-" ， 
// 'b' 对应 "-..." ， 
// 'c' 对应 "-.-." ，以此类推。 
// 
//
// 为了方便，所有 26 个英文字母的摩尔斯密码表如下： 
//
// 
//[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--
//","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.
//."] 
//
// 给你一个字符串数组 words ，每个单词可以写成每个字母对应摩尔斯密码的组合。 
//
// 
// 例如，"cab" 可以写成 "-.-..--..." ，(即 "-.-." + ".-" + "-..." 字符串的结合)。我们将这样一个连接过程称作 单
//词翻译 。 
// 
//
// 对 words 中所有单词进行单词翻译，返回不同 单词翻译 的数量。 
//
// 
//
// 示例 1： 
//
// 
//输入: words = ["gin", "zen", "gig", "msg"]
//输出: 2
//解释: 
//各单词翻译如下:
//"gin" -> "--...-."
//"zen" -> "--...-."
//"gig" -> "--...--."
//"msg" -> "--...--."
//
//共有 2 种不同翻译, "--...-." 和 "--...--.".
// 
//
// 示例 2： 
//
// 
//输入：words = ["a"]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 100 
// 1 <= words[i].length <= 12 
// words[i] 由小写英文字母组成 
// 
// Related Topics 数组 哈希表 字符串 👍 234 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 804.唯一摩尔斯密码词.unique-morse-code-words
 *
 * @author wangcy
 * @since  2022-06-09 19:26:44
 **/

  public class Solution_804{
      public static void main(String[] args) {

          Solution solution = new Solution_804().new Solution();
          String[] str = {"gin", "zen", "gig", "msg"};
          int i = solution.uniqueMorseRepresentations(str);
          System.out.println(i);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] mosi = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] wordsYuan = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        HashMap<Character, String> objectObjectHashMap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            objectObjectHashMap.put(wordsYuan[i],mosi[i]);
        }
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            StringBuffer buffer = new StringBuffer();
            for (char c : word.toCharArray()) {
                String s = objectObjectHashMap.get(c);
                buffer.append(s);
            }
            set.add(buffer.toString());
        }
        return set.size();


    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }