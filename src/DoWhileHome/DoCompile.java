package DoWhileHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/24.
 */
public class DoCompile {
    public static void main(String[] args) {
        // decision[判断]  是否重写
        boolean decision;
        do {
            System.out.println("上机编写程序\n" +
                    "合格了吗？ y/n");
            Scanner compile = new Scanner(System.in);
            char input = compile.next().charAt(0);
            if (input == 'y') {
                //输入y，编写合格，不用继续编写
                decision = false;
            } else {
                //否则，没有编写合格，继续重新编写
                decision = true;
            }
        }while (decision);
    }
}
