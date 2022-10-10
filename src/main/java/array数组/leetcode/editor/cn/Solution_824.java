

//给你一个由若干单词组成的句子 sentence ，单词间由空格分隔。每个单词仅由大写和小写英文字母组成。 
//
// 请你将句子转换为 “山羊拉丁文（Goat Latin）”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。山羊拉丁文的规则如下： 
//
// 
// 如果单词以元音开头（'a', 'e', 'i', 'o', 'u'），在单词后添加"ma"。
//
// 
// 例如，单词 "apple" 变为 "applema" 。 
// 
// 
// 如果单词以辅音字母开头（即，非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
// 
// 例如，单词 "goat" 变为 "oatgma" 。 
// 
// 
// 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从 1 开始。
// 
// 例如，在第一个单词后添加 "a" ，在第二个单词后添加 "aa" ，以此类推。 
// 
// 
// 
//
// 返回将 sentence 转换为山羊拉丁文后的句子。 
//
// 
//
// 示例 1： 
//
// 
//输入：sentence = "I speak Goat Latin"
//输出："Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
//
//
// 示例 2： 
//
// 
//输入：sentence = "The quick brown fox jumped over the lazy dog"
//输出："heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa 
//hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
//
// 
//
// 提示： 
//
// 
// 1 <= sentence.length <= 150 
// sentence 由英文字母和空格组成 
// sentence 不含前导或尾随空格 
// sentence 中的所有单词由单个空格分隔 
// 
// Related Topics 字符串 👍 125 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashSet;

/**
 * 824.山羊拉丁文.goat-latin
 *
 * @author wangcy
 * @since 2022-07-05 10:12:15
 **/

public class Solution_824 {
    public static void main(String[] args) {
        Solution solution = new Solution_824().new Solution();
        String sentence = "I speak Goat Latin";
        String s = solution.toGoatLatin(sentence);
        System.out.println(s);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String toGoatLatin(String sentence) {
            String[] split = sentence.split(" ");//原句子
            StringBuffer buffer = new StringBuffer();
            HashSet<Character> hashSet = new HashSet<>();
            hashSet.add('a');
            hashSet.add('e');
            hashSet.add('i');
            hashSet.add('o');
            hashSet.add('u');
            hashSet.add('A');
            hashSet.add('E');
            hashSet.add('I');
            hashSet.add('O');
            hashSet.add('U');
            for (int i = 0; i < split.length; i++) {
                String s = split[i];
                String aNumbers = aNumbers(i + 1);
                if (hashSet.contains(s.charAt(0))) {
                    //元音字母开头
                    buffer.append(s + "ma" + aNumbers);
                } else {
                    //辅音字母开头
                    String init = InitialReversal(s);
                    buffer.append(init + "ma" + aNumbers);
                }
                if(i != split.length-1){
                    buffer.append(" ");
                }
            }
            return buffer.toString();
        }

        /**
         * 头字符换位到末尾
         *
         * @param s 年代
         * @return {@link String}
         */
        private String InitialReversal(String s) {
            StringBuffer buffer = new StringBuffer();
            char c = s.charAt(0);
            char[] chars = s.toCharArray();
            for (int i = 1; i < chars.length; i++) {
                buffer.append(chars[i]);
            }
            buffer.append(c);
            return buffer.toString();
        }

        /**
         * A的个数
         *
         * @param j j
         * @return {@link String}
         */
        public String aNumbers(int j) {
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < j; i++) {
                buffer.append("a");
            }
            return buffer.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}