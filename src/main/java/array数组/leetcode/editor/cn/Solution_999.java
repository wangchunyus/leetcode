

//在一个 8 x 8 的棋盘上，有一个白色的车（Rook），用字符 'R' 表示。棋盘上还可能存在空方块，白色的象（Bishop）以及黑色的卒（pawn），分
//别用字符 '.'，'B' 和 'p' 表示。不难看出，大写字符表示的是白棋，小写字符表示的是黑棋。 
//
// 车按国际象棋中的规则移动。东，西，南，北四个基本方向任选其一，然后一直向选定的方向移动，直到满足下列四个条件之一： 
//
// 
// 棋手选择主动停下来。 
// 棋子因到达棋盘的边缘而停下。 
// 棋子移动到某一方格来捕获位于该方格上敌方（黑色）的卒，停在该方格内。 
// 车不能进入/越过已经放有其他友方棋子（白色的象）的方格，停在友方棋子前。 
// 
//
// 你现在可以控制车移动一次，请你统计有多少敌方的卒处于你的捕获范围内（即，可以被一步捕获的棋子数）。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：[[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",
//".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",
//".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".",
//"."],[".",".",".",".",".",".",".","."]]
//输出：3
//解释：
//在本例中，车能够捕获所有的卒。
// 
//
// 示例 2： 
//
// 
//
// 输入：[[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".",
//"p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B",
//"p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".",
//"."],[".",".",".",".",".",".",".","."]]
//输出：0
//解释：
//象阻止了车捕获任何卒。
// 
//
// 示例 3： 
//
// 
//
// 输入：[[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",
//".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",
//".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".",
//"."],[".",".",".",".",".",".",".","."]]
//输出：3
//解释： 
//车可以捕获位置 b5，d6 和 f5 的卒。
// 
//
// 
//
// 提示： 
//
// 
// board.length == board[i].length == 8 
// board[i][j] 可以是 'R'，'.'，'B' 或 'p' 
// 只有一个格子上存在 board[i][j] == 'R' 
// 
// Related Topics 数组 矩阵 模拟 👍 98 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 999.可以被一步捕获的棋子数.available-captures-for-rook
 *
 * @author wangcy
 * @since  2022-07-07 10:23:49
 **/

  public class Solution_999{
      public static void main(String[] args) {


          Solution solution = new Solution_999().new Solution();
          char[][] arr ={{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.',
                  '.','.','R','.','.','.','p'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.',
                  '.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.',
                  '.'},{'.','.','.','.','.','.','.','.'}};
          int i = solution.numRookCaptures(arr);
          System.out.println(i);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numRookCaptures(char[][] board) {
        //第一步获取 R的矩阵坐标
        int row = board.length;
        int col = board[0].length;
        int rowR = 0;
        int colR = 0;
        for (int i = 0; i < row; i++) {
            for (int i1 = 0; i1 < col; i1++) {
                if(board[i][i1] == 'R'){
                    rowR = i;
                    colR = i1;
                    break;
                }
            }
        }
        //第二部分别获取R的上下左右方向可以吃的卒p
        int count = 0;
        //上
        for (int i = rowR-1; i >=0 ; i--) {
            if(board[i][colR] == 'B'){
                break;
            }else if(board[i][colR] == 'p'){
                count++;
                break;
            }
        }
        //下
        for (int i = rowR+1; i < 8 ; i++) {
            if(board[i][colR] == 'B'){
                break;
            }else if(board[i][colR] == 'p'){
                count++;
                break;
            }
        }
        //左
        for (int i = colR-1; i >=0 ; i--) {
            if(board[rowR][i] == 'B'){
                break;
            }else if(board[rowR][i] == 'p'){
                count++;
                break;
            }
        }
        //右
        for (int i = colR+1; i < 8 ; i++) {
            if(board[rowR][i] == 'B'){
                break;
            }else if(board[rowR][i] == 'p'){
                count++;
                break;
            }
        }
        return count;



    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }