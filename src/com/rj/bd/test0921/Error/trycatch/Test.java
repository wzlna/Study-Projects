package com.rj.bd.test0921.Error.trycatch;

public class Test {
    public static void main(String[] args) {

        ShuZi sz = new ShuZi();

        try {  // 尝试去处理
            sz.chuFa(2, 0);
        } catch (Exception e) {  // Exception：异常处理类
            System.out.println("捕获异常的错误信息提示：" + e.getMessage());
            System.out.println("捕获异常发生的内存地址信息：" + e.getStackTrace());
        }

    }
}
