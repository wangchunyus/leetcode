### 解题思路
此处撰写解题思路
如下注解

### 代码

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        // 获取长度
        int length = nums.length;

        // 初始化返回结果
        int result = length;

        /*
        由于提示中说明了 0 <= nums[i] <= 50
        因此遍历数组中的元素，并把和val相等的元素保存一个大于50的数，
        并把结果减1
        * */
        for (int i = 0 ; i < length ;i ++){
            if (nums[i] == val){
                nums[i] = 99;
                result --;
            }
        }

        // 排序即可
        Arrays.sort(nums);


        return result;
    }
}
```