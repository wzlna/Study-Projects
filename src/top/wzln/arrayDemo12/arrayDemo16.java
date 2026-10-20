package top.wzln.arrayDemo12;
/*
    给定一个递增的有序数组和一个目标值,在数组中找到目标值,打印其索引
    如果目标值不存在于数组中,打印应插入的位置

    举例1:
    数据:nums = [1,3,5,6];    target=5
    输出:2

    举例2:
    数据:nums = [1,3,5,6];    target=2
    输出:1

    举例3:
    数据:nums = [1,3,5,6];    target=7
    输出:4
 */
public class arrayDemo16 {
    static void main() {

        int[] nums = {1,3,5,6};  //递增数组
        int target = 7;  //目标值
        boolean is_find = false;

        // 在数组中找第一个大于或等于 target 的元素的位置 i，打印 i 就完事了。
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=target){
                System.out.println(i);
                is_find = true;
                break;
            }

        }

        // 扫完都没找到，i = length
        if(!is_find){  // !is_find是isfind==false的简写
            System.out.println(nums.length);
        }

    }
}
