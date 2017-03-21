import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/21.
 */
public class if_else_b_4 {
    public static void main(String[] args) {
        //设定个数变量（number）用来保存奶奶买的坏鸡蛋数量，如果鸡蛋数量小于5个的话就输出“忍了”，否则输出“退货”。
        Scanner input =new Scanner(System.in);
        System.out.println("请输入坏鸡蛋的数量");
        int number = input.nextInt();
        if (number <5) {
            System.out.println("忍了");
        } else {
            System.out.println("退货");
        }
    }
}
