package top.wzln.method13;
/*
    定义方法打印99乘法表
 */
public class MethodDemo4 {
    static void main() {
        print99();
    }

    // void:不需要返回值
    // 没有参数的方法,调用的时候,实参也是空着的
    static void print99(){

        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j*i + " ");
            }
            System.out.println();
        }

    }
}
