package com.rj.bd.test0917.JingDu;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

/**
 * @desc 精度叫准
 */
public class Test {
    public static void main(String[] args) {
        double a = 3.14 * 2.0 * 5;
        System.out.println("原始数据:" + a);

        // 方式一：DecimalFormat
        DecimalFormat df = new DecimalFormat("0.00");  //0.00:小数位数
        String result = df.format(a);
        System.out.println("DecimalFormat之后的：" + result);

        // 方式二：NumberFormat
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);
        String result2 = nf.format(a);
        System.out.println("NumberFormat之后的：" + result2);

        // 方式三：
        // Java在java.math包中提供的BigDecimal类，可以用来对超过16位有效位的数进行精确的运算
        // 其中包含了加减乘除等方法，还可以对结果进行精度保留，这里只演示精度保留

        BigDecimal a1 = new BigDecimal(a);
        BigDecimal BDResultDown = a1.setScale(2, BigDecimal.ROUND_DOWN);
        System.out.println("BigDecimal四舍五入:" + BDResultDown);
        BigDecimal BDResultUP = a1.setScale(2, BigDecimal.ROUND_UP);
        System.out.println("BigDecimal从零舍入:" + BDResultUP);
    }
}
