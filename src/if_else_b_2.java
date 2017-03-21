import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/21.
 */
public class if_else_b_2 {
    //用户输入两个数a，b。
    //如果a能够被b整除 或 a加b大于1000，则输出a；否则输出b。
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入a的值");
        int a = input.nextInt();
        System.out.println("请输入b的值");
        int b = input.nextInt();
        if (a % b == 0 || a + b > 10000) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
