package top.wzln.method13;

import java.util.Scanner;

/*
    作业2:计算班级分数

    班主任需要统计10名学生的数学成绩(0-100分),
    计算及格率,平均分,并找出最高分.
    要求1: 键盘录入10名学生的成绩,存入数组. 超出范围,提示"成绩无效,请重新输入".
    要求2: 定义方法,求及格人数,根据及格人数,求及格率.
    要求3: 定义方法求总分,根据总分求平均分.
    要求4: 定义方法求最大值.
 */
public class MethodTest2 {
    static void main() {

        // 键盘录入10名学生的成绩,存入数组. 超出范围,提示"成绩无效,请重新输入".
        double[] scores = new double[10];  //创建数组
        Scanner sc = new Scanner(System.in);  // 注册sc

        for (int i = 0; i < scores.length;) {
            System.out.print("请输入第" + (i+1) + "名学生的成绩:");
            double score = sc.nextDouble();  // 输入
            if (score > 100 || score < 0){
                System.out.println("成绩无效,请重新输入!");  // 仅提示,i没有++,这是循环末尾不需要continue
            } else {
                scores[i] = score;  //输入合法的时候: 存入 并i++
                i++;
            }
        }

        // 使用方法,求及格人数,根据及格人数,求及格率
        double passRate = passedNum(scores) * 100.0 / scores.length;  //提前乘100.0的原因是让浮点介入,否则int/int是整除 抛弃小数
        System.out.print("及格率为:" + passRate + "%");

        // 使用方法求总分,根据总分求平均分.
        double total = totalScore(scores);  //只求一次总分,防止多次无意义调用
        System.out.println("总分:" + total);
        System.out.println("平均分:" + total / scores.length);

        // 使用方法求最大值
        System.out.println("最大值:" + maxScore(scores));

    }

    // 定义方法,求及格人数
    static int passedNum(double[] score){  // 返回值类型int,因为及格人数不会是小数
        int count = 0;  //局部变量尽量不要合方法重名
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 60){
                count++;
            }
        }

        return count;  //循环结束后返回结果
    }

    // 定义方法求总分
    static double totalScore(double[] score){
        double total = 0;
        for (int i = 0; i < score.length; i++) {
            total = total + score[i];
        }

        return total;  // 循环计算完毕后 返回总分
    }

    // 定义方法求最大值
    static double maxScore(double[] score){
        double max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max){
                max = score[i];
            }
        }

        return max;  //循环完毕后,返回结果
    }

}
