package top.wzln.test15;
/*
    中位数
    给定两个正序数组arr1和arr2,请先合并数组,并找出合并之后数组的中位数.
    举例:
        1 2 3 4 5 6 7 8 9       中位数:5  (奇数个)
        1 2 3 4 5 6             中位数:(3+4)/2  (偶数个)
 */
public class Test3 {
    static void main() {
        // 定义两个数组
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10,11};
        int arr1_count = 0;
        int arr2_count = 0;
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr3.length-2;) {
            if(arr1[arr1_count] >= arr2[arr2_count]){
                arr3[i] = arr2[arr2_count];
                arr2_count++;
            } else {
                arr3[i] = arr1[arr1_count];
                arr1_count++;
            }
            i++;
        }

        if(arr1_count<arr1.length){
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[arr1_count];
                arr1_count++;
            }
        }

        if(arr2_count<arr2.length){
            for (int i = 0; i < arr2.length; i++) {
                arr3[i] = arr2[arr2_count];
                arr2_count++;
            }
        }


        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}
