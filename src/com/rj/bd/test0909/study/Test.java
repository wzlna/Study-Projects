package com.rj.bd.test0909.study;

/**
 * @desc 测试类, 用来测试Yuan这个类
 */
public class Test {
    public static void main(String[] args) {

        // 1.将被测试类进行实例化
        // 实例化:就是将这个类加载到内存中
        // yu:是Yuan类在Test测试类中的别名,我可以随便起,但是要遵循标识符的命名规范
        Yuan yu = new Yuan();

        // 2.调用被测试类中的方法(函数调用)
        yu.banJing = 5;

        double result = yu.qiuMianJi();
        double zhouChang = yu.qiuZhouChang();

        System.out.println("半径为5的圆的面积:" + result);
        System.out.println("半径为5的圆的周长:" + zhouChang);


        // 有参构造器
        Yuan yu02 = new Yuan(2.0);  //通过有参数构造器给类中的属性赋值
        double result2 = yu02.qiuMianJi();
        double zhouChang2 = yu02.qiuZhouChang();

        System.out.println("半径为2的圆的面积:" + result2);
        System.out.println("半径为2的圆的周长:" + zhouChang2);


    }
}
