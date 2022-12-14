突然就顿悟了……
用暴力的方式写了一遍，如下：

```
    public int[] sortedSquares01(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
```

依赖于java类库的排序。

看了好几篇双指针题解，还是理解不了，可是刚刚突然就顿悟了……

记录一下，第一次写题解。

题目说的有序数组，有三种情况。

（1）全是负数

-6，-5，-4，-3，-2

（2）全是正数

1，3，4，5，6，7

（3）有正有负

-3，-2，0，5，6，7

仔细观察，我们就可知道，不管是（1）（2）（3）的哪种情况，**元素的平方最大值一定产生在原数组的最左边或者最右边。**

题目要求我们生成一个平方数组，从小到大排好序返回，我们这里已经能够确定平方最大值的产生位置了。

我们将最大值放入平方数组的最后一个位置就好了。

```
    public int[] sortedSquares(int[] nums) {
        // 左指针，指向原数组最左边
        int left = 0;
        // 有指针，指向原数组最右边
        int right = nums.length - 1;
        // 创建一个新数组，存储平方值
        int[] result = new int[nums.length];
        // 得到元素值平方值，从新数组最后位置开始写
        int write = nums.length - 1;
        // 左右指针相遇（逐渐靠拢的过程）之后不再循环
        while (left <= right){
            // 如果原数组的左指针对应的平方值大于右指针，那么往新数组最后位置写入左指针对应的平方值
            if (nums[left] * nums[left] > nums[right] * nums[right]){
                result[write] = nums[left] * nums[left];
                // 左指针右移
                left ++;
                // 移动新数组待写入的位置
                write --;
            }
            else {
                result[write] = nums[right] * nums[right];
                right --;
                write --;
            }
        }
        return result;
    }
```
在这道题中，最关键的点就是：**原数组中的元素平方最大值一定产生在原数组的最左边或者最右边。**
