### 解题思路
把数组内非0元素按照顺序从0开始填充，填充一个，cnt++；然后把cnt——nums.length的元素变为0；
![0000.jpg](https://pic.leetcode-cn.com/1621518464-APoyQV-0000.jpg)

### 代码

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[cnt++] = nums[i];
            }
        }
        while(cnt < nums.length){
            nums[cnt++] = 0;
        }
    }
}
```