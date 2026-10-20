package top.wzln.looploop11;
/*
    用嵌套循环 打印正三角形
 */
public class NestedLoopDemo2_RightTriangleStars {
    static void main() {

        for (int a = 1; a <= 5; a++) {

            for (int i = 1; i <= a; i++) {
                System.out.print("*");
            }
            System.out.println();  //然后换行

        }

    }
}

