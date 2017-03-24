package IfHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/21.
 */
public class if_else_c_2 {
    public static void main(String[] args) {
        //对学员的结业考试成绩评测；
        //成绩>=90:优秀、 成绩>=80:良好、 成绩>=60:中等、 成绩<=60:差
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩");
        double x = input.nextDouble();
        if (x >= 90) {
            System.out.println("优秀");
        } else if (x >= 80) {
            System.out.println("良好");
        } else if (x >= 60) {
            System.out.println("中等");
        } else {
            System.out.println("差");
        }
    }
}

