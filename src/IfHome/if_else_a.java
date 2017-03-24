package IfHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/19.
 */
//根据用户定义的数值不同。打印相应的星期英文。
public class if_else_a {
    //主函数
    public static void main(String[] args) {//主函数。main函数可以保证该类的独立运行，是程序的入口，会被java虚拟机所调用。
                                            //public 公开的；static 静态的；void 空的；main 主要的
        Scanner input=new Scanner(System.in);//scanner 扫描;input 输入;
        //输出语句
        System.out.print("请输入数值");//输出语句。可以打印小括号中的内容。
                                        // System 系统; out 出 ;print打印；
        int x=input.nextInt();
        if (x < 0 || x > 7) {
            System.out.print("请输入1~7以内的整数");
        }else if (x == 1) {
            System.out.print("星期一");
        } else if (x==2) {
            System.out.print("星期二");
        } else if (x==3) {
            System.out.print("星期三");
        } else if (x == 4) {
            System.out.print("星期四");
        } else if (x == 5) {
            System.out.print("星期五");
        } else if (x == 6) {
            System.out.print("星期六");
        } else
            System.out.print("星期日");
    }
}
