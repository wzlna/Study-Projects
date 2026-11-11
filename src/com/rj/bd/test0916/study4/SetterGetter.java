package com.rj.bd.test0916.study4;

public class SetterGetter {
    // 定义属性
    public int age = 3;
    public String name = "张三";
    public char sex = '男';

    // Alt+Insert快速生成以下函数,方便其他类/函数使用
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
