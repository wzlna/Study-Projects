package com.rj.bd.test0909.homework;

/**
 * @desc 自定义 计算器类
 */

public class JiSuanQi {
    // 属性 F
    public int result;

    // 无参构造器 默认可以不写 C
    public JiSuanQi() {
        System.out.println("欢迎使用计算系统");
    }

//    计算器程序不建议使用有参构造器的方式传值
//    // 有参构造器 C
//    public JiSuanQi(int number1, int number2) {
//        Number1 = number1;
//        Number2 = number2;
//    }

    // 方法 M (方法有返回值 构造器没有)
    public int jia( int number1, int number2 ) {
        result = number1 + number2;
        return result;
    }

    public int jian( int number1, int number2 ) {
        result = number1 - number2;
        return result;
    }

    public int cheng( int number1, int number2 ) {
        result = number1 * number2;
        return result;
    }

    public int chu( int number1, int number2 ) {
        result = number1 / number2;
        return result;
    }


}
