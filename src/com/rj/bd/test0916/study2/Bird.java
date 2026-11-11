package com.rj.bd.test0916.study2;

/**
 * @desc 父类的引用指向子类的实例化对象·鸟类
 * @desc 父类:Animal
 */
public class Bird extends Animal{
    public void fly(){  //鸟类自定义函数
        System.out.println("鸟可以飞");
    }

    public Bird(){
        System.out.println("Bird类的无参数构造器:鸟可以做一些事...");
    }
}
