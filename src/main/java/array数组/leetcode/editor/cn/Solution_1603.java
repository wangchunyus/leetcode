

//请你给一个停车场设计一个停车系统。停车场总共有三种不同大小的车位：大，中和小，每种尺寸分别有固定数目的车位。 
//
// 请你实现 ParkingSystem 类： 
//
// 
// ParkingSystem(int big, int medium, int small) 初始化 ParkingSystem 类，三个参数分别对应每种停
//车位的数目。 
// bool addCar(int carType) 检查是否有 carType 对应的停车位。 carType 有三种类型：大，中，小，分别用数字 1， 2
// 和 3 表示。一辆车只能停在 carType 对应尺寸的停车位中。如果没有空车位，请返回 false ，否则将该车停入车位并返回 true 。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：
//["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
//[[1, 1, 0], [1], [2], [3], [1]]
//输出：
//[null, true, true, false, false]
//
//解释：
//ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
//parkingSystem.addCar(1); // 返回 true ，因为有 1 个空的大车位
//parkingSystem.addCar(2); // 返回 true ，因为有 1 个空的中车位
//parkingSystem.addCar(3); // 返回 false ，因为没有空的小车位
//parkingSystem.addCar(1); // 返回 false ，因为没有空的大车位，唯一一个大车位已经被占据了
// 
//
// 
//
// 提示： 
//
// 
// 0 <= big, medium, small <= 1000 
// carType 取值为 1， 2 或 3 
// 最多会调用 addCar 函数 1000 次 
// 
// Related Topics 设计 计数 模拟 👍 115 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 1603.设计停车系统.design-parking-system
 *
 * @author wangcy
 * @since 2022-08-07 08:13:07
 **/

public class Solution_1603 {
    public static void main(String[] args) {
//           Solution solution = new Solution_1603().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class ParkingSystem {
        private Map<Integer, Integer> map;

        public ParkingSystem(int big, int medium, int small) {
            map = new HashMap<>();
            map.put(1, big);
            map.put(2, medium);
            map.put(3, small);

        }
        public boolean addCar(int carType) {
            if(map.containsKey(carType) && map.get(carType) > 0){
                map.put(carType,map.getOrDefault(0,map.get(carType)-1));
                return true;
            }else{
                return false;
            }
        }
    }

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
//leetcode submit region end(Prohibit modification and deletion)

}