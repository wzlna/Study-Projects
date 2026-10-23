package top.wzln.method13;
/*
    方法重载练习
 */
public class MethodDemo6 {
    static void main() {
        int a = 10;
        int b = 20;
        System.out.println(getSum(a,b));
    }

    static double getSum (int a ,double b){
        return a+b;
    }

    static double getSum (double a ,int b){
        return a+b;
    }

    static double getSum (double a ,double b){
        return a+b;
    }

    static int getSum (int a ,int b){
        return a+b;
    }

}
