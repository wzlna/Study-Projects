package com.rj.bd.test0911.study;

/**
 * @desc 测试类，用于测试JieCheng类和LeiJiaQiuHe类中的递归算法
 */
public class Test {
    public static void main(String[] args) {
        JieCheng jc = new JieCheng();
        System.out.println(jc.jieCheng(5));  //阶乘

        LeiJiaQiuHe lj = new LeiJiaQiuHe();
        System.out.println(lj.leijia(10));  //累加求和(10)

        int result = 0;
        for (int i = 5; i <= 100; i+=5) {
            result = result + lj.leijia(i);  //总和
            System.out.println("累加求和(" + i + ") = " + lj.leijia(i));
        }
    }
}
