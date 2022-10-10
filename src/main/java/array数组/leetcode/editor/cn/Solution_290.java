

//给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
//
// 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
//
//
//
// 示例1:
//
//
//输入: pattern = "abba", str = "dog cat cat dog"
//输出: true
//
// 示例 2:
//
//
//输入:pattern = "abba", str = "dog cat cat fish"
//输出: false
//
// 示例 3:
//
//
//输入: pattern = "aaaa", str = "dog cat cat dog"
//输出: false
//
//
//
// 提示:
//
//
// 1 <= pattern.length <= 300
// pattern 只包含小写英文字母
// 1 <= s.length <= 3000
// s 只包含小写英文字母和 ' '
// s 不包含 任何前导或尾随对空格
// s 中每个单词都被 单个空格 分隔
//
// Related Topics 哈希表 字符串 👍 479 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;

/**
 * 290.单词规律.word-pattern
 *
 * @author wangcy
 * @since  2022-06-29 15:57:46
 **/

  public class Solution_290{
      public static void main(String[] args) {
           Solution solution = new Solution_290().new Solution();
           String patt = "aaaa";
           String s = "dog dog dog dog";
          boolean b = solution.wordPattern(patt, s);
          System.out.println(b);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;
        HashMap<String, Integer> patternMap = new HashMap<>();
        HashMap<String, Integer> sMap = new HashMap<>();
        StringBuffer patternBuffer = new StringBuffer();
        StringBuffer sBuffer = new StringBuffer();
        char[] chars = pattern.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(!patternMap.containsKey(String.valueOf(chars[i]))){
                //不存在
                patternBuffer.append(i);
                patternMap.put(String.valueOf(chars[i]),i);
            }else{
                //存在 则获取它的第一个下标值
                Integer index = patternMap.get(String.valueOf(chars[i]));
                patternBuffer.append(index);
            }
        }
        for (int j = 0; j < str.length; j++) {
            if(!sMap.containsKey(str[j])){
                //不存在
                sBuffer.append(j);
                sMap.put(str[j],j);
            }else{
                //存在 则获取它的第一个下标值
                Integer index = sMap.get(str[j]);
                sBuffer.append(index);
            }
        }
        if(patternBuffer.toString().equals(sBuffer.toString())){
            return true;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }