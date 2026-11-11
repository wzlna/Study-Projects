package com.rj.bd.test0917.demoMethods;

public class StringDemo {
    public static void main(String[] args) {
        String str = "IamaStudent ";
        System.out.println("-------首先要获取字符串的长度：-------" + str.length());
        System.out.println("-------charAt() 截取一个字符:---------" + str.charAt(2));
        System.out.println("-------字符串转换为字符数组:------" + str.toCharArray());
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + "   ");
        }

        System.out.println("\n");
        System.out.println("startsWith()方法决定是否以特定字符串开始:" + str.startsWith("I"));// startsWith()方法决定是否以特定字符串开始，
        System.out.println("endsWith()方法决定是否以特定字符串结束:" + str.endsWith("t")); // endWith()方法决定是否以特定字符串结束

        String s1 = "Hello";
        String s2 = new String(s1);
        System.out.println(s1.equals(s2)); // equals()方法比较字符串对象中的字符
        System.out.println(s1 == s2);// ==运算符比较两个对象是否引用同一实例


        System.out.println(str.indexOf("a"));// indexOf() 查找字符或者子串第一次出现的地方。
        System.out.println(str.lastIndexOf("a"));// lastIndexOf()
        // 查找字符或者子串是后一次出现的地方。
        //截取子字符串
        System.out.println(str.substring(2));// 从角标为2的位置开始截取到最后
        System.out.println(str.substring(2, 5));//从角标为2的位置开始截取到5的位置，但是不包含5的位置


        System.out.println("concat() 连接两个字符串:" + str.concat("1234567"));// concat() 连接两个字符串
        System.out.println(str + "1234567");
        //替换
        System.out.println(str.replace("a", "bj"));// 用一个字符在调用字符串中所有出现某个字符的地方进行替换
        System.out.println(str.replace(str, s1));// 用一个字符序列替换另一个字符序列
        System.out.println("没用trim()之前：" + str.length());
        System.out.println(str.trim());// trim() 去掉起始和结尾的空格
        System.out.println("用trim()之后：" + str.trim().length());

        String str3 = "abc,de,fg,hi,jk";// split字符串分割
        String[] st3 = str3.split(",");
        for (int i = 0; i < st3.length; i++) {
            System.out.println(st3[i]);// 输出结果abcdefghijk
        }

        System.out.println(str.toUpperCase());// toUpperCase() 转换为大写
        System.out.println(str.toLowerCase());// toLowerCase() 转换为小写
    }
}
