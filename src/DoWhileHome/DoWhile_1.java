package DoWhileHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/23.
 */
//如果用户输入错误，可以重复输入直到输入正确，执行相应的操作后退出循环
public class DoWhile_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short x;

            System.out.print("欢迎使用MYShopping管理系统\n\n************************************************************\n" +
                    "                      1、客户信息管理\n" +
                    "                      2、购物结算\n" +
                    "                      3、真情回馈\n" +
                    "                      4、注销\n" +
                    "******************************************************************\n\n" +
                    "请选择输入数字:");
            x = input.nextShort();
        do {
            switch (x) {
                case 1:
                    System.out.print("执行客户信息管理:");
                    break;
                case 2:
                    System.out.print("执行购物结算:");
                    break;
                case 3:
                    System.out.print("执行真情回馈:");
                    break;
                case 4:
                    System.out.print("执行注销:");
                    break;
                default:
                    System.out.print("输入错误请重新输入数字:");
                    x = input.nextShort();
                    break;
            }

        } while (x > 4);
        switch (x) {
            case 1:
                System.out.println("执行客户信息管理\n");
                break;
            case 2:
                System.out.println("执行购物结算\n");
                break;
            case 3:
                System.out.println("执行真情回馈\n");
                break;
            case 4:
                System.out.println("执行注销\n");
                break;
        }
        System.out.println("程序结束");
        input.close();
    }
}