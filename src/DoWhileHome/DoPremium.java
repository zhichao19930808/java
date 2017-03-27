package DoWhileHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/24.
 */
public class DoPremium {
    //premium 额外费用；奖金；保险费
    //在银行存款 每年的利率为0.003，计算5年后，获得的本金
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //第x年
        byte x = 1;
        System.out.println("请您输入存款金额");
        double money = input.nextDouble();
        System.out.println("请您输入存款期限（）年;");
        byte old = input.nextByte();
        do {
            money+=(0.003*money);
            x++;
        }while (x<=old);
        System.out.println(old+"年后，获得本金"+money);
    }

}
