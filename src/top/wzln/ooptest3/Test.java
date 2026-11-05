package top.wzln.ooptest3;

public class Test {
    static void main() {
        Phone p1 = new Phone();
        p1.board = "Xiaomi";
        p1.price = 5699;
        System.out.println(p1.board);
        System.out.println(p1.color);  //Class里面已经定义
        System.out.println(p1.price);

        Phone p2 = new Phone();
        p2.board = "Apple";
        p2.color = "black";  //手动定义不使用默认值
        System.out.println(p2.board);
        System.out.println(p2.price);  //没定义,返回0
        System.out.println(p2.color);

    }
}
