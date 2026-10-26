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
    快指针: 找数组2
    是2 -> 舍弃快指针位置的数据
    不是2 -> 快指针的数据存入慢指针位置
 */
public class Test1 {
    static void main() {

        int[] nums = {3,2,2,3};
        int val = 3;
        int slow = 0;
        int fast = 0;


    }
}
