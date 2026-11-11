package com.rj.bd.test0916.study4;

public class Test {

    public static void main(String[] args) {
        SetterGetter sg = new SetterGetter();

        // 用Getter获取值
        System.out.println(sg.getAge() + 3);
        System.out.println(sg.getSex());
        System.out.println(sg.getName());

        // 用Setter设置值并打印
        method1();
        method2();

    }

    public static void method1(){
        SetterGetter sg = new SetterGetter();
        sg.setSex('女');
        System.out.println(sg.getSex());

    }

    public static void method2(){
        SetterGetter sg = new SetterGetter();
        sg.setName("张林");
        System.out.println(sg.getName());
    }

}
