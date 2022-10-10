### 解题思路
1. 遍历两次字符串，第一次构造哈希map， 存入每个字符出现的次数
2. 第二次判断每个字符次数是否等于1，等于1就返回i
3. 遍历结束，返回-1

### 代码
```javascript
const firstUniqChar = s => {
    const len = s.length;
    const map = {};
    for (let i = 0; i < len; i++) {
        map[s[i]] = map[s[i]] ? map[s[i]] + 1 : 1;
    }
    for (let i = 0; i < len; i++) {
        if (map[s[i]] === 1) return i;
    }
    return -1;
};
```