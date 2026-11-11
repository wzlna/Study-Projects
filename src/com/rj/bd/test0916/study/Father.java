package com.rj.bd.test0916.study;

/**
 * @desc 类的继承的学习·父类
 */
public class Father {
    public String name = "张三";
    public int age = 18;

    public void show() {
        System.out.println("父类的属性");
        System.out.println(name + " " + age);
    }

    public int calc() {
        System.out.println("父类的计算");
        return age + 100;
    }

    public void method() {
        System.out.println("父类的方法");
    }
}
