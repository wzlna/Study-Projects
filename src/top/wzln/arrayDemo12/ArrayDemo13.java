package top.wzln.arrayDemo12;
/*
    定义一个递增有序数组，去除其中重复元素

    快慢指针法
 */
public class ArrayDemo13 {
    static void main() {
        int[] arr = {1,1,2,2,2,2,3,3,3,3};  // 长度为10

        // 1.定义两个指针
        int slow = 0;
        int fast = 1;

        // 2.利用循环不断的移动快慢指针，找不重复的元素
        while (fast<arr.length) {  // 如果超过arr[9]就停止循环
            // 判断两个指针指向的数据是否相同,相同仅自增fast,不相同就自增slow然后把fast赋值给slow,然后再自增fast
            if (arr[slow] != arr[fast]){
                // 两个指针不相等,先把slow后移一位,然后快指针的数据存入慢指针位置 然后自增
                slow++;
                arr[slow] = arr[fast];
            }

            fast++;  //无论相等还是不相等都会自增,不相等slow自增
        }
        // 循环结束后 表示不重复的数据已将找到了
        // 3.输出结果
        for (int i = 0; i <= slow; i++) {  //需要小于等于
            System.out.println(arr[i]);
        }

    }

}
