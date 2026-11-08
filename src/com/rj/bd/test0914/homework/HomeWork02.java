package com.rj.bd.test0914.homework;

import java.util.Scanner;

/**
 * @desc 输入一行字符串, 分别统计出其中英文字母 空格 数字和其他字符的个数
 */
public class HomeWork02 {
    public static void main(String[] args) {

        // 1. 控制台输入
        Scanner sc = new Scanner(System.in);
        System.out.println("现在请输入一行字符串");
        String input = sc.nextLine();  // nextLine

        // 2.定义几个变量用来承接计算的结果
        int words = 0;
        int spaces = 0;
        int nums = 0;
        int otherChar = 0;

        // 3.使用方法拆解字符串到 char数组里
        char [] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
