package top.wzln.controllerloop;
/*
    break关键字:
        不能单独出现的,只能写在switch或者循环当中,表示结束 跳出的意思

        循环在idea的快速生成方式：fori
 */
public class BreakDemo1 {
    static void main(String[] args) {

//        int i = 1;
//        while(true){
//            i++;
//            if (i==100){
//                System.out.println(i);
//                break;
//            }
//        }

        for (int i = 1; i <= 100; i++) {
            if (i==15){
                break; //结束掉整个循环
            }
            System.out.println(i); // 1-14

        }
    }
}
