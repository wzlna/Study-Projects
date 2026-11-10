package com.rj.bd.test0914.test;

import java.util.Arrays;

/*
 * @desc 冒泡排序算法
 * @param arr 待排序的数组
 * @return 排序后的数组
 */
public class MaoPao {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换 arr[j] 和 arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSort2(int[] arr) {  //实现方法2
        Arrays.sort(arr);
        return arr;
    }
}
