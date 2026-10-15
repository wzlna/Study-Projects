package top.wzln.arrayDemo12;
/*
    数组的常见问题:
        索引越界
 */
public class arrayDemo6 {
    static void main() {

        // 1.定义数组
        int[] arr = {1,2,3,4,5};

        // 索引越界
//        System.out.println(arr[10]);

        // 控制索引越界
        int index = 10;
        if (index >=0 && index<arr.length){
            System.out.println(arr[index]);
        }else {
            System.out.println(index + "超出边界! 当前数组可接受的最大长度为" + arr.length);
        }
    }
}
