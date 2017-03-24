package IfHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/21.
 */
public class if_else_b_6 {
    public static void main(String[] args) {
        //从键盘分别输入两个数，保存在a和b变量中。如果a能被b整除或a加b大于100，则输出a，否则输出b
        Scanner input =new Scanner(System.in);
        System.out.println("请输入a的值");
        int a = input.nextInt();
        System.out.println("请输入b的值");
        int b = input.nextInt();
        if (a % b == 0 || a + b > 100) {
            System.out.println(a);
        } else {
            System.out.println(b);
            System.out.println("余数是"+a % b);
        }
    }
}
