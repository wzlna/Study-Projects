package top.wzln.test15;
/*
    中位数
    给定两个正序数组arr1和arr2,请先合并数组,并找出合并之后数组的中位数.
    举例:
        1 2 3 4 5 6 7 8 9       中位数:5  (奇数个)
        1 2 3 4 5 6             中位数:(3+4)/2  (偶数个)
 */
public class Test3 {
    public static void main() {
        // 定义两个数组
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10,11};

        double number = findMedianSortedArrays(arr1,arr2);
        System.out.println(number);

    }

    public static double findMedianSortedArrays(int[] arr1,int[] arr2){
        //把arr1和arr2里面的数据合并到一个大数组中

        //1.定义一个大数组
        int len1 = arr1.length; //长度
        int len2 = arr2.length;
        int[] arr = new int[len1+len2];  //创建一个空数组用来存放合并后的数据

        //2.把两个小数组的数据,放到大数组当中,而且要正序
        // 粗暴的办法:不管顺序,直接把arr1和arr2里面的数据,不管数据添加到大数组当中,添加完毕再排序(思路最简单,但是效率太低)

        // 快捷的思路:在添加的过程中,保证顺序(前提:arr1,arr2必须是正序的)
        // 定义两个画图变量
        int index1 = 0;
        int index2 = 0;

        //3.遍历
        for (int i = 0; i < arr.length; i++) {  //遍历大数组
            // 如果arr1是短的
            if (index1 == arr1.length){
                arr[i] = arr2[index2];
                index2++;
                continue;
            }
            //如果arr2是短的
            if (index2 == arr2.length){
                arr[i] = arr1[index1];
                index1++;
                continue;
            }

            // 判断index1和index2指向的元素谁小,谁小添加谁
            if (arr1[index1] <= arr2[index2]){
                arr[i] = arr1[index1];
                index1++;
            }else {
                arr[i] = arr2[index2];
                index2++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return 10.2;
    }
}
