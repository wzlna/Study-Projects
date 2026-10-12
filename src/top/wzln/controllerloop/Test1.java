package top.wzln.controllerloop;

import java.util.Random;
import java.util.Scanner;

/*
    要求:生成一个1-100的随机数 用键盘输入模拟猜的动作 猜中提示 没猜中继续
 */
public class Test1 {
    static void main() {
        // 使用Ramdom方法 生成一个随机数
        Random r = new Random();
        // 第一种写法: int suiji = r.nextInt();  默认在int的取值范围内获取随机数
        // 第二种写法:   在小括号里面写一个数字n 表示随机的最大值 但是不包含这个数字,也没有负数
        // 第三种写法:   小括号里写两个数字,表示随机的取值范围是a-b 但是不包含b   int suiji = r.nextInt(1,101);
        int suiji = r.nextInt(101);
        System.out.println(suiji);

        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("猜数字---现在请输入一个数(输入5678退出)：");
        int type;

        while(true){
            type = sc.nextInt();
            if (type == suiji  || type == 5678){
                System.out.println("恭喜你猜对了!");
                break;
            }else if (type > suiji){
                System.out.println("你猜的数字太大了");
            } else if (type < suiji) {
                System.out.println("你猜的数字太小了");
            }

        }
    }
}
