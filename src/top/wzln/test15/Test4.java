package top.wzln.test15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/*
    学校选举学生会主席，有5个候选人
    全校1000名同学参与投票（每人一票，可以弃权，或者选1-5号）。
    投票使用Random模拟。
        0：弃权
        1-5：给对应的候选人投票

    要求1：
        统计每个候选人的得票数和得票率，并找出票最多的候选人
    要求2：
        统计弃票数和弃权率是多少？
 */
public class Test4 {

    public static int studentNum = 1000;
    static void main(String[] args) {
        // 做法1:适合候选人少的场景,比较简单
        Method1();

    }

    public static void Method1() {
        int[] person = new int[5];  //创建一个数组存放票数
        int invalid = 0;

        Random r = new Random();
        for (int i = 0; i < studentNum + 1; i++) {  //循环1000次[0,1001)
            switch (r.nextInt(0, 6)) {    // [0,6)
                case 1:
                    person[0]++;  //在对应位置++
                    break;
                case 2:
                    person[1]++;
                    break;
                case 3:
                    person[2]++;
                    break;
                case 4:
                    person[3]++;
                    break;
                case 5:
                    person[4]++;
                    break;
                case 0:
                    invalid++;
                    break;
            }

        }

        // 循环结束之后,查找数组中的最大值
        int max = person[0];
        for (int i = 1; i < person.length; i++) {  //直接从1开始
            if (person[i] > max){
                max = person[i];
            }
        }

        // 找到最大值后,遍历查找谁等于最大值
        for (int i = 0; i < person.length; i++) {
            if (person[i] == max){
                System.out.println("得票数最多的候选人是" + (i+1) + "号,他得了" + person[i] + "票");
            }
        }

        // 计算弃权率
        System.out.println("弃票数为:" + invalid + "弃权率为:" + invalid / studentNum);
    }
}
