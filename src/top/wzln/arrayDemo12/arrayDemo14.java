package top.wzln.arrayDemo12;
/*
    给定一个整数数组nums和一个整数目标值target,请你在该数组中找出 和为目标值Target的那两个整数
    并输出他们的数组索引.
    提示:先不用考虑效率问题,两层循环即可完成
    要求1: 只要输出第一对满足要求的情况
    要求2: 输出所有满足要求的情况

    举例1:
    输入:数组nums = [2,7,11,15] target = 9
    输出:0,1
    解释: 因为nums[0] + nums[1] == 9,所以结果为0和1

    举例2:
    输入:数组nums = [3,2,4] target=6
    输出:1,2
 */
public class arrayDemo14 {
    static void main() {
        int[] nums = {1,2,34,45,6,23,1,5,13};  // 9位
        int target = 47;

        // if nums[0] + nums[1] == target
        // slow会一直循环到等于length,同时slow的内循环fast也会一直循环让slow与slow后面的每一个数
        // 进行相加,符合要求时打印
        for (int slow = 0; slow < nums.length; slow++) {

            for (int fast = slow +1; fast < nums.length; fast++) {
                if (nums[slow] + nums[fast] == target){
                    System.out.println(slow + "," + fast);
                }
            }
        }

        // 只打印一个的版本
        boolean is_break = false;

        for (int slow = 0; slow < nums.length; slow++) {

            for (int fast = slow +1; fast < nums.length; fast++) {
                if (nums[slow] + nums[fast] == target){
                    System.out.println(slow + "," + fast);
                    is_break=true;  //寻到并打印之后设置结束信号
                    break;
                }
            }
            if(is_break){
                break;
            }
        }

    }
}
