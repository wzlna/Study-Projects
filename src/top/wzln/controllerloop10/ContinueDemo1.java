package top.wzln.controllerloop10;

public class ContinueDemo1 {
    static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if (i==5){
                continue;  // 结束这次循环 进行下个循环
            }
            System.out.println(i);
        }
    }
}
