package com.rj.bd.test0911.study;

/**
 * @desc 累加求和类，用于测试递归算法
 */
public class LeiJiaQiuHe {

    /**
     * @desc 累加求和方法
     * @param n
     * @return 累加求和结果
     */
    public static int leijia(int n) {
        if (n <= 0){
            System.exit(0);
        }
        if (n == 1) {
            return 1;
        }
        return n + leijia(n - 1);
    }

    // 求有规律的数的累加总和
    public int qiuZongHe(int m ){
        if (m == 5){
            return leijia(5);
        }
        return leijia(m) + qiuZongHe(m-5);
    }
}
