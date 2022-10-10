

//给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。 
//
// 如果可以，返回 true ；否则返回 false 。 
//
// magazine 中的每个字符只能在 ransomNote 中使用一次。 
//
// 
//
// 示例 1： 
//
// 
//输入：ransomNote = "a", magazine = "b"
//输出：false
// 
//
// 示例 2： 
//
// 
//输入：ransomNote = "aa", magazine = "ab"
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：ransomNote = "aa", magazine = "aab"
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= ransomNote.length, magazine.length <= 10⁵ 
// ransomNote 和 magazine 由小写英文字母组成 
// 
// Related Topics 哈希表 字符串 计数 👍 363 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 383.赎金信.ransom-note
 *
 * @author wangcy
 * @since  2022-06-29 18:34:52
 **/

  public class Solution_383{
      public static void main(String[] args) {

          Solution solution = new Solution_383().new Solution();
          String ransomNote = "aac";
          String magazine = "abac";
          boolean b = solution.canConstruct(ransomNote, magazine);
          System.out.println(b);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) return  false;
        int[] maInts = new int[26];
        char[] maChars = magazine.toCharArray();
        for (char aChar : maChars) {
            int i = aChar % 97;
            maInts[i] = maInts[i]+1;
        }
        char[] raChars = ransomNote.toCharArray();
        for (char raChar : raChars) {
            int j = raChar % 97;
            if(maInts[j] > 0){
                maInts[j] = maInts[j]-1;
            }else{
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }