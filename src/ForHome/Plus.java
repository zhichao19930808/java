package ForHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/27.
 */
public class Plus {
    //plus 加；
    //根据输入的数字写出加法表；
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字：");
        int a = input.nextInt();
        for (int b =0;b<=a;b++) {
            System.out.println(b+"+"+(a-b)+"="+a);
        }
    }
}
