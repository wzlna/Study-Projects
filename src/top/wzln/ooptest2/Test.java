package top.wzln.ooptest2;

public class Test {
    static void main() {
        //创建对象记录第一个学生的信息
        Student s1 = new Student();
        s1.name = "张三";
        s1.gender = '男';  //char类型需要用单引号
        s1.age = 18;
        s1.height = 1.87;

        //获取第一个学生的信息并打印在控制台
        System.out.println(s1.name);
        System.out.println(s1.gender);
        System.out.println(s1.age);
        System.out.println(s1.height);

        Student s2 = new Student();
        s2.name = "李四";
        s2.gender = '女';  //char类型需要用单引号
        s2.age = 18;
        s2.height = 1.67;

        //获取第一个学生的信息并打印在控制台
        System.out.println(s2.name);
        System.out.println(s2.gender);
        System.out.println(s2.age);
        System.out.println(s2.height);

    }
}
