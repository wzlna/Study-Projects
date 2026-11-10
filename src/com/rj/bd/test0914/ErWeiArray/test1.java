package com.rj.bd.test0914.ErWeiArray;
/**
 * @desc 二维数组
 */
public class test1 {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];  //定义一个二维数组,3行3列
        int [][] arr2 = new int[][]{   //定义一个二维数组,3行3列
                {11,12,13},
                {21,22,23},
                {31,32,33}
        };
        System.out.println("arr数组的"+arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);
        method1(arr);  //第一种定义方式
        System.out.println("--------------------");
        method2(arr2);  //第二种定义方式
    }

    public static void method1(int [][] arr) {
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        for (int i = 0; i < arr.length; i++) {  //arr2.length表示二维数组的行数 取的是第i行的行数
            for (int j = 0; j < arr[i].length; j++) {  //arr2[i].length表示二维数组的列数 取的是第i行的列数
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void method2(int[] [] arr2){
        for (int i = 0; i < arr2.length; i++) {  //arr2.length表示二维数组的行数 取的是第i行的行数
            for (int j = 0; j < arr2[i].length; j++) {  //arr2[i].length表示二维数组的列数 取的是第i行的列数
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();  //换行
        }
    }


}
