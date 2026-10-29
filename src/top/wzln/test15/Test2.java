package top.wzln.test15;

import java.util.Random;
import java.util.Scanner;

/*
    红包问题：
    给你两个整数M和N,M表示红包的总额,N表示红包的个数
    现在有N个人来抽红包,每个人都是随机的,打印每个人领的红包金额

    注1：每个人最少1分钱
    注2：每个人领完红包之后，至少预留1*N分钱
    注3：最后一个人是拿剩余的总额

    错误的条件，边界的条件记得测试

 */
public class Test2 {
    static void main() {
        // 定义变量表示红包的总额
        int totalMoney = 4; //单位:分
        // 定义变量表示红包的数量
        int count = 4;

        // 判断红包够不够发
        if (totalMoney >= count) {

            // 创建一个循环 用来产生随机数,最后一位拿剩余的总额不需要进入循环
            //                              1 2 3 4 (对应第几位)
            //                              4 3 2 1 (对应到这位的时候 至少要预留多少分)
            //                              count - i
            Random r = new Random();
            for (int i = 1; i <= count-1; i++) {  //减1的原因:最后一位不参与循环
                int bonus = r.nextInt(totalMoney - (count - i))+1;  //加1的原因: [0,totalMoney - count - i),bound取不到
                totalMoney = totalMoney - bonus;
                System.out.println("第" + i +"位抽到了" + bonus /100.0 + "元" + ",还剩"+ totalMoney / 100.0 + "元");
            }

            // 循环结束后 剩下的钱就是最后一位的钱
            System.out.println("最后1位抽到了" + totalMoney / 100.0 + "元");

        } else {
            System.out.println("当前余额" + totalMoney + "不够发送" + count + "个红包,请充值!");
        }
    }

}









//package top.wzln.test15;
//
//import java.util.Random;
//import java.util.Scanner;
//
/// *
//    红包问题：
//    给你两个整数M和N,M表示红包的总额,N表示红包的个数
//    现在有N个人来抽红包,每个人都是随机的,打印每个人领的红包金额
//
//    注1：每个人最少1分钱
//    注2：每个人领完红包之后，至少预留1*N分钱
//    注3：最后一个人是拿剩余的总额
//
// */
//public class Test2 {
//    static void main() {
//
//        Scanner sc = new Scanner(System.in);
//        Random r = new Random();
//        double M = 30.0; // 红包的总金额/剩余金额
//        double temp; //扣除的金额(临时变量)
//        int man;
//
//        while(true){
//            System.out.print("请输入来抢红包的人数:");
//            man = sc.nextInt();  //用户输入来抢红包的人数  红包的个数 = 来抢红包的人数
//            if (man > M/0.01){
//                System.out.println("输入不合法!每人至少分到0.01");
//            }else {
//                break;
//            }
//        }
//        int N = man;  //剩余个数
//
//        for (int i = 1; i <= man; i++) {  // 抽红包的次数 = 来抢红包的人数
//            if (i == man) {  //最后一个人拿剩余的总额
//                System.out.println("第" + i + "个人抽了" + M + "元,现在红包剩余金额:0");
//                M = 0;
//                System.out.println("红包已被领取完!");
//
//            }
//
//            if (M >= 0.01) {  //红包有钱的时候
//                temp = r.nextDouble(0.01, M - (N * 0.01));  //最少0.01 最多是 剩余余额-剩余个数*0.01
//                M = M - temp;  // 剩余金额=现在金额-抽到的金额
//                N--;  //剩余个数-1
//                System.out.println("第" + i + "个人抽了" + temp + "元,现在红包剩余金额:" + M);
//
//            }
//        }
//    }
//}
