package top.wzln.method13;

import java.util.Scanner;

/*
    作业1：评委打分
    跳水比赛有5个评委打分,分数在0~100之间.最终得分会去掉一个最高分,去掉一个最低分,
    剩余的分数再求平均数,改平均数为选手最终得分

    要求1:利用键盘录入5个整数存入数组当中,如果分数超出范围需要重新录入
    要求2:定义方法分别求数组的最大值和最小值
    要求3:计算五名评委的总分
    要求4:总分 - 最大值 - 最小值,求选手最终得分
 */
public class MethodTest1 {
    static void main() {

        // 1.利用键盘录入5个整数存入数组当中,如果分数超出范围需要重新录入
        int[] scores = new int[5];  //定义数组 用来接收录入的数据
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; ) {
            System.out.print("请录入第" + (i + 1) + "位裁判的分数:");
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("请重新输入0-100之间的数!");
                // 这里不用写continue 因为它是循环中的最后一条语句 且没有i++
            } else {
                scores[i] = score;
                i++;  //输入的数符合条件 i才自增
            }
        }

        // 使用方法求数组的最大值和最小值 为了规范 也求总分
        int max = maxScore(scores);
        int min = minScore(scores);
        int total = totalScore(scores);


        // 总分 - 最大值 - 最小值,剩余的分数再求平均数,改平均数为选手最终得分
        double finalScore = (total - max - min) / (scores.length - 2.0);  //需要写2.0 不然int/int是整除 丢精度
        System.out.print("最终得分:" + finalScore);

    }


    static int getMaxScore(int[] score) {

        int max = score[0];
        for (int i = 1; i < score.length; i++) {  //直接从1开始 (0已赋值)
            if (score[i] > max) {
                max = score[i];  //大于就设置新的max
            }
        }

        return max;  //循环结束后,将max返回
    }

    static int getMinScore(int[] score) {

        int min = score[0];
        for (int i = 1; i < score.length; i++) {  // 0位已赋值给min
            if (score[i] < min) {
                min = score[i];  //有小于的就设置新的min
            }
        }

        return min;  //循环结束后,将min返回
    }

    static int getTotalScore(int[] scores){
        int total = scores[0];  //不写0 提高通用性
        for (int i = 1; i < scores.length; i++) {
            total = total + scores[i];
        }

        return total;
    }
}
