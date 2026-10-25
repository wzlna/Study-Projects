package top.wzln.method13;

import java.util.Scanner;

/*
    某快递公司的运费规则如下(首重1kg,超出部分按kg计算,不足1kg按1kg算)
    首重1kg:10元
    超出1-5kg:每kg加2元;
    超出5kg以上:每kg加1.5元.
    键盘录入小数,表示用户快递的重量,计算最终的结果

    要求1:快递重量必须大于0,否则重新输入
    要求2:不同价位的计算,单独定义一个方法
 */
public class MethodTest3 {
    
    private static final double oneKg = 10;
    static void main() {
        Scanner sc = new Scanner(System.in);  //只需声明一次不用循环
        double weight;  //定义一个main变量 不要main内部局部变量
        double costs;

        do {
            System.out.print("输入物品重量(单位:kg)");
            weight = sc.nextDouble();
        } while (weight <= 0);  //如果while不大于0就循环(dowhile先做后循环)

        weight = Math.ceil(weight);   // 不足1kg按1kg算 校验通过后再取整
        
        if(weight <=1){
            costs = costFirstKg();
        } else if (weight<=5) {
            costs = costWithin5kg(weight);
        } else {
            costs = costOver5kg(weight);
        }

        System.out.println("运费为:" + costs);

    }

    // 不同价位的计算,单独定义一个方法

    // 首重1kg:10元
    static double costFirstKg(){  //低于1kg,什么都不用传入,运费=oneKg
        return oneKg;
    }

    // 超出1-5kg:每kg加2元;
    static double costWithin5kg(double weight){// 第1kg的部分
        return (weight - 1) * 2 + oneKg; // 算出超出的重量的价格,再加oneKg得出最终价格
    }

    //超出5kg以上:每kg加1.5元.
    static double costOver5kg(double weight){
        double cost = (5 - 1) * 2 + oneKg;  // 前5kg的部分
        cost = (weight - 5) * 1.5 + cost;  //超出的部分的价格 加上前5kg的价格
        return cost;
    }


}
