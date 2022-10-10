package array数组.leetcode.editor.cn.util;

/**
 * @ClassName Difference
 * @Description TODO 差分数组工具类
 * @Author wcy
 * @Date 2022/8/4
 * @Version 1.0
 */
public class Difference {

    //定义一个差分数组
    private int[] diff;

    public Difference(int[] nums) {
        assert  nums.length > 0;
        diff = new int[nums.length];
        //根据初始数组构造查分数组
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i]-nums[i-1];
        }
    }
    /*
    给闭区间[i,j] 增加val 可以是负数
     */
    public void increment(int i,int j,int val){
        diff[i] +=val;
        //此处判断 如果闭区间中右侧 已经到差分数组的最后一个数了，就不需要 在减去val
        if(j+1 < diff.length){
            diff[j+1]-=val;
        }
    }
    /*
    返回结果数组
     */
    public int[] result(){
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            res[i] = res[i-1]+diff[i];
        }
        return res;
    }
}
