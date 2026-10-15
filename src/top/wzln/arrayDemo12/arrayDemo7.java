package top.wzln.arrayDemo12;

import java.util.Scanner;

/*
    需求: 已知数组元素为{33,5,22,44,55,33}
    键盘录入任意一个数据,查找这个数据在数组中是否存在
    如果数组中要查找的数据出现多次,只要显示第一次的索引即可

    输出要求:
        如果存在打印索引
        如果不存在,提示:"该数据不存在"

    细节一: 什么情况下,我才能断定数据在数组中不存在
    细节二: 两种写法 flag(标记) count(计数器)
 */
public class arrayDemo7 {
    static void main() {
        // 1.第一种写法
        // 定义数组
        int[] arr = {33, 5, 22, 44, 55, 33};

        //键盘录入任意一个数据
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // 创建中间变量
        boolean result = true;  //true代表不再arr里面

        //拿着number跟数组里面每一个元素一一比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                System.out.println("您输入的" + input + "在arr数组中,位置为arr[" + i + "]");
                result = false;
                break;  // 如果找到了 循环直接结束 后面的不用再比较了
            }
        }

        // 输出不在的提示
        if (result) {
            System.out.println("您输入的" + input + "不在arr数组中");
        }


        // 2.第二种写法
        System.out.println("-------------第二种写法-------------");
        int[] arr2 = {23, 4, 5, 6, 7, 88};
        int count = 0;


        Scanner sc2 = new Scanner(System.in);
        int input2 = sc2.nextInt();

        for (int a = 0; a < arr2.length; a++) {

            if (input2 == arr2[a]) {
                count++;  //找到就加一
                System.out.println("找到了! 在数组的第" + a +"号位");
            }
        }

        if (count == 0){
            System.out.println("没有找到这个数!");
        }


    }

}
