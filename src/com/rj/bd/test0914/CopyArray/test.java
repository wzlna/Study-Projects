package com.rj.bd.test0914.CopyArray;

import java.util.Arrays;

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
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();


        // 方式2:使用System.arraycopy()方法
        // 这个方法为native方法,是由C语言实现的,效率高(推荐使用)
        int[] arr3 = new int[arr1.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);  //第一个参数:源数组,第二个参数:源数组的起始索引,第三个参数:目标数组,第四个参数:目标数组的起始索引,第五个参数:拷贝的长度
        // 遍历打印
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
        System.out.println();


        // 方式3:使用Arrays.copyOf()方法
        // 同样看源码，它的实现还是基于System.arraycopy()方法的,所以效率自然低于System.arraycopy()方法,但是它的代码量少,使用起来也方便,所以在实际开发中,我们可以根据实际情况选择使用哪种方式
        int[] arr4 = new int [arr1.length];
        arr4 = Arrays.copyOf(arr1, arr4.length);  //第一个参数:源数组,第二个参数:拷贝的长度
        //遍历打印
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + "\t");
        }
        System.out.println();


        // 方式4:使用clone()方法
        //从源码来看也是native方法,但返回为Object类型,所以复制时将发生强转,所以效率不如System.arraycopy()方法
        int[] arr5 = new int[arr1.length];arr5 = arr1.clone();  //clone()方法是Object类中的方法
        //遍历打印
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + "\t");
        }
        System.out.println();

    }
}
