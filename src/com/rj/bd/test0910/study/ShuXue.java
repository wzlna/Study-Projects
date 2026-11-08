package com.rj.bd.test0910.study;

public class ShuXue {
    // 属性和构造器可以不写

    //函数1 求绝对值
    public int qiuJueDuiZhi(int number){
        if (number < 0) {
            number = -number;
        }
        return number;
    }
    // 函数2 向下取整
    public int xiangXiaQuZheng(double number){
        if (number>=0){
            return (int)number;  //强制double转换为int，自动向下取整
        }else{
            System.out.println("number=" + number);
            int b = (int)number;
            System.out.println("b=" + b);
            int c = (number==b) ? b : b - 1;  //-3.0取整后还是-3.0 这时候就不能再-1了,这样写是为了防止误判
            System.out.println("c=" + c);
            return c;
        }

    }
    // 函数3 向上取整
    public int xiangShangQuZheng(double number){
        if (number>=0){
            return (int)number + 1;
        }else{
            return (int)number;  //-3.4强转后是-3
        }
    }

    // 函数4:求5+10+15+20+...+100=?
    public int getSum(int n){
        int result = 0;
        for (int i = 5; i < n + 1; i+=5) {  //从5开始
            result += i;
        }
        return result;
    }

}
