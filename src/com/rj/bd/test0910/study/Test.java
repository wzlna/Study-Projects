package com.rj.bd.test0910.study;

/**
 * @desc 测试类:测试ShuXue类
 */
public class Test {
    public static void main(String[] args) {

        // new实例化:获取对象
        ShuXue shuXue01 = new ShuXue();

        // 调用函数
        // 函数调用:对象.函数名
        int result = shuXue01.qiuJueDuiZhi(-2);
        System.out.println("对象shuXue01调用函数qiuJueDuiZhi()的返回值是:" + result);

        // 调用向下取整
        System.out.println(shuXue01.xiangXiaQuZheng(-3.9));

        // 调用向上取整
        System.out.println(shuXue01.xiangShangQuZheng(-3.1));

        // 调用5+10+15+20+...+100
        System.out.println(shuXue01.getSum(100));
    }
}
