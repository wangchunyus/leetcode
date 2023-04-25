

//给定一个整数数组 arr，如果它是有效的山脉数组就返回 true，否则返回 false。
//
// 让我们回顾一下，如果 arr 满足下述条件，那么它是一个山脉数组：
//
//
// arr.length >= 3
// 在 0 < i < arr.length - 1 条件下，存在 i 使得：
//
// arr[0] < arr[1] < ... arr[i-1] < arr[i]
// arr[i] > arr[i+1] > ... > arr[arr.length - 1]
//
//
//
//
//
//
//
//
//
// 示例 1：
//
//
//输入：arr = [2,1]
//输出：false
//
//
// 示例 2：
//
//
//输入：arr = [3,5,5]
//输出：false
//
//
// 示例 3：
//
//
//输入：arr = [0,3,2,1]
//输出：true
//
//
//
// 提示：
//
//
// 1 <= arr.length <= 10⁴
// 0 <= arr[i] <= 10⁴
//
//
// Related Topics 数组 👍 206 👎 0


package array数组.leetcode.editor.cn;

/**
 * 941.有效的山脉数组.valid-mountain-array
 *
 * @author wangcy
 * @since 2023-04-25 09:50:25
 **/

public class Solution_941 {
    public static void main(String[] args) {

        Solution solution = new Solution_941().new Solution();
        int[] arr = {1,3,2};
        boolean b = solution.validMountainArray(arr);
        System.out.println(b);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean validMountainArray(int[] arr) {
            int length = arr.length;
            if (length < 3) {
                return false;
            }
            for (int i = 0; i < length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    return false;
                }
            }
            int index = 0; //山脉中间滴下标
            for (int i = 0; i < length; i++) {
                if (i != 0 && i <= length - 2) {
                    if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                        index = i;
                        break;
                    }
                }
            }
            if (index == 0) {
                return false;
            }
            //山脉左边是否递增
            return mountaionUpOrDown(arr, index, true) && mountaionUpOrDown(arr, index, false);

        }

        private boolean mountaionUpOrDown(int[] arr, int index, boolean b) {
            //true 递增
            if (b) {
                for (int i = 0; i < index; i++) {
                    if (arr[i] > arr[i + 1]) {
                        return false;
                    }
                }
            } else {
                for (int i = index; i < arr.length - 1; i++) {
                    if (arr[i] < arr[i + 1]) {
                        return false;
                    }

                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}