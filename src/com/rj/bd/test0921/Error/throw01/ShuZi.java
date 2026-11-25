package com.rj.bd.test0921.Error.throw01;

/**
 * @desc 数字类
 */
public class ShuZi {
    public int chuFa(int a, int b) throws Exception {
        if(b==0){
            throw new ArithmeticException("除数不能是0");
        }
        return a / b;
    }
}
