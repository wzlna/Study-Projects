package com.rj.bd.test0916.study3;

/**
 * @desc 测试类 用于讲解toString() 和数组中存入对象和null关键字
 */
public class Test {
    public static void main(String[] args) {

        // Student 是引用数据类型，stu01变量 和 stu02变量 保存的是 Student 对象的引用
        Student stu01 = new Student("一号学生", 18);
        Student stu02 = new Student("二号学生", 29);

//        System.out.println(stu01);
//        System.out.println(stu02);

        // Object 是所有引用数据类型的父类；Object[] 是引用类型数组，所以arr[i]可以直接转换为Student
        Object[] arr = new Object[3];  // 长度为3、元素类型为 Object 的数组
        arr[0] = stu01;
        arr[1] = stu02;
        arr[2] = null;  // null 表示没有引用任何对象，只能赋给引用数据类型
        Student stu;  // 定义一个 Student 引用类型的变量

        for (int i = 0; i < arr.length; i++) {
            // int 是基本数据类型；arr[i] 的类型是 Object，需要强制转换为 Student
            stu = (Student) arr[i];  // 把 Object 类型的数据转换为 Student 类型
            System.out.println(stu);
        }

    }
}
