package com.rj.bd.test0911.homework;

/**
 * @desc 求总工资(Gongzi)的测试类
 */
public class Test {
    public static void main(String[] args) {
        Gongzi g = new Gongzi(10);  // 工作年限通过构造器初始化

        System.out.println("工作年限为:" + g.year);
        System.out.println("奖金为:" + g.qiuJiangJin());
        System.out.println("基本工资为:" + g.qiuJiBenGongZi());
        System.out.println("提成" + g.qiuTiCheng());
        System.out.println("总工资为:" + g.qiuZongGongZi());
    }
}
