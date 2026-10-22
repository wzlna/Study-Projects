package top.wzln.method13;
/*
    给定两个长方形,判断哪个长方形的面积更大?
    如何定义方法?

    小诀窍:
        1. 观察大段的代码当中, 反复使用 的 独立功能 是什么?
        2. 这个独立功能,需要什么才能完成? --- 形参 长 宽
        3. 方法的调用处,是否需要这个独立功能的结果继续做其他事情?  --- 必须把面积返回
 */

public class MethodDemo6 {
    static void main() {

        double len1 = 10.1;
        double width1 = 5.1;

        double len2 = 9.1;
        double width2 = 6.1;

//        double area1 = len1 * width1; 反复使用的独立功能
//        double area2 = len2 * width2;
        double area1 = area(len1,width1);
        double area2 = area(len2,width2);

        if(area1 > area2){
            System.out.println("第一个长方形的面积更大");
        } else if (area2 > area1) {
            System.out.println("第二个长方形的面积更大");
        } else {
            System.out.println("两个长方形的面积相等");
        }
    }

    static double area(double len,double width){
        return len * width;
    }

}
