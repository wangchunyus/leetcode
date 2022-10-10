### 解题思路
![截屏2021-04-19 上午8.25.50.png](https://pic.leetcode-cn.com/1618791960-iwbUBF-%E6%88%AA%E5%B1%8F2021-04-19%20%E4%B8%8A%E5%8D%888.25.50.png)
<br>
**遍历数组计算当前索引的累计val数，然后移位即可！**

### 代码

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == val){
                ++count;
            }else{
                nums[i - count] = nums[i];
            }
        }
        return nums.length - count;
    }
}
```