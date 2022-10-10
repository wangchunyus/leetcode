

//给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。 
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。 
//
// 
//
// 
//
// 示例 1: 
//
// 
//输入: rowIndex = 3
//输出: [1,3,3,1]
// 
//
// 示例 2: 
//
// 
//输入: rowIndex = 0
//输出: [1]
// 
//
// 示例 3: 
//
// 
//输入: rowIndex = 1
//输出: [1,1]
// 
//
// 
//
// 提示: 
//
// 
// 0 <= rowIndex <= 33 
// 
//
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(rowIndex) 空间复杂度吗？ 
// Related Topics 数组 动态规划 👍 408 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 119.杨辉三角 II.pascals-triangle-ii
 *
 * @author wangcy
 * @since  2022-07-08 10:20:08
 **/

  public class Solution_119{
      public static void main(String[] args) {

          Solution solution = new Solution_119().new Solution();
          List<Integer> row = solution.getRow(4);
          for (Integer integer : row) {
              System.out.print(integer+",");
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<int[]> inums = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            int[] ints = new int[i+1];
            if(inums. size() > 0){
                for (int j = 0; j < i+1; j++) {
                    int[] ints1 = inums.get(i - 1);
                    if(j == 0){
                        ints[j] = ints1[0];
                    }else if(j == i){
                        ints[j] = ints1[ints1.length-1];
                    }else{
                        ints[j] = ints1[j-1]+ints1[j];
                    }
                }
            }else{
                ints[i] = 1;
            }
            inums.add(ints);
        }
        int[] ints = inums.get(inums.size() - 1);
        List<Integer> result = new ArrayList<>();
        for (int anInt : ints) {
            result.add(anInt);
        }
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }