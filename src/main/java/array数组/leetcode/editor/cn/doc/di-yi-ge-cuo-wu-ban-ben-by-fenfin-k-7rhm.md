### 解题思路
注意：int mid = (high+low)/2会超出运行限制

### 代码

```java
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1,high = n;
        int mid = low+((high-low)/2);
        while(low<=high){
           mid = low+((high-low)/2);
            if(isBadVersion(mid)==false){
                low = mid+1;
            }else{
                if((mid-1)!=0&&isBadVersion(mid-1)==true){//考虑下边界情况
                    high = mid-1;
                }else{
                    return mid;
                }
                
            }
        }
        return mid;
    }
}
```