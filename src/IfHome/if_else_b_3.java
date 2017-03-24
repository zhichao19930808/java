package IfHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/21.
 */
public class if_else_b_3 {
    public static void main(String[] args) {
        //设定年龄和性别变量（age和sex），如果年龄够7岁或年龄够5岁并且是 男，就可以搬动桌子。
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年龄");
        short age =input.nextShort();
        System.out.println("请输入性别");
        char sex = input.next().charAt(0);
        if (age >= 7 || (age >= 5 && sex == '男')) {
            System.out.println("可以搬桌子");
        } else {
            System.out.println("不可以搬桌子");
        }


    }
}
