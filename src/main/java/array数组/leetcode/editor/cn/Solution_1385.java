

//给你两个整数数组 arr1 ， arr2 和一个整数 d ，请你返回两个数组之间的 距离值 。 
//
// 「距离值」 定义为符合此距离要求的元素数目：对于元素 arr1[i] ，不存在任何元素 arr2[j] 满足 |arr1[i]-arr2[j]| <= 
//d 。 
//
// 
//
// 示例 1： 
//
// 输入：arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
//输出：2
//解释：
//对于 arr1[0]=4 我们有：
//|4-10|=6 > d=2 
//|4-9|=5 > d=2 
//|4-1|=3 > d=2 
//|4-8|=4 > d=2 
//所以 arr1[0]=4 符合距离要求
//
//对于 arr1[1]=5 我们有：
//|5-10|=5 > d=2 
//|5-9|=4 > d=2 
//|5-1|=4 > d=2 
//|5-8|=3 > d=2
//所以 arr1[1]=5 也符合距离要求
//
//对于 arr1[2]=8 我们有：
//|8-10|=2 <= d=2
//|8-9|=1 <= d=2
//|8-1|=7 > d=2
//|8-8|=0 <= d=2
//存在距离小于等于 2 的情况，不符合距离要求 
//
//故而只有 arr1[0]=4 和 arr1[1]=5 两个符合距离要求，距离值为 2 
//
// 示例 2： 
//
// 输入：arr1 = [1,4,2,3], arr2 = [-4,-3,6,10,20,30], d = 3
//输出：2
// 
//
// 示例 3： 
//
// 输入：arr1 = [2,1,100,3], arr2 = [-5,-2,10,-3,7], d = 6
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr1.length, arr2.length <= 500 
// -10^3 <= arr1[i], arr2[j] <= 10^3 
// 0 <= d <= 100 
// 
// Related Topics 数组 双指针 二分查找 排序 👍 65 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 1385.两个数组间的距离值.find-the-distance-value-between-two-arrays
 *
 * @author wangcy
 * @since 2022-07-12 14:57:07
 **/

public class Solution_1385 {
    public static void main(String[] args) {

        Solution solution = new Solution_1385().new Solution();
        int[] arr1 = {2, 1, 100, 3};
        int[] arr2 = {-5, -2, 10, -3, 7};
        int d = 6;
        int theDistanceValue = solution.findTheDistanceValue(arr1, arr2, d);
        System.out.println(theDistanceValue);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            Arrays.sort(arr2);
            int cnt = 0;
            for (int x : arr1) {
                int p = binarySearch(arr2, x);
                boolean ok = true;
                if (p < arr2.length) {
                    ok &= arr2[p] - x > d;
                }
                if (p - 1 >= 0 && p - 1 <= arr2.length) {
                    ok &= x - arr2[p - 1] > d;
                }
                cnt += ok ? 1 : 0;
            }
            return cnt;
        }

        public int binarySearch(int[] arr, int target) {
            int low = 0, high = arr.length - 1;
            if (arr[high] < target) {
                return high + 1;
            }
            while (low < high) {
                int mid = (high - low) / 2 + low;
                if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}