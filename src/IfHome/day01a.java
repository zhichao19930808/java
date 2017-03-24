package IfHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/7.
 */
public class day01a {
    public static void main(String[] args) {
        //数学
        int math;
        //c语言
        int c;
        //物理
        int physical;
        //英语
        int english;
        Scanner intup=new Scanner(System.in);
        System.out.println("请输入数学的成绩");
        math=intup.nextInt();
        System.out.println("请输入c语言的成绩");
        c=intup.nextInt();
        System.out.println("请输入物理的成绩");
        physical=intup.nextInt();
        System.out.println("请输入英语的成绩");
        english=intup.nextInt();
        System.out.println("平均值为"+(math+c+physical+english)/4);
        if (math > c && math > physical && math > english) {
            System.out.print("最高成绩为数学"+math);
        } else if (c > math && c > physical && c > english) {
            System.out.print("最高成绩为C语言"+c);
        } else if (physical > math && physical > c && physical > english) {
            System.out.print("最高成绩为物理" + physical);
        } else {
            System.out.print("最高成绩为英语"+english);
        }
    }
}
