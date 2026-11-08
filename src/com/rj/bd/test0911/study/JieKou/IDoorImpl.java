package com.rj.bd.test0911.study.JieKou;

/**
 * @desc 接口IDoor的实现类1
 */
public class IDoorImpl implements IDoor {  // 方法的名称、数量 都必须和接口中定义的函数一致
    @Override // 意思是:这是重写的方法 Override:覆盖
    public void smallDoor() {  //实现接口中的小门方法 方法的名称、数量 都必须和接口中定义的函数一致
        System.out.println("小门");
    }

    @Override
    public void middleDoor() {
        System.out.println("中门");
    }

    @Override
    public void bigDoor() {
        System.out.println("大门");
    }
}
