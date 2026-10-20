package top.wzln.looploop11;

/*
    打印菱形
 */
public class NestedLoopDemo7_Diamond {
    static void main() {

        // 设置一个外循环 控制图形的行数
        for (int i = 1; i <= 7; i++) {

            if (i <= 4) {

                // 内循环 控制每行开头打印多少个空格 3 2 1 0
                // 起点: 从a <--i开始
                // 循环条件: a<=3
                // 步进: a++ (结合循环条件可知 第一次循环3次 打印3个)
                for (int a = i; a <= 3; a++) {
                    System.out.print(" ");
                }

                // 起点: 从1开始(打印第一个 *)
                // 循环条件: a <= (2*i)-1    (2*i)-1是个数
                // 步进: a++
                for (int a = 1; a <= (2 * i) - 1; a++) { // a<= 1 3 5 7
                    System.out.print("*");

                }

            } else { //到了第5行的情况

                // 起点: 从1开始(打印第一个 空格)
                // 条件: a <= i - 4 (控制这一行总共打印多少个)
                // 步进: a++
                for (int a = 1; a <= i - 4; a++) {
                    System.out.print(" ");
                }

                // 起点：从 1 开始（打印第 1 个 *）
                // 条件：a <= 15 - 2 * i（控制这一行总共打印多少个）
                // 步进：a++
                for (int a = 1;a <= 15 - 2 * i;a++) {  // a<=5 3 1
                    System.out.print("*");
                }

            }

            System.out.println();

        }
    }
}
