package top.wzln.test15;
/*
    给你一个数组 nums 和一个值 val, 你需要删除所有数值等于 val 的元素

    举例1:
    输入: nums = [3,2,2,3]    val = 3
    输出: nums = [2,2]    剩余2个元素
    举例2:
    输入: nums = [0,1,2,2,3,0,4,2]    val = 2
    输出: nums = [0,1,4,0,3]  剩余5个元素

    思路:
    慢指针: 存入的位置
    快指针: 找数字；2
    是2 -> 舍弃快指针位置的数据
    不是2 -> 快指针的数据存入慢指针位置
 */
public class Test1 {
    static void main() {

        int[] nums = {3,2,2,3,1,32,5,67,32,6,2,3,2};
        int val = 2;  //表示要删除的数据
        int slow = 0;  // 代表现在数值应插入的位置，也代表当前有效数据的长度
        int fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != val){   //不是val的情况
                nums[slow] = nums[fast];  //快指针的数据存入慢指针位置
                slow++;
            }
            fast++;
        }

        for (int i = 0; i < slow; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("剩余的元素个数：" + slow);

    }
}
