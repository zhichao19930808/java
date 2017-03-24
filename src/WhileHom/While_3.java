package WhileHom;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/22.
 */
public class While_3 {
//    利用条件运算符的嵌套来完成此题：
// 学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
//    程序分析：(a> b)?a:b这是条件运算符的基本例子。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        if (x >= 90) {
            System.out.println("A");
        } else if (x >= 60) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
}
}
