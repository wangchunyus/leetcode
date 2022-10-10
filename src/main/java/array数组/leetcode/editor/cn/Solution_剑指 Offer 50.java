


//在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。 
//
// 示例 1: 
//
// 
//输入：s = "abaccdeff"
//输出：'b'
// 
//
// 示例 2: 
//
// 
//输入：s = "" 
//输出：' '
// 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 50000 
// Related Topics 队列 哈希表 字符串 计数 👍 242 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;

/**
 * 剑指 Offer 50.第一个只出现一次的字符.di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof
 *
 * @author wangcy
 * @since 2022-06-28 17:53:51
 **/

 class Offer_50 {
    public static void main(String[] args) {

        Solution solution = new Offer_50().new Solution();
        char abaccdeff = solution.firstUniqChar("abaccdeff");
        System.out.println(abaccdeff);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char firstUniqChar(String s) {
            if (s == null || s.equals("")) {
                return ' ';
            } else if (s.length() == 1) {
                return s.charAt(0);
            }
            HashMap<Character, Integer> map = new HashMap<>();
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                if(map.containsKey(aChar)){
                    Integer count = map.get(aChar);
                    map.put(aChar,count+1);
                }else{
                    map.put(aChar,1);
                }
            }
            for (char aChar : chars) {
                Integer integer = map.get(aChar);
                if(integer ==1) return aChar;
            }
            return ' ';


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}