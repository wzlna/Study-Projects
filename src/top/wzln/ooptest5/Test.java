package top.wzln.ooptest5;

public class Test {
    static void main() {
        Cooker c = new Cooker();
        c.age = 18;
        c.level = 3;
        c.name = "dw";

        // 调用方法
        c.cook();
    }
}
