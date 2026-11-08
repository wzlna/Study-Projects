package com.rj.bd.test0911.homework;

/**
 * @desc 工资类
 */
public class Gongzi {
    public double year;  // 工作年限

    // 构造器:可以通过有参数构造器给类中的属性赋值
    public Gongzi(double year) {
        this.year = year;  // this:当前对象，year:当前对象的属性
    }

    /**
     * @desc 求奖金 奖金:工作年限*100
     * @return 奖金
     */
    public double qiuJiangJin() {
        return year * 100;
    }

    /**
     * @desc 求基本工资 基本工资:工作年限*1000
     * @return 基本工资
     */
    public double qiuJiBenGongZi() {
        return year * 1000;
    }

    /**
     * @desc 求提成 提成:基本工资*0.2
     * @return 提成
     */

    public double qiuTiCheng() {
        return qiuJiBenGongZi() * 0.2;
    }

    /**
     * @desc 求总工资 总工资:基本工资+奖金+提成
     * @return 总工资
     */
    public double qiuZongGongZi() {
        return qiuJiBenGongZi() + qiuJiangJin() + qiuTiCheng();
    }
}
