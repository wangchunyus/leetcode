

//给你两个字符串 current 和 correct ，表示两个 24 小时制时间 。 
//
// 24 小时制时间 按 "HH:MM" 进行格式化，其中 HH 在 00 和 23 之间，而 MM 在 00 和 59 之间。最早的 24 小时制时间为 0
//0:00 ，最晚的是 23:59 。 
//
// 在一步操作中，你可以将 current 这个时间增加 1、5、15 或 60 分钟。你可以执行这一操作 任意 次数。 
//
// 返回将 current 转化为 correct 需要的 最少操作数 。 
//
// 
//
// 示例 1： 
//
// 输入：current = "02:30", correct = "04:35"
//输出：3
//解释：
//可以按下述 3 步操作将 current 转换为 correct ：
//- 为 current 加 60 分钟，current 变为 "03:30" 。
//- 为 current 加 60 分钟，current 变为 "04:30" 。 
//- 为 current 加 5 分钟，current 变为 "04:35" 。
//可以证明，无法用少于 3 步操作将 current 转化为 correct 。 
//
// 示例 2： 
//
// 输入：current = "11:00", correct = "11:01"
//输出：1
//解释：只需要为 current 加一分钟，所以最小操作数是 1 。
// 
//
// 
//
// 提示： 
//
// 
// current 和 correct 都符合 "HH:MM" 格式 
// current <= correct 
// 
//
// Related Topics 贪心 字符串 👍 8 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 2224.转化时间需要的最少操作数.minimum-number-of-operations-to-convert-time
 *
 * @author wangcy
 * @since  2022-10-17 17:04:27
 **/

  public class Solution_2224{
      public static void main(String[] args) {
           Solution solution = new Solution_2224().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int convertTime(String current, String correct) {
                String[] currentTime = current.split(":");
                int currentSecond = Integer.parseInt(currentTime[0]) * 60 + Integer.parseInt(currentTime[1]);
                String[] correctTime = correct.split(":");
                int correctSecond = Integer.parseInt(correctTime[0]) * 60 + Integer.parseInt(correctTime[1]);
                int difSecond  =correctSecond - currentSecond;
                int cnt = 0;
                cnt += difSecond / 60;
                difSecond = difSecond % 60;
                cnt += difSecond / 15;
                difSecond = difSecond % 15;
                cnt += difSecond / 5;
                difSecond = difSecond % 5;
                cnt += difSecond / 1;
                difSecond = difSecond % 1;
                return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }