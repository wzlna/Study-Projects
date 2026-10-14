package top.wzln.arrayDemo12;
/*
    数组的元素访问
        1.获取数据
        2.修改数据
 */
public class arrayDemo2 {
    static void main() {
        //1.利用静态初始化创建数组
        int[] arr = {10,20,30,40,50,60};

        // 2.获取数组中的元素
        // 索引:从0开始 连续➕1 中间不间断
        // 0 1 2 3 4
        int num = arr[0];
        System.out.println(arr[1] + " " + num);

        // 修改数据
        // arr[索引] = 新数据;
        // 注意:一旦修改完毕 原来的数据就被覆盖了
        arr[0] = 100;
        System.out.println(arr[0]);

    }
}
