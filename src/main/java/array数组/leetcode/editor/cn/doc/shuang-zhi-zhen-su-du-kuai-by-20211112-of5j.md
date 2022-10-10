### 解题思路
此处撰写解题思路
双指针，给数组进行排序，
### 代码

```java

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int head = 0;
        int index = nums.length-1;
        int end = res.length - 1;
        while(head <= end){
            if((nums[head] * nums[head]) > (nums[end]*nums[end])){
                res[index--] = nums[head] * nums[head];
                head++;
            }else{
                //<= 的情况 ， 等于的话先赋值后面的
                res[index--] = nums[end]*nums[end];
                end--;
            }
        }
        return res;
    }
}
```