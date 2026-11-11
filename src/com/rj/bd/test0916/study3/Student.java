package com.rj.bd.test0916.study3;

/**
 * @desc 自定义类 用于讲解toString() 和数组中存入对象和null关键字
 */
public class Student {
    // 0.定义属性
    public String name;
    public int age;

    // 1.定义有参数构造器
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
