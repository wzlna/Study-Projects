package top.wzln.arrayDemo12;

import java.util.Scanner;

/*
    数组动态初始化

    需求：键盘录入5个整数 存入数组当中 并进行遍历
 */
public class ArrayDemo4_DynamicInitialization {
    static void main() {
        // 创建数组
        int shuzu[] = new int[5];  // 数组动态初始化

        // 键盘录入
        System.out.println("请输入5个数 程序将在稍后对其打印：");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < shuzu.length; i++) {
            shuzu[i] = sc.nextInt();
        }

        // 遍历数组
        for (int i = 0; i < shuzu.length; i++) {
            System.out.println(shuzu[i]);
        }

    }
}
