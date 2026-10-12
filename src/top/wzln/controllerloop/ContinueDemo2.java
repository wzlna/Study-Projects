package top.wzln.controllerloop;

/*
    逢七过：循环打印1-100之间的数字，如果数字包含7或者是7的倍数，输出“过”

    思路:该类题不能使用万能提取位数算法 原因int不能转换为str  //后期补充:可以使用int n_length = (n + "").length();
            不能获取到它的长度 也就不能控制提取算法最后一位的次数

        但是位数不会超过三位(100不是7的有缘数),所以用取余和除10的方法把个位和十位获取
        再进入if循环判断是否是7的有缘数
 */
public class ContinueDemo2 {
    static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int one = i % 10; //获取个位
            int two = i / 10; //获取10位 (原理:自动舍弃小数)

            if (one == 7 || i % 7 == 0 || two == 7) { //TODO:没考虑到包含7
                System.out.println("过");
                continue; //打印完之后跳过本次循环 不让下方打印7的有缘数
            }
            System.out.println(i);

        }

    }
}
