### 解题思路
二分  ffff tttt 都是这样的格式 找到f后面第一个t即可
### 代码

```java
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //还是二分查找 注意 这次mid可能会溢出 所以不能使用x+y 再除2了
        // 说白了就是找到false的后一个版本
        int left=1,right=n,mid;
        while(left<=right){
            mid=(right-left)/2 +left;
            //如果为true 则证明已经出错 左移
            if(isBadVersion(mid)){
                right=mid-1;
            }else{
                //为false 说明没错 但需要在true和false的交界处
                left=mid+1;
            }
        }
        //当返回左指针的时候 正好是我们要的第一个版本
        return left;
    }
}
```