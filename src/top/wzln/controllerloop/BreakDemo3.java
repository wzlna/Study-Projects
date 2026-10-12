package top.wzln.controllerloop;

import java.util.Scanner;

/*
    键盘录入一个大于等于2的整数，判断是否为质数.

    质数:只能被1和自身整除的数

    思路:获取[1-type]中所有的整数,如果type只能被2个数整除(或者除了1和他本身 没有数能整除它),那么type就是一个质数
 */
public class BreakDemo3 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int type = 0;
        int a = 0; //定义一个变量存储type能被几个数整除

        // 0.键盘录入一个大于等于2的数
        System.out.println("请输入一个数,程序将判断其是否为质数:");
        while (true) {
            type = sc.nextInt();
            if (type >= 2) {
                break;
            } else {
                System.out.println("请输入一个大于等于2的整数!");
            }
        }

        // 1.获取[1-type]中所有的整数,并判断type % i是否等于0
        for (int i = 1; i <= type; i++) {
            System.out.println("-----------" + i);
            if (type % i == 0) {
                a++; //如果type能被i这个数整除 记录下来
            }
        }

        // 2.记录完能整除type的数的个数之后 判断是否等于2
        if (a == 2) {
            System.out.println(type + "是一个质数");
        } else {
            System.out.println(type + "不是一个质数");
        }

        // 方法2:除了1和他本身 没有数能整除它
        int b = 0; //如果b最后是0,则这是一个质数
        for (int i = 2; i < type; i++) {
            System.out.println("--------方法2--" + i);
            if (type % i == 0) {
                b++; //如果type能被i这个数整除 记录下来
                break; //[2-type)如果有数能整除它 就说明这不是一个质数了 直接break
            } // 这里不能直接写else输出是 因为需要等循环处理完毕
        }

        if (b == 0) {
            System.out.println(type + "是一个质数");
        } else {
            System.out.println(type + "不是一个质数");
        }

    }
}
