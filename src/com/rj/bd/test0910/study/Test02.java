package com.rj.bd.test0910.study;

/**
 * @desc 拓展讲解:用一个for循环实现99乘法表
 */
public class Test02 {
    public static void main(String[] args) {
        int lie = 1;
        for(int hang = 1;hang<=9;){
            System.out.print(lie + "*" + hang + "=" + lie * hang + "\t");
            if (lie >= hang){  //控制列不要超过当前行数
                System.out.println();  //超过了就 换行
                lie = 1;  //重置状态接着从1开始乘
                hang++;  //行数记录器++;
            }
            else {
                lie++;  // 列没有超过当前行数的时候 lie一直++并计算 直到超过行数
            }
        }

    }
}
