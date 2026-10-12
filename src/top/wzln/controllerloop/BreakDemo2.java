package top.wzln.controllerloop;

import java.util.Scanner;

public class BreakDemo2 {
    static void main(String[] args) {
        /*
            需求:初始最大生命200,收到x点伤害,技能回复y点血,x和y由键盘录入而来
            假设,游戏人物不会死亡,最少1点血
            问:最终游戏人物血量是多少?

            循环增强版
         */

        Scanner sc = new Scanner(System.in);
        double x = 0; //预先声明变量 不能定义在循环里面 否则下方会报无法解析
        double y = 0;

        while (true) {  // 一直循环 直到符合要求为止
            System.out.println("请输入收到的伤害:");
            x = sc.nextDouble();
            System.out.println("请输入技能回复的血量:");
            y = sc.nextDouble();
            if (x > 0 & y > 0) {
                break;
            } else {
                System.out.println("不能输入负数!");
            }
        }

        double heart = 200;

        heart = heart - x;  // 计算收到伤害之后的血量
        System.out.println("游戏人物收到伤害后的血量是:" + heart);
        if (heart <= 0) {
            heart = 1;  // 如果血量收到伤害之后小于等于0 赋值为1(不会死亡)
            System.out.println("复活甲生效 现在角色血量为:" + heart);
        }

        heart = heart + y;
        System.out.println("技能恢复后,游戏人物的血量是:" + heart);

        if (heart > 200) {
            heart = 200;
            System.out.println("现在血量为:" + heart);
        }

        System.out.println("最终血量:" + heart);

    }
}
