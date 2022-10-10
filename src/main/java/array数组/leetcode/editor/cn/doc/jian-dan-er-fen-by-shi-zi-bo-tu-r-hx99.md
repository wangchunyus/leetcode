### 代码

```python3
# The isBadVersion API is already defined for you.
# @param version, an integer
# @return an integer
# def isBadVersion(version):

class Solution:
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """

        left = 0
        right = n - 1
        while(left<=right):
            m = (left+right)//2
            if isBadVersion(m)==True:
                right = m - 1
            else:
                left = m + 1
        return max(1,left)

        
```