package com.rj.bd.test0916.study;

/**
 * @desc 类的继承的学习·子类
 */
public class Son extends Father {

    public String name = "李四";  // 子类的属性(没有复写)

    @Override
    public void method() {  //复写了父类的方法
        System.out.println("子类的method方法(复写)");
        super.method();
    }

    public void sout() {
        System.out.println("子类独立的输出方法");
        this.method();  // Test->Son->复写->super.Father
        System.out.println(this.calc());  // Test->Son->Father 虽然子类没有calc 但是它可以继承 父类的calc
    }

    // super：特指父类
    // this：特指当前对象 当前对象没有这个方法的时候 指向他的父类
}
