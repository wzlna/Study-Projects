package top.wzln.looploop11;
/*
    打印梯形

      ***
     *****
    *******
 */
public class Test5 {
    static void main() {

        // 外循环 控制图形的行数
        for (int i = 1; i <= 3; i++) {

            // 内循环 控制每一行打印多少个空格
            // 第1行（i=1）：j=1、2 → 打 2 个空格
            // 第2行（i=2）：j=2 → 打 1 个空格
            // 第3行（i=3）：j=3 > 2，不进循环 → 0 个空
            for (int j = i; j <= 2; j++) {  // 打印前导空格：第i行打印(3-i)个空格，越往下空格越少，形成向右倾斜的平行效果
                System.out.print(" ");
            }


            //内循环 控制每一行打印多少个*
            for (int a = 1; a <= i*2+1; a++) {
                System.out.print("*");
            }

            System.out.println();  // 换行

        }
    }
}
