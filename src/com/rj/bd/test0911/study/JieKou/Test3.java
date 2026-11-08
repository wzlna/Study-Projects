package com.rj.bd.test0911.study.JieKou;

/**
 * @desc 测试类3 体现一个实现类可以有多个接口
 */
public class Test3 {
    public static void main(String[] args) {
        IInfo shiXian = new IDoorIInfoImpl();

        shiXian.getInfo();
        System.out.println(shiXian.getNumber());

    }
}
