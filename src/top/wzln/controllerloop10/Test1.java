package top.wzln.controllerloop10;

import java.util.Random;
import java.util.Scanner;

/*
    要求:生成一个1-100的随机数 用键盘输入模拟猜的动作 猜中提示 没猜中继续

    小保底：如果用户3次没有猜中 提示用户随机数的范围 +-5之间
    大保底：如果用户10次都没有猜中 直接告诉用户答案
 */
public class Test1 {
    static void main() {
        // 使用Ramdom方法 生成一个随机数
        Random r = new Random();
        // 第一种写法: int suiji = r.nextInt();  默认在int的取值范围内获取随机数
        // 第二种写法:   在小括号里面写一个数字n 表示随机的最大值 但是不包含这个数字,也没有负数
        // 第三种写法:   小括号里写两个数字,表示随机的取值范围是a-b 但是不包含b   int suiji = r.nextInt(1,101);
        int random = r.nextInt(1,101);
        System.out.println(random);

        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("猜数字---现在请输入一个数：");
        int type;
        int round = 0;  //定义一个变量记录用户猜的次数

        while (true) {
            type = sc.nextInt();

            if (type == random) {
                System.out.println("恭喜你猜对了!");
                break;
            } else if (type > random) {
                System.out.println("你猜的数字太大了");
                round++;
            } else if (type < random) {
                System.out.println("你猜的数字太小了");
                round++;
            }

            if (round == 10) {  //小范围的在上面
                System.out.println("您已猜错10次 触发大保底机制 答案是" + random);
                break;
            } else if (round == 3) {
                System.out.println("您已猜错3次 触发小保底机制 答案范围：" + (random - 5) + "~" + (random + 5));
            }

        }
    }
}
