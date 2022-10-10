### 解题思路
![image.png](https://pic.leetcode-cn.com/1621010081-msgGiO-image.png)
先排序，然后遍历一遍，遇到val就，继续遍历，直到不等于val就通过len加入nums中
### 代码

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int len = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val) {
                len = i;
                while( (i + 1) != nums.length && nums[i + 1] == val) i++;
            }
            if(i != nums.length && nums[i] != val) nums[len++] = nums[i];
        }
        return len;
    }
}

```