import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/23.
 */
public class While_7 {
    //    循环输入商品编号和购买数量
//    当输入n时结账
    public static void main(String[] args) {
        char shopping = 'y';//是否继续循环
        char q; //是否确认购买
        int y=0;//消费金额
        Scanner input = new Scanner(System.in);
        while (shopping == 'y') {
            System.out.println("1、T恤\t2、网球鞋\t3、网球拍\n请输入商品编号来选择您要购买的商品");
            short num = input.nextShort();
            int x = 0;//购买数量
            switch (num) {
                case 1:
                    do {

                    System.out.println("T恤 256元");
                    System.out.println("请输入您要购买的数量");
                    x = input.nextInt();

                    System.out.println("本次选择了"+x+"件商品，共计"+x*256+"元，是否确认购买（请输入是或否）");
                    q = input.next().charAt(0);
                    } while (q=='否');
                    y =y + x*256;
                    break;
                case 2:
                    do {
                    System.out.println("网球鞋 577元");
                    System.out.println("请输入您要购买的数量");
                    x = input.nextInt();
                    System.out.println("本次选择了"+x+"件商品，共计"+x*577+"元，是否确认购买（请输入是或否）");
                    q = input.next().charAt(0);
                     } while (q=='否');
                    y+=x*577;
                    break;
                case 3:
                    do {
                    System.out.println("网球拍 1000元");
                    System.out.println("请输入您要购买的数量");
                    x = input.nextInt();
                    System.out.println("本次选择了"+x+"件商品，共计"+x*1000+"元，是否确认购买（请输入是或否）");
                    q = input.next().charAt(0);
                     } while (q=='否');
                    y +=x*1000;
                    break;
                default:
                    System.out.println("请输入正确的编号");
            }
            System.out.println("您已消费"+y+"元是否继续购买？（请输入“y”或“n”）");
            shopping = input.next().charAt(0);
        }
        System.out.println("您本次消费"+y+"元\n" +
                "您享受0.8折优惠应付金额为"+(0.8*y)+"元，请输入您付款的金额");
        int w = input.nextInt();
        System.out.println("您本次消费"+y+"元\n打折后应付金额为"+(0.8*y)+"元\n收您"+w+"元\n找零"+(w-(0.8*y)));

    }
}
