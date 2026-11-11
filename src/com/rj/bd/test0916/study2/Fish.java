package com.rj.bd.test0916.study2;

/**
 * @desc 父类的引用指向子类的实例化对象·鱼类
 * @desc 父类:Animal
 */
public class Fish extends Animal{

    public void swing(){
        System.out.println("鱼可以游");
    }

    public Fish(){
        System.out.println("Fish类的无参数构造器:鱼可以做一些事...");
    }
}
