### 解题思路
这里要注意，当api返回true时，不一定是找到了目标位置，还需要继续向前查找，直到找到第一个有问题的目标。

### 代码

```java
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while(l < r){
            int mid = (r - l) / 2 + l;
            if (isBadVersion(mid)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return r;
    }
}
```