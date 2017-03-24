package IfHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/21.
 */
public class if_else_b_5 {
    public static void main(String[] args) {
        //从键盘输入一个整数，判断是否能被3或5整除，能 输出“该数字是3或5的倍数”，否则输出“该数不能被3或5中的任何一个数整除”
        Scanner input = new Scanner(System.in);
        System.out.println("请输出一个整数");
        int x = input.nextInt();
        if (x % 3 == 0 || x % 5 == 0) {
            System.out.println("该数字是3或5的倍数");
        } else {
            System.out.println("该数不能被3或5中的任何一个数整除");
        }
    }
}
