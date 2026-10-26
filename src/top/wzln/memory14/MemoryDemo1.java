package top.wzln.memory14;
/*
    数组:引用数据类型
 */
public class MemoryDemo1 {
    static void main() {
        int[] arr ={1,2,3};  //这里省略了new,不是没有
        System.out.println(arr);  //打印效果:arr这个new 在堆内存中的内存地址(会有不同)
        System.out.println(arr[1]);  //打印效果:数组的第2位
    }
}
