package com.rj.bd.test0916.study;

/**
 * @desc 类的继承的学习·测试类
 *     // super：特指父类
 *     // this：特指当前对象 当前对象没有这个方法的时候 指向他的父类
 */
public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        son.age = 69; //复写了传入的属性 父类->子类->Test

        son.show();  //这个方法继承自父类 同时可被子类复写 这里没有复写
        System.out.println("-------------------------");

        son.method();  // 这个方法被复写了
        System.out.println("-------------------------");

        System.out.println(son.calc());  // 调用子类的方法 这个方法继承自父类 同时可被子类复写
        System.out.println("-------------------------");

        son.sout();  // 调用子类的独立方法
        System.out.println("-------------------------");

    }
}
