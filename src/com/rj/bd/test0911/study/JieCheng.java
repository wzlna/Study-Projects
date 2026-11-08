package com.rj.bd.test0911.study;

/**
 * @desc 在自定义类JieCheng中通过递归算法实现求阶乘
 */
public class JieCheng {
    // 自定义函数:求阶乘
    public int jieCheng(int n) {
        if (n <= 0) {
            System.exit(0);
        }
        if (n == 1) {
            return 1;
        }

        return n * jieCheng(n - 1);

    }
}
