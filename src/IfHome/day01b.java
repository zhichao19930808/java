package IfHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/7.
 */
public class day01b {
    public static void main(String[] args) {
        double x;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入x的值");
        x=input.nextDouble();
        if (x >=1||x <= -1) {
            System.out.println("y的值是0");
        } else if (x >= 0&&x<1) {
            System.out.println("y的值是"+(1-x));
        } else if (x < 0&&x>-1) {
            System.out.println("y的值是"+(x+1));
        }
    }
}
