package com.rj.bd.test0909.study;

/**
 * @desc 自定义的类,叫做Yuan类
 */

public class Yuan {  // 类:FCM

    // 类的第一部分:属性(Feild)
    public double banJing;
    public double PI = 3.14;  // 定义一个常量(全部大写的字母)

    // 类中的第二部分:构造器(和方法的不同:没有出口) (Constructor)
    public Yuan() {
        System.out.println("Yuan类的无参构造器被调用了");
    }

    public Yuan(double r) {
        System.out.println("Yuan类的有参构造器被调用了");
        this.banJing = r;  // this 指代当前正在被创建的那个对象本身
        System.out.println("半径为" + banJing + "的圆被创建了");
    }

    // 类的第三部分:行为(方法) (Method)
    // 功能1:求面积:定义一个求面积的函数
    public double qiuMianJi(){
        double mianJi = PI * banJing * banJing;

        return mianJi;
    }

    // 功能2:求周长:定义一个求周长的函数
    public double qiuZhouChang() {
        double zhouChang = PI * 2 * banJing;

        return zhouChang;
    }

}
