

//给定包含多个点的集合，从其中取三个点组成三角形，返回能组成的最大三角形的面积。 
//
// 
//示例:
//输入: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
//输出: 2
//解释: 
//这五个点如下图所示。组成的橙色三角形是最大的，面积为2。
// 
//
// 
//
// 注意: 
//
// 
// 3 <= points.length <= 50. 
// 不存在重复的点。 
// -50 <= points[i][j] <= 50. 
// 结果误差值在 10^-6 以内都认为是正确答案。 
// 
// Related Topics 几何 数组 数学 👍 174 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 812.最大三角形面积.largest-triangle-area
 *
 * @author wangcy
 * @since  2022-07-04 18:53:55
 **/

  public class Solution_812{
      public static void main(String[] args) {

          Solution solution = new Solution_812().new Solution();
          int[][] ar ={{1,0},{0,0},{0,1}};
          double v = solution.largestTriangleArea(ar);
          System.out.println(v);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double largestTriangleArea(int[][] points) {
        int a = 0;
        int b = 0;
        int length = points.length;
        for (int i = 0; i < length; i++) {
            if(points[i][0] == 0){
                b = Math.max(b,points[i][1]);
            }
            if(points[i][1] == 0){
                a = Math.max(a,points[i][0]);
            }
        }
        double i = (double) (a * b) / 2;
        return i;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }