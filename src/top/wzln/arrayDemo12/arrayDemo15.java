package top.wzln.arrayDemo12;

/*
    给你两个有序数组arr1 和 arr2
    讲两个数组中的数据合并到一个大数组中
    要求：合并之后的大数组也是有序的
    举例1：
    arr1: 1 3 5 7 9
    arr2: 2 4 6 8 10
    arr3: 1 2 3 4 5 6 7 8 9 10
 */
public class arrayDemo15 {
    static void main() {

        // 定义数组
        int[] arr1 = {1, 3, 5, 7, 9}; //5位
        int[] arr2 = {2, 4, 6, 8, 10, 11}; //6位
        int[] result = new int[arr1.length + arr2.length];

        // 定义三个指针
        int cursor1 = 0;
        int cursor2 = 0;
        int cursor3 = 0;

        // 需要确保cursor1和2不能等于他们的长度(索引从0开始)
        while (cursor1 < arr1.length && cursor2 < arr2.length) {  //使用while,因为cursor3需要定义在外面(都不超的情况跑完之后,cursor3还需要接着使用)
            // 比较
            if (arr1[cursor1] <= arr2[cursor2]) {
                result[cursor3] = arr1[cursor1];
                cursor1++;  //进行比较arr1的下一个数
            } else {  //arr2小的情况
                result[cursor3] = arr2[cursor2];
                cursor2++;  //进行比较cursor2的下一个数
            }
            cursor3++;//一轮判断执行完后前进一位
        }

        // cursor1有剩余的情况
        while (cursor1 < arr1.length) {
            result[cursor3] = arr1[cursor1];  //cursor1已经在上个循环里++了,并且没有执行就到这了
            cursor1++;
            cursor3++;
        }

        // cursor2有剩余的情况
        while (cursor2 < arr2.length) {
            result[cursor3] = arr2[cursor2];
            cursor2++;
            cursor3++;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
