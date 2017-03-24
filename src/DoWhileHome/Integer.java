package DoWhileHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/24.
 */
public class Integer {
    //从键盘上输入任意一个整数，输出这个整数是几位数
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //输入的整数
         long y = input.nextLong();
        //几位？
        int x = 0;
        //牺牲品
        double z ;
        double q=1;
        do {
            q*=10;
           z=y/q;
           x++;

        } while (z>=1);
        System.out.println("z是"+z+"");
        System.out.println("这个整数是"+x+"位数");
        input.close();
    }
}
