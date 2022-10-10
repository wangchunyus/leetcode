

//你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有
//版本都是错的。 
//
// 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。 
//
// 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误
//的版本。你应该尽量减少对调用 API 的次数。 
// 
//
// 示例 1： 
//
// 
//输入：n = 5, bad = 4
//输出：4
//解释：
//调用 isBadVersion(3) -> false 
//调用 isBadVersion(5) -> true 
//调用 isBadVersion(4) -> true
//所以，4 是第一个错误的版本。
// 
//
// 示例 2： 
//
// 
//输入：n = 1, bad = 1
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= bad <= n <= 231 - 1 
// 
// Related Topics 二分查找 交互 
// 👍 336 👎 0


package array数组.leetcode.editor.cn;

/**
 * 278.第一个错误的版本.first-bad-version
 *
 * @author wangcy
 * @since  2021-06-30 16:48:41
 **/

  public class Solution_278{
      public static void main(String[] args) {

          Solution solution = new Solution_278().new Solution();
          solution.firstBadVersion(5);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution  {
    public int firstBadVersion(int n) {
        //还是二分查找 注意 这次mid可能会溢出 所以不能使用x+y 再除2了
        // 说白了就是找到false的后一个版本
        int left=1,right=n,mid;
        while(left<=right){
            mid=(right-left)/2 +left;
            //如果为true 则证明已经出错 左移
            if(isBadVersion(mid)){
                right=mid-1;
            }else{
                //为false 说明没错 但需要在true和false的交界处
                left=mid+1;
            }
        }
        //当返回左指针的时候 正好是我们要的第一个版本
        return left;
    }
    private boolean isBadVersion(int bad) {
        return false;

    }
}
//leetcode submit region end(Prohibit modification and deletion)


  }