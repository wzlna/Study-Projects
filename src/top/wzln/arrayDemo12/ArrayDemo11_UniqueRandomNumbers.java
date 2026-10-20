package top.wzln.arrayDemo12;

import java.util.Random;

/*
    去除重复元素
    需求:获取10个1-100之间的随机数并存入到数组当中,要求保证数据是唯一的

    细节一: 什么情况下,我才能断定数据在数组中不存在
    细节二: 两种写法 flag(标记) count(计数器)

    i :随机数应存入的位置
    j :遍历数组的索引
 */
public class ArrayDemo11_UniqueRandomNumbers {
    static void main() {

        // 1.定义一个长度为10的数组
        int[] arr = new int[10];

        // 2.获取随机数
        Random r = new Random();

        for (int i = 0; i < arr.length;) {
            int num = r.nextInt(1,101);  //获取随机数
            int count = 0;  //每次循环都重置为0

            // 添加防重复逻辑
            for (int j = 0; j < i; j++) {
                if (num == arr[j]){  //让num和已有的数组进行比较
                    count++;
                    break;  //跳出内循环
                }
            }

            // 对count进行判断
            if (count==0){
                arr[i]=num;
                // 只有生成一个满足要求的随机数 索引才会自增
                i++;
            }

        }

        // 遍历打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
