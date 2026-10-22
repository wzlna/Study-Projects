package top.wzln.method13;

/*
    定义一个方法 求两数的和

    定义格式:
        public static 返回值类型 方法名(参数1,参数2........){
                    方法体;
                    return 返回值;
        }

    调用格式:
        方法名(参数1,参数2........)

    注意点:
        1.方法和方法之间是平级关系,不能互相嵌套,main也是方法
        2.方法是不会主动运行的,需要被调用才可以
        3.小括号中的参数需要一一对应(个数,类型)
 */
public class MethodDemo1 {

    //调用了getSum方法求两个整数的和
    static void main() {
        System.out.println(getSum(1, 2));
    }

    public static int getSum(int a, int b) {
        int c = a + b;
        return c;
    }

}
