

//给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的回文串 。 
//
// 在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。 
//
// 
//
// 示例 1: 
//
// 
//输入:s = "abccccdd"
//输出:7
//解释:
//我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
// 
//
// 示例 2: 
//
// 
//输入:s = "a"
//输入:1
// 
//
// 示例 3: 
//
// 
//输入:s = "bb"
//输入: 2
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 2000 
// s 只能由小写和/或大写英文字母组成 
// 
// Related Topics 贪心 哈希表 字符串 👍 423 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;

/**
 * 409.最长回文串.longest-palindrome
 *
 * @author wangcy
 * @since  2022-07-01 10:07:28
 **/

  public class Solution_409{
      public static void main(String[] args) {

          Solution solution = new Solution_409().new Solution();

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestPalindrome(String s) {
        //数组hash
        /*int[] ints = new int[128];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            ints[s.charAt(i)]++;
        }
        int count = 0;
        for (int anInt : ints) {
            count+= anInt/2*2;//表示超过个数1的字符 可以放在回文的左右两边的个数总和 如果是1个相当于count+0;
            if(anInt % 2 == 1 && count % 2 == 0){//表示 如果当前字符的个数是1个 并且 记录总数count是偶数的时候 加入那一个字符 ， 如果count是奇数的话就不需要在加入了；
                count++;
            }
        }
        return count;*/

        //hashMap算法
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if(map.containsKey(aChar)){
                map.put(aChar,map.get(aChar)+1);
            }else{
                map.put(aChar,1);
            }
        }
        int count = 0;
        for (Character character : map.keySet()) {
            Integer num = map.get(character);
            count += num/2*2;
            if(num % 2 == 1 && count % 2 == 0 ){
                count++;
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }