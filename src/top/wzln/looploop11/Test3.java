package top.wzln.looploop11;
/*
    用嵌套循环打印倒三角形
 */
public class Test3 {
    static void main() {


        // 倒金字塔 第一种做法
        for (int a = 5; a >= 1; a--) {  // 5 4 3 2 1

            for (int i = 1; i <= a; i++) {
                System.out.print("*");
            }
            System.out.println();  //然后换行

        }


        // 倒金字塔 第二种做法
        for (int a = 1; a <= 5; a++) {  // 1 2 3 4 5

            for (int i = 1; i <= 6 - a; i++) {  // 6-(1 2 3 4 5)  == 5 4 3 2 1
                System.out.print("*");
            }
            System.out.println();  //然后换行

        }


        // 倒金字塔 第三种做法
        // 第1行（a=1）：i=1、2、3、4、5 → 打 5 个*
        // 第2行（a=2）：i=1、2、3、4 → 打 4 个*
        // 第3行（a=3）：i=1、2、3 → 打 3 个*
        // 第3行（a=4）：i=1、2 → 打 2 个*
        // 第3行（a=5）：i=1 → 打 1 个*
        for (int a = 1; a <= 5; a++) {  // 1 2 3 4 5

            for (int i = a; i <= 5; i++) { // i小于等于5就一直打印 同时i++
                System.out.print("*");
            }
            System.out.println();  //然后换行

        }
    }
}
