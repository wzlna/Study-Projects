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
        // 1.定义变量表示红包的总额
        int money = 20000; //分

        // 2.定义变量表示红包的个数
        int count = 5;

        // 判断红包的金额要足够
        if (money < count) {
            System.out.println("红包的金额不够 请充值");
        } else {

            // 3.利用循环抽取红包
            Random r = new Random();
            // 抽取次数应该是count-1,因为最后一个人不随机,拿的是剩余的总额
            for (int i = 1; i <= count - 1; i++) {
                //利用Random进行随机抽取  1 2 3 4 表示当前是第几个人抽取
                //                     4 3 2 1 表示最少预留的钱,单位分
                //                     money - (count - i)
                int myMoney = r.nextInt(1, money - (count - i) + 1);  //不加一就取不到

                //从总额中减去当前抽到的钱
                money = money - myMoney;

                System.out.println("第" + i + "个人 抢到了" + myMoney + "分");

            }

            // 输出最后一个人抢到的钱
            System.out.println("最后一个人抢到了" + money + "分");

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
