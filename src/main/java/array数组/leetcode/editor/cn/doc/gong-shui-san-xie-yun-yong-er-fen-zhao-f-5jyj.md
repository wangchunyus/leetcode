## 二分 

一道二分裸题，写二分重点在于学会从「二段性」出发进行分析，想清楚二分的是哪个端点/边界。

而不是局限于用什么模板，大于还是小于，硬记这些对理解二分不会有任何帮助。

事实上，当搞清楚二分的是什么内容之后，何种形式写法都能写出。

代码：

```Java []
class Solution {
    public int search(int[] nums, int t) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (nums[mid] <= t) l = mid;
            else r = mid - 1;
        }
        return nums[r] == t ? r : -1;
    }
}
```
```Java []
class Solution {
    public int search(int[] nums, int t) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= t) r = mid;
            else l = mid + 1;
        }
        return nums[r] == t ? r : -1;
    }
}
```
* 时间复杂度：![O(\log{n}) ](./p__O_log{n}__.png) 
* 空间复杂度：*O(1)*

---

## 其他「二分」相关内容

题太简单？不如来复习一下「[矩阵快速幂](https://mp.weixin.qq.com/s?__biz=MzU4NDE3MTEyMA==&mid=2247488373&idx=1&sn=2845f7d6966658f1bb82e1dfb086dfad&chksm=fd9cb86acaeb317c3cba3aea9e63ae728749b74482494448151643bedb783d6597d7c640774b&token=747931765&lang=zh_CN#rd)」，然后文末随手抽本紫书 /doge

| 题目                                                                                          | 题解                                                                                                                                                   | 难度 | 推荐指数 |
| --------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ---- | -------- |
| [4. 寻找两个正序数组的中位数 ](https://leetcode-cn.com/problems/median-of-two-sorted-arrays/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/median-of-two-sorted-arrays/solution/shua-chuan-lc-po-su-jie-fa-fen-zhi-jie-f-wtu2/) | 困难 | 🤩🤩🤩🤩 |
| [29. 两数相除](https://leetcode-cn.com/problems/divide-two-integers/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/divide-two-integers/solution/shua-chuan-lc-er-fen-bei-zeng-cheng-fa-j-m73b) | 中等 | 🤩🤩🤩 |
| [33. 搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/shua-chuan-lc-yan-ge-ologn100yi-qi-kan-q-xifo/) | 中等 | 🤩🤩🤩🤩🤩 |
| [34. 在排序数组中查找元素的第一个和最后一个位置](https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/solution/sha-sha-gao-bu-qing-ru-he-ding-yi-er-fen-rrj1/) | 中等 | 🤩🤩🤩🤩🤩 |
| [35. 搜索插入位置](https://leetcode-cn.com/problems/search-insert-position/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/search-insert-position/solution/shua-chuan-lc-jian-dan-mo-ni-ti-by-ac_oi-7d5t/) | 简单 | 🤩🤩🤩🤩🤩 |
| [74. 搜索二维矩阵](https://leetcode-cn.com/problems/search-a-2d-matrix/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/search-a-2d-matrix/solution/gong-shui-san-xie-yi-ti-shuang-jie-er-fe-l0pq/) | 中等 | 🤩🤩🤩🤩 |
| [81. 搜索旋转排序数组 II](https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/solution/gong-shui-san-xie-xiang-jie-wei-he-yuan-xtam4//) | 中等 | 🤩🤩🤩🤩 |
| [153. 寻找旋转排序数组中的最小值](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/solution/gong-shui-san-xie-yan-ge-olognyi-qi-kan-6d969/) | 中等 | 🤩🤩🤩 |
| [154. 寻找旋转排序数组中的最小值 II](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/solution/gong-shui-san-xie-xiang-jie-wei-he-yuan-7xbty/) | 困难 | 🤩🤩🤩 |
| [220. 存在重复元素 III](https://leetcode-cn.com/problems/contains-duplicate-iii/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/contains-duplicate-iii/solution/gong-shui-san-xie-yi-ti-shuang-jie-hua-d-dlnv/) | 中等 | 🤩🤩🤩 |
| [274. H 指数](https://leetcode-cn.com/problems/h-index/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/h-index/solution/gong-shui-san-xie-li-yong-er-duan-xing-z-1jxw/) | 中等 | 🤩🤩🤩 |
| [275. H 指数 II](https://leetcode-cn.com/problems/h-index-ii/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/h-index-ii/solution/gong-shui-san-xie-liang-chong-er-fen-ji-sovjb/) | 中等 | 🤩🤩🤩 |
| [278. 第一个错误的版本](https://leetcode-cn.com/problems/first-bad-version/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/first-bad-version/solution/gong-shui-san-xie-shi-yong-jiao-hu-han-s-8hpv/) | 简单 | 🤩🤩🤩🤩 |
| [354. 俄罗斯套娃信封问题](https://leetcode-cn.com/problems/russian-doll-envelopes/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/russian-doll-envelopes/solution/zui-chang-shang-sheng-zi-xu-lie-bian-xin-6s8d/) | 困难 | 🤩🤩🤩 |
| [363. 矩形区域不超过 K 的最大数值和](https://leetcode-cn.com/problems/max-sum-of-rectangle-no-larger-than-k/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/max-sum-of-rectangle-no-larger-than-k/solution/gong-shui-san-xie-you-hua-mei-ju-de-ji-b-dh8s/) | 困难 | 🤩🤩🤩 |
| [374. 猜数字大小](https://leetcode-cn.com/problems/guess-number-higher-or-lower/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/guess-number-higher-or-lower/solution/gong-shui-san-xie-shi-yong-jiao-hu-han-s-tocm/) | 简单 | 🤩🤩🤩 |
| [528. 按权重随机选择](https://leetcode-cn.com/problems/random-pick-with-weight/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/random-pick-with-weight/solution/gong-shui-san-xie-yi-ti-shuang-jie-qian-8bx50/) | 中等 | 🤩🤩🤩🤩 |
| [611. 有效三角形的个数](https://leetcode-cn.com/problems/valid-triangle-number/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/valid-triangle-number/solution/gong-shui-san-xie-yi-ti-san-jie-jian-dan-y1we/) | 中等 | 🤩🤩🤩🤩 |
| [778. 水位上升的泳池中游泳](https://leetcode-cn.com/problems/swim-in-rising-water/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/swim-in-rising-water/solution/gong-shui-san-xie-yi-ti-shuang-jie-krusk-7c6o/) | 困难 | 🤩🤩🤩 |
| [852. 山脉数组的峰顶索引](https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/solution/gong-shui-san-xie-er-fen-san-fen-cha-zhi-5gfv/) | 简单 | 🤩🤩🤩🤩🤩 |
| [981. 基于时间的键值存储](https://leetcode-cn.com/problems/time-based-key-value-store/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/time-based-key-value-store/solution/gong-shui-san-xie-yi-ti-shuang-jie-ha-xi-h5et/) | 中等 | 🤩🤩🤩🤩 |
| [1004. 最大连续1的个数 III](https://leetcode-cn.com/problems/max-consecutive-ones-iii/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/max-consecutive-ones-iii/solution/san-chong-jie-fa-cong-dong-tai-gui-hua-d-gxks/) | 中等 | 🤩🤩🤩 |
| [1011. 在 D 天内送达包裹的能力](https://leetcode-cn.com/problems/capacity-to-ship-packages-within-d-days/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/capacity-to-ship-packages-within-d-days/solution/gong-shui-san-xie-li-yong-er-duan-xing-z-95zj/) | 中等 | 🤩🤩🤩🤩 |
| [1208. 尽可能使字符串相等](https://leetcode-cn.com/problems/get-equal-substrings-within-budget/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/get-equal-substrings-within-budget/solution/ni-bu-ke-neng-kan-bu-dong-de-qian-zhui-h-u4l1/) | 中等 | 🤩🤩🤩 |
| [1337. 矩阵中战斗力最弱的 K 行](https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/solution/gong-shui-san-xie-yi-ti-shuang-jie-po-su-7okx/) | 简单 | 🤩🤩🤩 |
| [1438. 绝对差不超过限制的最长连续子数组](https://leetcode-cn.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/solution/xiang-jie-er-fen-hua-dong-chuang-kou-dan-41g1/) | 中等 | 🤩🤩🤩      |
| [1482. 制作 m 束花所需的最少天数](https://leetcode-cn.com/problems/minimum-number-of-days-to-make-m-bouquets/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/minimum-number-of-days-to-make-m-bouquets/solution/gong-shui-san-xie-li-yong-er-duan-xing-z-ysv4/) | 中等 | 🤩🤩🤩 |
| [1707. 与数组中元素的最大异或值](https://leetcode-cn.com/problems/maximum-xor-with-an-element-from-array/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/maximum-xor-with-an-element-from-array/solution/gong-shui-san-xie-jie-zhe-ge-wen-ti-lai-lypqr/) | 困难 | 🤩🤩🤩 |
| [1713. 得到子序列的最少操作次数](https://leetcode-cn.com/problems/minimum-operations-to-make-a-subsequence/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/minimum-operations-to-make-a-subsequence/solution/gong-shui-san-xie-noxiang-xin-ke-xue-xi-oj7yu/) | 困难 | 🤩🤩🤩 |
| [1751. 最多可以参加的会议数目 II](https://leetcode-cn.com/problems/maximum-number-of-events-that-can-be-attended-ii/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/maximum-number-of-events-that-can-be-attended-ii/solution/po-su-dp-er-fen-dp-jie-fa-by-ac_oier-88du/) | 困难 | 🤩🤩🤩      |
| [1818. 绝对差值和](https://leetcode-cn.com/problems/minimum-absolute-sum-difference/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/minimum-absolute-sum-difference/solution/gong-shui-san-xie-tong-guo-er-fen-zhao-z-vrmq/) | 中等 | 🤩🤩🤩🤩🤩 |
| [1838. 最高频元素的频数](https://leetcode-cn.com/problems/frequency-of-the-most-frequent-element/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/frequency-of-the-most-frequent-element/solution/gong-shui-san-xie-cong-mei-ju-dao-pai-xu-kxnk/) | 中等 | 🤩🤩🤩 |
| [剑指 Offer 53 - I. 在排序数组中查找数字 I](https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/) | [LeetCode 题解链接](https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/solution/gong-shui-san-xie-liang-chong-er-fen-ton-3epx/) | 简单 | 🤩🤩🤩🤩🤩 |



**注：以上目录整理来自 [wiki](https://github.com/SharingSource/LogicStack-LeetCode/wiki/二分)，任何形式的转载引用请保留出处。**
