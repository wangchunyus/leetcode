

//给你一个排序后的字符列表 letters ，列表中只包含小写英文字母。另给出一个目标字母 target，请你寻找在这一有序列表里比目标字母大的最小字母。 
//
// 在比较时，字母是依序循环出现的。举个例子： 
//
// 
// 如果目标字母 target = 'z' 并且字符列表为 letters = ['a', 'b']，则答案返回 'a' 
// 
//
// 
//
// 示例 1： 
//
// 
//输入: letters = ["c", "f", "j"]，target = "a"
//输出: "c"
// 
//
// 示例 2: 
//
// 
//输入: letters = ["c","f","j"], target = "c"
//输出: "f"
// 
//
// 示例 3: 
//
// 
//输入: letters = ["c","f","j"], target = "d"
//输出: "f"
// 
//
// 
//
// 提示： 
//
// 
// 2 <= letters.length <= 10⁴ 
// letters[i] 是一个小写字母 
// letters 按非递减顺序排序 
// letters 最少包含两个不同的字母 
// target 是一个小写字母 
// 
// Related Topics 数组 二分查找 👍 228 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 744.寻找比目标字母大的最小字母.find-smallest-letter-greater-than-target
 *
 * @author wangcy
 * @since  2022-07-01 18:47:01
 **/

  public class Solution_744{
      public static void main(String[] args) {

          Solution solution = new Solution_744().new Solution();
          char[] le = {'c', 'f', 'j'};
          char tar = 'c';
          char c = solution.nextGreatestLetter(le, tar);
          System.out.println(c);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char[] copyle = new char[letters.length+1];
        for (int i = 0; i <= letters.length; i++) {
            if(i == letters.length) {
                copyle[i] = target;
            }else{
                copyle[i] = letters[i];
            }
        }
        Arrays.sort(copyle);
        for (int i = 0; i < copyle.length; i++) {
            if(copyle[i] == target && i < copyle.length-1 && copyle[i] != copyle[i+1]){
                return copyle[i+1];
            }
        }
        return copyle[0];

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }