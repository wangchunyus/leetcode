# 解题思路
**双指针：left 指针指向字符串数组的开始；right 指针指向字符串数组的末尾。**

首先，进行循环（**注意：left 指针不能移动到 right 指针的右边**），然后将 **`left`** **`指针指向的字符和right`** 指针指向的字符进行交换即可，**交换完成后要将 left 指针右移一位 right 指针左移一位**，进而进行两个字符的交换。

##### 普通两个字符交换
```java
char a = s[left];
s[left] = s[right];
s[right] = a;
```
##### 位运算（看）
```java
s[left] ^= s[right];
s[right] ^= s[left];
s[left] ^= s[right];
```


---
# 代码
```java
class Solution {

    public void reverseString(char[] s) {

        int n = s.length;
        int left = 0, right = n - 1;
        
        while (left < right) {

            char a = s[left];
            s[left] = s[right];
            s[right] = a;
            left++;
            right--;
        }
    }
}
```
时间复杂度：*O(n)*
空间复杂度：*O(1)*