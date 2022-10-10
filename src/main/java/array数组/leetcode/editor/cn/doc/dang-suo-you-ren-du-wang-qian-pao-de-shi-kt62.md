
### 代码

```java

class Solution {
    public void deleteNode(ListNode node) {
        // ???head跑哪了？？ 那就不要head 从给的node入手
        // 反常规思维 不再是从前往后跳过要删除的结点 而是从后往前复制值 再跳过后面结点
       // ListNode p = node.next;
        node.val = node.next.val;
        node.next=node.next.next;  
    }
}