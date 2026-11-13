package com.rj.bd.test0917.TimeStamp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @desc TimeStamp时间戳测试类
 */
public class Test {
    public static void main(String[] args) {

        // 方式一
        System.out.println(System.currentTimeMillis());
        System.out.println("------------------------");

        // 方式二
        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println("------------------------");

        // 方法三:
        Date dt = new Date();
        System.out.println(dt.getTime());
        System.out.println("------------------------");

        // 拓展内容:日期的输出
        System.out.println(dt);
        System.out.println("------------------------");
        //  对dt获取到的时间进行格式化输出
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String SDFDate = SDF.format(dt);
        System.out.println(SDFDate);
        // 年份
        System.out.println(dt.getYear());
    }
}
