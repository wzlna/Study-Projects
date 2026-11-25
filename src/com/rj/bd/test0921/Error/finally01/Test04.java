package com.rj.bd.test0921.Error.finally01;

/**
 * @desc 测试异常处理 - fianlly
 */
public class Test04 {
    public static void main(String[] args) {
        int [] a = {3,5};

        try {  //尝试
            System.out.println(a[3]);
        } catch (Exception e) {  //捕获异常并补救
            System.out.println("只是单纯的捕获的异常的信息,不进行处理:" + e.getMessage());
        } finally {  //补救
            a = new int [9];
            System.out.println("检测到异常,已为您自动拓宽数组长度,处理之后的结果为:" + a[3]);
        }
    }
}
