package com.rj.bd.test0921.ArraySort;

import java.util.Arrays;

public class ArraySortTest1 {
    public static void main(String[] args) {
        int[] arr01 = new int[5];
        arr01[0] = 123;
        arr01[1] = 13;
        arr01[2] = 56;
        arr01[3] = 25;
        arr01[4] = 35;
        System.out.println(arr01);  // 打印内存地址
        for (int i = 0; i < arr01.length; i++) {
            System.out.print(arr01[i] + "\t");
        }

        // 排序
        Arrays.sort(arr01);  // 已经默认导入,还是static方法,所以不需要new也能使用
        System.out.println(arr01);  // 打印内存地址
        for (int i = 0; i < arr01.length; i++) {
            System.out.print(arr01[i] + "\t");
        }

    }
}
