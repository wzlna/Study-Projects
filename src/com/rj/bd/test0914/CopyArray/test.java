package com.rj.bd.test0914.CopyArray;
/**
 * @desc 数组的拷贝
 */
public class test {
    public static void main(String[] args) {
        // 方式1:for循环
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {  //arr1.length表示数组的长度 逐个添加
            arr2[i] = arr1[i];
        }

        // 遍历打印
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // 方式2:使用System.arraycopy()方法
        // 这个方法为native方法,是由C语言实现的,效率高(推荐使用)
        int[] arr3 = new int[arr1.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);  //第一个参数:源数组,第二个参数:源数组的起始索引,第三个参数:目标数组,第四个参数:目标数组的起始索引,第五个参数:拷贝的长度

        // 遍历打印
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}
