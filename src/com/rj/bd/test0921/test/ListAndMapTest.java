package com.rj.bd.test0921.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAndMapTest {
    public static void main(String[] args) {
        // 创建能存储Map的List
        List<Map<Integer, Boolean>> list1 = new ArrayList<>();

        // 创建Map对象  创建的对象要和list中存储类型一致 否则list存不进去
        Map<Integer, Boolean> map01 = new HashMap<>();
        Map<Integer, Boolean> map02 = new HashMap<>();

        // 向map容器中存入数据
        map01.put(1, true);
        map01.put(2, false);
        map02.put(3, true);
        map02.put(4, false);

        // 读取map容器中的数据
        System.out.println(map01.get(1));
        System.out.println(map01.get(2));
        System.out.println(map02.get(3));
        System.out.println(map02.get(4));
        System.out.println(map01.keySet());  //返回所有key
        System.out.println(map02.keySet());  //返回所有key

        list1.add(map01);
        list1.add(map02);

        // 读取存在list中的map
        System.out.println(list1);

    }
}
