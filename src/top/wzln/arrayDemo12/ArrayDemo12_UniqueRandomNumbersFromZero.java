package top.wzln.arrayDemo12;

import java.util.Random;

/*
    去除重复元素
    需求:获取10个0-100之间的随机数并存入到数组当中,要求保证数据是唯一的

    i:
    j: 遍历

 */
public class ArrayDemo12_UniqueRandomNumbersFromZero {
    static void main() {

        // 1.定义一个长度为10的动态数组
        int[] arr = new int[10];

        Random r= new Random();

        for (int i = 0; i < arr.length;) {

            int num = r.nextInt(0,101); //生成随机数
            int count = 0;

            for (int j = 0; j < i; j++) {  //遍历当前有的所有数
                if (num == arr[j]){
                    count++;
                    break;
                }
            }

            // 对count进行判断
            if ( count == 0 ){
                arr[i] = num;  //条件符合时再赋值
                i++; //条件符合时再自增
            }
        }

        // 遍历打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
