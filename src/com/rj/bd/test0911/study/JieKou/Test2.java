package com.rj.bd.test0911.study.JieKou;

/**
 * @desc 实现类2 体现一个接口可以有多个实现类
 */
public class Test2 {
    public static void main(String[] args) {
        IDoor door = new IDoorImpl2();

        door.smallDoor();
        door.middleDoor();
        door.bigDoor();
    }
}
