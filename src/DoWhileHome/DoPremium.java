package DoWhileHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/24.
 */
public class DoPremium {
    //在银行存款 每年的利率为0.003，计算5年后，获得的本金
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short x = 0;
        System.out.println("请输入存款金额");
        int money = input.nextInt();
        System.out.println("请输入存款期限（）年;");
        short old = input.nextShort();
        do {
            money+=(0.003*money);
            x++;
        }while (x>=old);
        System.out.println(old+"年后，获得本金"+money);
    }

}
