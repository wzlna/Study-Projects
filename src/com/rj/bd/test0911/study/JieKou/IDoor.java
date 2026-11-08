package com.rj.bd.test0911.study.JieKou;

/**
 * @desc 自定义接口IDoor
 * @desc 接口:就是定义了一组规则，让实现该接口的类去实现这些规则,接口与实现类是密不可分的
 */
public interface IDoor {
    public void smallDoor();  //只定义了函数,但是没有实现，也没有方法体

    public void middleDoor();

    public void bigDoor();
}
