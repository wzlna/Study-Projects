package com.rj.bd.test0916.study2;

/**
 *  @desc 父类的引用指向子类的实例化对象·测试类
 */
public class Test {
    public static void main(String[] args) {

        Animal am = new Bird(); // Animal:父类 但是new的是子类Bird,这是允许的
        am.run();  // 会调子类的构造器 然后再由子类->父类的run函数 但是调不了子类独有的函数

        Animal am2 = new Fish();
        am.run();


    }

}
