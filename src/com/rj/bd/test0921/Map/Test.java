package com.rj.bd.test0921.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @desc Map练习
 */
public class Test {
    public static void main(String[] args) {
        // 1.Map的初始化/定义Map容器
        Map<String, Object> map01 = new HashMap<String, Object>();
        Map<String, Object> map02 = new HashMap<String, Object>();

        // 2.向map容器中存入数据
        map01.put("name", "zhangsan");
        map01.put("sex", "man");
        map02.put("name", "lisi");
        map02.put("sex", "woman");

        // 3.读取map容器中的数据
        System.out.println(((String) map01.get("name")) + ((String) map01.get("sex")));
        System.out.println(map02.get("name"));
        System.out.println(map02.get("sex"));
        System.out.println(map02.keySet());  //返回所有key
    }
}
