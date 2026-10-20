package top.wzln.arrayDemo12;
/*
    需求: 已知数组元素为 {33,5,22,44,55}
    请找出数组中最大值并打印在控制台

    细节1:
        循环的开始条件,如果为0 请问:对结果有何影响?
        对结果没有任何影响 只不过循环会多执行一次

    细节2:
        max的初始化值,能不能赋值为0?
            能 但是arr里面不能有负数
 */
public class ArrayDemo8_MaxAndMin {
    static void main() {
        int[] arr = {33,5,22,44,55,100};
        int max = arr[0] ;
        int min = arr[0] ;

        for (int i = 0 ;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        for (int i = 0 ;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
