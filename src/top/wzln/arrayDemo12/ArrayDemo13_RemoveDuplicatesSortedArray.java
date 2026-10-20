package top.wzln.arrayDemo12;

/*
    定义一个递增有序数组，去除其中重复元素

    快慢指针法
 */
public class ArrayDemo13_RemoveDuplicatesSortedArray {
    static void main() {
        int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3};  // 长度为10

        // 定义两个指针
        int slow = 0;
        int fast = 1;

        while(fast < 10){
            if (arr[slow] == arr[fast]){
                fast++;
            }else{
                slow++;  //slow前移一位用来存储不同的值
                arr[slow] = arr[fast];  // 将不同的值赋值给位移后的slow
                fast++;  //赋值完后 fast继续++ 查看下一个数(继续循环直到fast>9)
            }
        }

        for (int i = 0; i <= slow; i++) {
            System.out.println(arr[i]);
        }


    }
}
