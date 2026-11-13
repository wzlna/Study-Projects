package com.rj.bd.test0917.demoMethods;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.random());//产生0-1之间的随机小数
        System.out.println(Math.PI);//获取常量PI的值
        System.out.println(Math.max(2, 3));//求两个数的最大值
        System.out.println(Math.min(9, 6));//求两个数的最小值
        System.out.println("向下取整：" + Math.floor(3.9));//
        System.out.println("向上取整：" + Math.ceil(9.1));
        System.out.println("四舍五入：" + Math.round(3.5));
        System.out.println(Math.round(3.49));
        System.out.println("幂运算" + Math.pow(2, 1 / 2.0));
        System.out.println("开方" + Math.sqrt(9.0));
    }
}
