

//给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。 
//
// 完成所有替换操作后，请你返回这个数组。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr = [17,18,5,4,6,1]
//输出：[18,6,6,6,1,-1]
//解释：
//- 下标 0 的元素 --> 右侧最大元素是下标 1 的元素 (18)
//- 下标 1 的元素 --> 右侧最大元素是下标 4 的元素 (6)
//- 下标 2 的元素 --> 右侧最大元素是下标 4 的元素 (6)
//- 下标 3 的元素 --> 右侧最大元素是下标 4 的元素 (6)
//- 下标 4 的元素 --> 右侧最大元素是下标 5 的元素 (1)
//- 下标 5 的元素 --> 右侧没有其他元素，替换为 -1
// 
//
// 示例 2： 
//
// 
//输入：arr = [400]
//输出：[-1]
//解释：下标 0 的元素右侧没有其他元素。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10⁴ 
// 1 <= arr[i] <= 10⁵ 
// 
// Related Topics 数组 👍 82 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 1299.将每个元素替换为右侧最大元素.replace-elements-with-greatest-element-on-right-side
 *
 * @author wangcy
 * @since  2022-07-15 10:06:34
 **/

  public class Solution_1299{
      public static void main(String[] args) {

          Solution solution = new Solution_1299().new Solution();
          int[] arr = {400};
          int[] i = solution.replaceElements(arr);
          for (int i1 : i) {
              System.out.print(i1+",");
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] replaceElements(int[] arr) {
        //输入：arr = [17,18,5,4,6,1]
        //输出：[18,6,6,6,1,-1]
        //解释：
        //- 下标 0 的元素 --> 右侧最大元素是下标 1 的元素 (18)
        //- 下标 1 的元素 --> 右侧最大元素是下标 4 的元素 (6)
        //- 下标 2 的元素 --> 右侧最大元素是下标 4 的元素 (6)
        //- 下标 3 的元素 --> 右侧最大元素是下标 4 的元素 (6)
        //- 下标 4 的元素 --> 右侧最大元素是下标 5 的元素 (1)
        //- 下标 5 的元素 --> 右侧没有其他元素，替换为 -1
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = maxNum(i,arr);
        }
        return result;
    }
    public int maxNum(int index , int[] arr){
        int count = Integer.MIN_VALUE;
        if(index == arr.length-1){
            return -1;
        }
        for (int i = index+1; i <arr.length ; i++) {

             count = Math.max(count,arr[i]);
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }