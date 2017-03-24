package IfHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/9.
 */
public class day02a {
    public static void main(String[] args) {
//        输入三角形的三边长a,b,c（正数）。
//        能构成三角形，输出面积，
//        不能构成三角形，输出“不构成三角形”
        //输入边长a,b,c
        Scanner input=new Scanner(System.in);

        //输入a
        System.out.println("请输入a");
        Double a=input.nextDouble();

        //输入b
        System.out.println("请输入b");
        Double b=input.nextDouble();

        //输入c
        System.out.println("请输入c");
        Double c=input.nextDouble();
        //开始计算 公式  如果a+b>c且a-c<c则三角形成立
        if (a + b > c && a - b < c) {
            System.out.println("此三角形成立");
            //成立  球面积   海伦公式
            Double p=(a+b+c)/2;
            Double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            //Math.sqart   用于开根号的一个类
            System.out.print("面积为："+area);
        } else {
            System.out.print("此三角形不成立");
        }

    }
}
