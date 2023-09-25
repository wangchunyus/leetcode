

//给定一个数组 coordinates ，其中 coordinates[i] = [x, y] ，
// [x, y] 表示横坐标为 x、纵坐标为 y 的点。请你来判断，这些点是否在该坐标系中属于同一条直线上。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
//输出：true
// 
//
// 示例 2： 
//
// 
//
// 
//输入：coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 2 <= coordinates.length <= 1000 
// coordinates[i].length == 2 
// -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4 
// coordinates 中不含重复的点 
// 
//
// Related Topics 几何 数组 数学 👍 132 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 1232.缀点成线.check-if-it-is-a-straight-line
 *
 * @author wangcy
 * @since  2023-05-06 13:49:44
 **/

  public class Solution_1232{
      public static void main(String[] args) {
           Solution solution = new Solution_1232().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
      class Solution {
          public boolean checkStraightLine(int[][] coordinates) {
              int deltaX = coordinates[0][0], deltaY = coordinates[0][1];
              int n = coordinates.length;
              for (int i = 0; i < n; i++) {
                  coordinates[i][0] -= deltaX;
                  coordinates[i][1] -= deltaY;
              }
              int A = coordinates[1][1], B = -coordinates[1][0];
              for (int i = 2; i < n; i++) {
                  int x = coordinates[i][0], y = coordinates[i][1];
                  if (A * x + B * y != 0) {
                      return false;
                  }
              }
              return true;
          }
      }


//leetcode submit region end(Prohibit modification and deletion)

  }