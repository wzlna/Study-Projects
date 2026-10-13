package top.wzln.looploop11;
/*
    分块打印平行四边形
 */
public class Test6 {
    static void main() {

        // 三行
        for (int i = 1; i <= 3; i++) {

            // 第一行 j = i = 1 ; j++后=2 同时这个内循环仅在j<=2的时候生效 打印两个*
            // 第二行 j = i = 2 ; 这个内循环生效一次(j<=2) 打印一个*
            // 第1行（i=1）：j=1、2 → 打 2 个*
            // 第2行（i=2）：j=2 → 打 1 个*
            for (int j = i; j <= 2; j++) {          // **
                System.out.print(" ");              // *
            }

            for (int j = 1; j <= i; j++) {          //   *
                System.out.print("*");              //  **
            }                                       // ***

            for (int j = 1; j <= 3; j++) {          //     ***
                System.out.print("*");              //     ***
            }                                       //     ***

            for (int j = i; j <= 2; j++) {          //        **
                System.out.print("*");              //        *
            }

            System.out.println();
        }
    }
}
