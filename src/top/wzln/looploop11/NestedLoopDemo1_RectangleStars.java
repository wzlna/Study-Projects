package top.wzln.looploop11;
/*
    打印四行五列的*

    *****
    *****
    *****
    *****
    *****

    限定：每次只能输出1个*
 */
public class NestedLoopDemo1_RectangleStars {
    static void main(String[] args) {


        for (int a =0 ; a<4;a++){  //把一行打印5个星的事情 重复执行4次

            for (int i =0 ; i<5;i++){
                System.out.print("*"); //打印5个
            }


            System.out.println("");  //然后换行
        }



    }
}
