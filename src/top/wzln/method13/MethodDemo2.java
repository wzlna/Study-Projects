package top.wzln.method13;

import java.util.Random;

/*
    获取10个1-100之间的随机数并存入到数组当中,要求保证数据是唯一的
 */
public class MethodDemo2 {
    static void main() {


        // 1.创建数组和标记变量
        int[] arr = new int[10];
        Random r = new Random();

        //创建循环
        for (int i = 0; i < arr.length; ) {

            // 2.获取随机数
            int num = r.nextInt(1, 101);  //获取到的随机数存到num变量里面

            if(onArr(num,arr,i)){
                continue;  // 存在就重新跑循环(i还没有++)
            }

            arr[i] = num;  //不写else的原因:如果随机数在数组里面就直接continue了,这里不会执行
            i++;

        }

        // 3.打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    // 定义方法,判断num在数组中是否存在
    public static boolean onArr(int num,int[] arr,int length){

        for (int i = 0; i < length; i++) {  //遍历
            if (num == arr[i]) {
                // 遇到符合条件的 直接返回true
                // 此时方法直接结束
                return true;
            }
        }
        // 循环判断完毕了还没有找到,说明这个数字在数组当中不存在,返回false
        return false;  //能走到这一步说明前面没有true
    }

}
