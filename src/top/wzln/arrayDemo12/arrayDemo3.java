package top.wzln.arrayDemo12;
/*
    数组的遍历
        定义一个整数数组,里面存储任意数据,并将数组遍历并打印
 */
public class arrayDemo3 {
    static void main() {

        // 1.利用静态初始化定义一个数组
        int[] arr = {10,20,30,40,50};

        // 2.一个个获取数组中的内容
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("----------------------");

        // 3.利用循环去获取数组中的内容
        for (int i = 0;i<=4;i++){
            System.out.println(arr[i]);
        }

        // 4.循环第二种方法
        // length获取数组的长度
        // 遍历数组的快速生成方式:arr.length.fori
        System.out.println(arr.length);
        for (int i = 0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
