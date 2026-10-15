package top.wzln.arrayDemo12;

import java.util.Random;

/*
    去除重复元素
    需求:获取10个1-100之间的随机数并存入到数组当中,要求保证数据是唯一的
 */
public class arrayDemo11 {
    static void main() {

        // 1.定义一个长度为10的数组
        int[] arr = new int[10];

        // 2.获取随机数
        Random r = new Random();

        int num;
        int num2;

        for (int i = 0; i < arr.length; i++) {
            num = r.nextInt(0,arr.length);  //获取随机数
            arr[i] = num;
            // 添加防重复逻辑
            for (int j = 0; j <= i; j++) {
                if (arr[i] == arr[j]){  //arrj每次都会从arr0开始遍历,如果发现arri等于了arrj,就说明重复了
                    num2 = r.nextInt(0,arr.length);  //获取随机数2
                    arr[i] = num2;  // 重新用生成的随机数2重新对i赋值(有缺陷:num和num2可能相同)
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
