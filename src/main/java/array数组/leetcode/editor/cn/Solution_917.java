

//给你一个字符串 s ，根据下述规则反转字符串： 
//
// 
// 所有非英文字母保留在原有位置。 
// 所有英文字母（小写或大写）位置反转。 
// 
//
// 返回反转后的 s 。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：s = "ab-cd"
//输出："dc-ba"
// 
//
// 
// 
//
// 示例 2： 
//
// 
//输入：s = "a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"
// 
//
// 
// 
//
// 示例 3： 
//
// 
//输入：s = "Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
//
//
// 
//
// 提示 
//
// 
// 1 <= s.length <= 100 
// s 仅由 ASCII 值在范围 [33, 122] 的字符组成 
// s 不含 '\"' 或 '\\' 
// 
// Related Topics 双指针 字符串 👍 175 👎 0


package array数组.leetcode.editor.cn;

import java.util.*;

/**
 * 917.仅仅反转字母.reverse-only-letters
 *
 * @author wangcy
 * @since  2022-07-05 16:48:24
 **/

  public class Solution_917{
      public static void main(String[] args) {

          Solution solution = new Solution_917().new Solution();
          String s ="Test1ng-Leet=code-Q!";
          String s1 = solution.reverseOnlyLetters(s);
          System.out.println(s1);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseOnlyLetters(String s) {
        // 1 hash做法
       /* HashMap<Integer, Character> hashMap = new HashMap<>();
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(Character.isLetter(chars[i])){
                deque.add(chars[i]);
            }else{
                hashMap.put(i,chars[i]);
            }
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if(hashMap.containsKey(i)){
                result.append(hashMap.get(i));
            }else {
                result.append(deque.pollLast());
            }
        }
        return result.toString();*/

        //2 双指针做法
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while (left<right){
            if(Character.isLetter(chars[left]) && Character.isLetter(chars[right])){
                //都是字符
                char temp;
                temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }else if(Character.isLetter(chars[left]) && !Character.isLetter(chars[right])){
                //左边是字符 右边不是
                right--;
            }else if(!Character.isLetter(chars[left]) && !Character.isLetter(chars[right])){
                left++;
                right--;
            }else{
                left++;
            }
        }
        return String.valueOf(chars);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }