

//车上最初有 capacity 个空座位。车 只能 向一个方向行驶（也就是说，不允许掉头或改变方向） 
//
// 给定整数 capacity 和一个数组 trips , trip[i] = [numPassengersi, fromi, toi] 表示第 i 次旅行有
// numPassengersi 乘客，接他们和放他们的位置分别是 fromi 和 toi 。这些位置是从汽车的初始位置向东的公里数。 
//
// 当且仅当你可以在所有给定的行程中接送所有乘客时，返回 true，否则请返回 false。 
//
// 
//
// 示例 1： 
//
// 
//输入：trips = [[2,1,5],[3,3,7]], capacity = 4
//输出：false
// 
//
// 示例 2： 
//
// 
//输入：trips = [[2,1,5],[3,3,7]], capacity = 5
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= trips.length <= 1000 
// trips[i].length == 3 
// 1 <= numPassengersi <= 100 
// 0 <= fromi < toi <= 1000 
// 1 <= capacity <= 10⁵ 
// 
// Related Topics 数组 前缀和 排序 模拟 堆（优先队列） 👍 195 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 1094.拼车.car-pooling
 *
 * @author wangcy
 * @since  2022-08-04 14:16:34
 **/

  public class Solution_1094{
      public static void main(String[] args) {
           Solution solution = new Solution_1094().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        //最多1000个车站
        int[] nums = new int[1001];
        Difference difference = new Difference(nums);
        for (int[] trip : trips) {
            int val = trip[0];
            int i = trip[1];//从0开始
            int j = trip[2]-1;
            difference.increment(i,j,val);
        }
        int[] result = difference.result();
        for (int i : result) {
            if(i > capacity){
                return false;

            }
        }
        return true;
    }
}

     public class Difference {

         //定义一个差分数组
         private int[] diff;

         public Difference(int[] nums) {
             assert  nums.length > 0;
             diff = new int[nums.length];
             //根据初始数组构造查分数组
             diff[0] = nums[0];
             for (int i = 1; i < nums.length; i++) {
                 diff[i] = nums[i]-nums[i-1];
             }
         }
         /*
         给闭区间[i,j] 增加val 可以是负数
          */
         public void increment(int i,int j,int val){
             diff[i] +=val;
             //此处判断 如果闭区间中右侧 已经到差分数组的最后一个数了，就不需要 在减去val
             if(j+1 < diff.length){
                 diff[j+1]-=val;
             }
         }
         /*
         返回结果数组
          */
         public int[] result(){
             int[] res = new int[diff.length];
             res[0] = diff[0];
             for (int i = 1; i < diff.length; i++) {
                 res[i] = res[i-1]+diff[i];
             }
             return res;
         }
     }

//leetcode submit region end(Prohibit modification and deletion)

  }