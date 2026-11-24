package com.rj.bd.test0921.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        List<String> list2 = new ArrayList<>();
        List<Boolean> list3 = new ArrayList<>();

        list1.add(0,12);
        list1.add(1,22);
        list1.add(2,33);

        list2.add("一");
        list2.add("二");
        list2.add("一");

        list3.add(true);
        list3.add(false);
        list3.add(true);

        System.out.println(list1);
        System.out.println(list1.get(1));
        System.out.println(list2);
        System.out.println(list3);
    }
}
