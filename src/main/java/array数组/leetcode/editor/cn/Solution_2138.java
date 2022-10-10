

//字符串 s 可以按下述步骤划分为若干长度为 k 的组： 
//
// 
// 第一组由字符串中的前 k 个字符组成，第二组由接下来的 k 个字符串组成，依此类推。每个字符都能够成为 某一个 组的一部分。 
// 对于最后一组，如果字符串剩下的字符 不足 k 个，需使用字符 fill 来补全这一组字符。 
// 
//
// 注意，在去除最后一个组的填充字符 fill（如果存在的话）并按顺序连接所有的组后，所得到的字符串应该是 s 。 
//
// 给你一个字符串 s ，以及每组的长度 k 和一个用于填充的字符 fill ，按上述步骤处理之后，返回一个字符串数组，该数组表示 s 分组后 每个组的组成情
//况 。 
//
// 
//
// 示例 1： 
//
// 输入：s = "abcdefghi", k = 3, fill = "x"
//输出：["abc","def","ghi"]
//解释：
//前 3 个字符是 "abc" ，形成第一组。
//接下来 3 个字符是 "def" ，形成第二组。
//最后 3 个字符是 "ghi" ，形成第三组。
//由于所有组都可以由字符串中的字符完全填充，所以不需要使用填充字符。
//因此，形成 3 组，分别是 "abc"、"def" 和 "ghi" 。
// 
//
// 示例 2： 
//
// 输入：s = "abcdefghij", k = 3, fill = "x"
//输出：["abc","def","ghi","jxx"]
//解释：
//与前一个例子类似，形成前三组 "abc"、"def" 和 "ghi" 。
//对于最后一组，字符串中仅剩下字符 'j' 可以用。为了补全这一组，使用填充字符 'x' 两次。
//因此，形成 4 组，分别是 "abc"、"def"、"ghi" 和 "jxx" 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 100 
// s 仅由小写英文字母组成 
// 1 <= k <= 100 
// fill 是一个小写英文字母 
// 
// Related Topics 字符串 模拟 👍 12 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 2138.将字符串拆分为若干长度为 k 的组.divide-a-string-into-groups-of-size-k
 *
 * @author wangcy
 * @since  2022-10-08 10:38:05
 **/

  public class Solution_2138{
      public static void main(String[] args) {

          Solution solution = new Solution_2138().new Solution();
          String s = "abcdefghij";
          int k = 3;
          char fill = 'x';
          String[] strings = solution.divideString(s, k, fill);

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] divideString(String s, int k, char fill) {

        // 输入：s = "abcdefghij", k = 3, fill = "x"
        //输出：["abc","def","ghi","jxx"]
        //解释：
        //与前一个例子类似，形成前三组 "abc"、"def" 和 "ghi" 。
        //对于最后一组，字符串中仅剩下字符 'j' 可以用。为了补全这一组，使用填充字符 'x' 两次。
        //因此，形成 4 组，分别是 "abc"、"def"、"ghi" 和 "jxx" 。
                //构建一个链表用来记录 组数据
                List<String> list = new ArrayList<>();
                int n = s.length();
                //为的是除去最后一组数据之前的每k个字符拼凑到链表中
                for (int i = 0;i<=n-k;i+=k){
                    list.add(s.substring(i,i+k));
                }
                //到最后一组数据时进行判断是否需要填充
                if (n % k == 0)
                    return list.toArray(new String[0]);
                else {
                    //需要填充就按照下述方式进行填充
                    StringBuilder sb = new StringBuilder();
                    sb.append(s.substring(n - n%k,n));
                    for (int i = n%k;i<k;i++){
                        sb.append(fill);
                    }
                    list.add(sb.toString());
                    return list.toArray(new String[0]);
                }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }