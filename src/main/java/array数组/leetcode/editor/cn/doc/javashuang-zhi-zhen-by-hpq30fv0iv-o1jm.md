### 解题思路
`l`指针从左到右遍历，`r`指针从右到左遍历，交换左右两个指针

### 代码

```java
class Solution {
    public void reverseString(char[] s) {
        for (int l = 0, r = s.length - 1; l < r; ++l, --r) {
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
        }
    }
}
```
### 复杂度分析
- 时间复杂度：O(n)
- 空间复杂度：O(1)