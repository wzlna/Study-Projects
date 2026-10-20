package top.wzln.controllerloop10;

import java.util.Scanner;

/*
    描述:牛牛在酒桌上玩一个小游戏 第一个人从1开始数数,如果遇到数字中含有数字4或数字是4的倍数,则跳过这个数字报下一个,谁数错了就要罚酒一杯.
        牛牛为了作弊 他想将所有符合规则的数字先生成出来

        请你帮助牛牛列出1到n之间所有既不包含数字4又不是4的倍数的整数,按升序输出

    输入描述:
        在一行中输入一个正整数n,满足 1<=n<=100000

    输出描述:
        按升序输出所有满足条件的整数,每个数字占一行.

        TODO 学习了列表之后 学会改造为 使用拆分算法把拆分出的数字都存到一个列表里 这样就可以用这个算法辅助程序筛选(既不在列表里 也不是4的倍数)
 */
public class ContinueDemo3_SkipNumbersContainingFour {
    static void main() {

        // 1.定义变量 接收键盘输入数据
        Scanner sc = new Scanner(System.in);
        int n;

        // 2.用循环判断输入的数据是否符合要求
        while (true) {
            n = sc.nextInt();

            if (n >= 1 && n <= 100000) {
                break;
            } else {
                System.out.println("请输入一个1=<n<=100000的数!");
            }
        }

        // 进入核心判断逻辑
        int zuidi;
        int temp;
        boolean hasfour = false;

        for (int i = 1; i <= n; i++) {

            temp = i;
            while (temp > 0) { // 不断循环取出最低位 并去掉一位 直到temp不再大于0(或没位数等于0了)
                zuidi = temp % 10; //取出最低位

                if (zuidi == 4) {
                    hasfour = true;
                }
                temp = temp / 10; //去掉一位
            }

            if (hasfour || i % 4 == 0) {  //注意:是i不能包含4并且不是4的倍数
                System.out.println("过!");
                hasfour = false; //重置标记的状态
                continue; //跳过这次循环 让下面不再print这个i
            }

            System.out.println(i);
        }

    }
}
