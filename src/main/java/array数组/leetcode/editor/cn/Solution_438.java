

//给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。 
//
// 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "cbaebabacd", p = "abc"
//输出: [0,6]
//解释:
//起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
//起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
// 
//
// 示例 2: 
//
// 
//输入: s = "abab", p = "ab"
//输出: [0,1,2]
//解释:
//起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
//起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
//起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, p.length <= 3 * 10⁴ 
// s 和 p 仅包含小写字母 
// 
// Related Topics 哈希表 字符串 滑动窗口 👍 959 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 438.找到字符串中所有字母异位词.find-all-anagrams-in-a-string
 *
 * @author wangcy
 * @since  2022-08-01 10:25:29
 **/

  public class Solution_438{
      public static void main(String[] args) {

          Solution solution = new Solution_438().new Solution();
          String s = "cbaebabacd";
          String t = "abc";
          List<Integer> anagrams = solution.findAnagrams(s, t);
          for (Integer anagram : anagrams) {
              System.out.println(anagram);
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //输入: s = "cbaebabacd", p = "abc"
        //输出: [0,6]
        //解释:
        //起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
        //起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> windos = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            need.put(p.charAt(i),need.getOrDefault(p.charAt(i),0)+1);
        }
        int vaild = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()){
            char c = s.charAt(right);
            right++;
            if(need.containsKey(c)){
                windos.put(c,windos.getOrDefault(c,0)+1);
                if(windos.get(c) == need.get(c)){
                    vaild++;
                }
            }
            //判断左侧窗口是否需要收缩
            while (right-left >= p.length()){
                char c1 = s.charAt(left);
                //符合条件直接存起始地址下标
                if(vaild == need.size()){
                    res.add(left);
                }
                left++;
                if(need.containsKey(c1)){
                    if( windos.get(c1)== need.get(c1)){
                        windos.put(c1,windos.getOrDefault(c1,0)-1);
                        vaild--;
                    }
                }

            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }