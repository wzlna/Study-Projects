package top.wzln.arrayDemo12;
/*
    按照要求定义数组，数组中的数据任意书写

    1.定义数组存储3位同学的年龄
    2.定义数组存储5位同学的身高
    3.定义数组存储3位同学的名字
 */
public class arrayDemo1 {
    static void main() {
        int[] age = new int[]{12,13,14};  //数组定义完整语法
        double[] height = {1.9,1.8,1.7,1.6,1.5};
        String[] name = {"张三","李四","王五"};

        System.out.println(age);
        System.out.println(height);
        System.out.println(name);
    }
}
