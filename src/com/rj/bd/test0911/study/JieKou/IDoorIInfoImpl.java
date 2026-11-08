package com.rj.bd.test0911.study.JieKou;
/**
 * @desc 接口IDoor 和 IInfo的实现类
 * @desc 一个实现类可以有多个实现接口(IDoor,IInfo)
 */
public class IDoorIInfoImpl implements IDoor,IInfo {  // 方法的名称、数量 都必须和接口中定义的函数一致

    @Override // 意思是:这是重写的方法 Override:覆盖
    public void smallDoor(){ //实现接口中的小门方法 方法的名称、数量 都必须和接口中定义的函数一致
        System.out.println("实现类2的小门");
    }

    public void middleDoor(){
        System.out.println("实现类2的中门");
    }
    @Override
    public void bigDoor(){
        System.out.println("实现类2的大门");
    }

    @Override
    public void getInfo(){
        System.out.println("getInfo!");
    }

    @Override
    public int getNumber(){  //即使写了Override,返回值类型也必须和接口中定义的一致
        return 0;
    }
}
