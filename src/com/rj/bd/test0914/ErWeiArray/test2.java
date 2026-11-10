package com.rj.bd.test0914.ErWeiArray;

import java.util.Scanner;

/**
 * @desc 二维数组2
 */
public class test2 {
    public static void main(String[] args) {

        // 1.二维数组的定义
        int[][] arr2 = new int[3][3];  //定义一个二维数组,3行4列

        // 2.给二维数组赋值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入9个整型数：");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // 3.遍历二维数组
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();  //输出完一行换一下行
        }

        // 4.求对角线之和(从左到右)
        int num1 = 0;
        for (int i = 0; i < 3; i++) {
            num1 = arr2[i][i] + num1;

        }
        System.out.println("3x3矩阵对角线从左到右的对角线之和为" + num1);

        // 4.1 求对角线之和(从右到左)
        int num2 = 0;  //用于存放相加结果
        for (int i = 0; i < 3; i++) {
            num2 = arr2[i][2 - i] + num2;
        }
        System.out.println("3x3矩阵对角线从右到左的对角线之和为" + num2);


    }

}
