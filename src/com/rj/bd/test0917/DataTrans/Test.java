package com.rj.bd.test0917.DataTrans;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @desc 数据类型转
 */
public class Test {
    public static void main(String[] args) throws ParseException {

        // 1.数字与字符串之间互转
        String str = "123";
        int strToInt = Integer.parseInt(str);
        System.out.println(strToInt + 2);

        int a = 111;
        String intToStr = a + "";
        System.out.println(intToStr + "998");

        //2.字符串与日期之间互转
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年-MM月-dd日 HH:mm:ss");
        String dateToStr = simpleDateFormat.format(date);
        System.out.println(dateToStr);
        //将字符串类型的日期转变为日期类型的日期
        Date strToDate = simpleDateFormat.parse(dateToStr);//"abc"
        System.out.println(strToDate);
    }
}
