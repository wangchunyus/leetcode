

//A 和 B 在一个 3 x 3 的网格上玩井字棋。 
//
// 井字棋游戏的规则如下： 
//
// 
// 玩家轮流将棋子放在空方格 (" ") 上。 
// 第一个玩家 A 总是用 "X" 作为棋子，而第二个玩家 B 总是用 "O" 作为棋子。 
// "X" 和 "O" 只能放在空方格中，而不能放在已经被占用的方格上。 
// 只要有 3 个相同的（非空）棋子排成一条直线（行、列、对角线）时，游戏结束。 
// 如果所有方块都放满棋子（不为空），游戏也会结束。 
// 游戏结束后，棋子无法再进行任何移动。 
// 
//
// 给你一个数组 moves，其中每个元素是大小为 2 的另一个数组（元素分别对应网格的行和列），它按照 A 和 B 的行动顺序（先 A 后 B）记录了两人各
//自的棋子位置。 
//
// 如果游戏存在获胜者（A 或 B），就返回该游戏的获胜者；如果游戏以平局结束，则返回 "Draw"；如果仍会有行动（游戏未结束），则返回 
//"Pending"。 
//
// 你可以假设 moves 都 有效（遵循井字棋规则），网格最初是空的，A 将先行动。 
//
// 
//
// 示例 1： 
//
// 输入：moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
//输出："A"
//解释："A" 获胜，他总是先走。
//"X  "    "X  "    "X  "    "X  "    "X  "
//"   " -> "   " -> " X " -> " X " -> " X "
//"   "    "O  "    "O  "    "OO "    "OOX"
// 
//
// 示例 2： 
//
// 输入：moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
//输出："B"
//解释："B" 获胜。
//"X  "    "X  "    "XX "    "XXO"    "XXO"    "XXO"
//"   " -> " O " -> " O " -> " O " -> "XO " -> "XO " 
//"   "    "   "    "   "    "   "    "   "    "O  "
// 
//
// 示例 3： 
//
// 输入：moves = [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]
//输出："Draw"
//输出：由于没有办法再行动，游戏以平局结束。
//"XXO"
//"OOX"
//"XOX"
// 
//
// 示例 4： 
//
// 输入：moves = [[0,0],[1,1]]
//输出："Pending"
//解释：游戏还没有结束。
//"X  "
//" O "
//"   "
// 
//
// 
//
// 提示： 
//
// 
// 1 <= moves.length <= 9 
// moves[i].length == 2 
// 0 <= moves[i][j] <= 2 
// moves 里没有重复的元素。 
// moves 遵循井字棋的规则。 
// 
//
// Related Topics 数组 哈希表 矩阵 模拟 👍 83 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;

/**
 * 1275.找出井字棋的获胜者.find-winner-on-a-tic-tac-toe-game
 *
 * @author wangcy
 * @since  2023-09-11 15:49:42
 **/

  public class Solution_1275{
      public static void main(String[] args) {
           Solution solution = new Solution_1275().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
      class Solution {
          public String tictactoe(int[][] moves) {
              int C = moves.length;
              // 只需要考虑最后一步棋和前面的是否能够组成一个三连
              int[] last = moves[C-1];
               int row =0, col=0, main=0, sub=0;

              int index = C-1;
              while (index >= 0){
                  int current[] = moves[index];
                  if(current[1] == last[1])   row++;
                  if(current[0] == last[0])   col++;
                  if(current[0] == current[1]) main++;
                  if(current[0] + current[1] == 2) sub++;
                  index -= 2;
              }
              if(row>=3 || col>=3 || main>=3 || sub>=3){
                  return C%2 == 0? "B":"A";
              }
              if(C < 9) return "Pending";
              return "Draw";
          }
      }

//leetcode submit region end(Prohibit modification and deletion)

  }