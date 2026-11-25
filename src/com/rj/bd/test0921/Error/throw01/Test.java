package com.rj.bd.test0921.Error.throw01;

public class Test {
    public static void main(String[] args) throws Exception {

        ShuZi sz = new ShuZi();

        try {
            sz.chuFa(2, 0);
        } catch (Exception e) {
            System.out.println("1.打印异常信息:" + e.getMessage());
        }

    }
}
