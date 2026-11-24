package com.rj.bd.test0921.List;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @desc 使用Collections.sort方法对数组中的数据进行排序
 */
public class ListTest2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(0,12);
        list.add(1,2);
        list.add(2,3);
        list.add(2,99);

        Collections.sort(list);

        System.out.println(list);
    }
}
