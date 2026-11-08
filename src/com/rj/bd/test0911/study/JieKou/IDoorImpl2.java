package com.rj.bd.test0911.study.JieKou;
/**
 * @desc 接口IDoor的实现类2
 * @desc 一个接口可以有多个实现类
 */
public class IDoorImpl2 implements IDoor {  // 方法的名称、数量 都必须和接口中定义的函数一致

    @Override // 意思是:这是重写的方法 这仅仅是个注解 给IDE看的， Override:覆盖
    public void smallDoor(){ //实现接口中的小门方法 方法的名称、数量 都必须和接口中定义的函数一致
        System.out.println("实现类2的小门");
    }

    @Override
    public void middleDoor(){
        System.out.println("实现类2的中门");
    }
    @Override
    public void bigDoor(){
        System.out.println("实现类2的大门");
    }
}
