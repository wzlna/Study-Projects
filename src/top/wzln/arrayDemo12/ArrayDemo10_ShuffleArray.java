package top.wzln.arrayDemo12;

import java.util.Random;

/*
    需求: 已知数组元素为{1,1,54,7,2,6,12,13,7,8}
    要求: 打乱数组中的数据

    思路：
        第一步：
            0索引上的数据，跟随机位置上的数据进行交换
        第二步：
            从第二步开始，重复上面的过程

    细节1:
        如何交换两个位置上的数据
            临时变量
    细节2:
        如何获取一个随机的索引

 */
public class ArrayDemo10_ShuffleArray {
    static void main() {

        // 1. 定义数组
        int[] arr = {1,1,54,7,2,6,12,13,7,8};

        int thirdparty = 0;  //第三变量（交换数用）
        // 2.制造一个随机数
        Random r = new Random();

        // 3.打乱
        for (int i = 0;i<=8;i++){
            int num = r.nextInt(0,arr.length);

            thirdparty = arr[0];
            arr[0] = arr[num];
            arr[num] = thirdparty;

        }

        // 4.打印出打乱后的arr
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }



    }
}
