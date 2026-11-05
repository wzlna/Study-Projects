package top.wzln.ooptest4;

public class Test {
    static void main() {
        //创建老师的对象
        Teacher t = new Teacher();

        //赋值
        t.age = 18;
        t.name = "张三";

        // 获取老师的信息并打印在控制台上
        System.out.println(t.age);
        System.out.println(t.name);

        //调用方法(相当于让老师去干活)
        t.eat();
        t.sleep();
        t.teach();
    }
}
