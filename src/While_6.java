import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/23.
 */
public class While_6 {
    //循环输入商品编号，显示对应的商品价格
//    输入“n”结束循环
    public static void main(String[] args) {
        char flage = 'y';
        Scanner input = new Scanner(System.in);
        while (flage == 'y') {
            System.out.println("1、T恤\t2、网球鞋\t3、网球拍");
            System.out.println("请输入商品编号");
            short num = input.nextShort();
            switch (num) {
                case 1:
                    System.out.println("T恤 256元");
                    break;
                case 2:
                    System.out.println("网球鞋 577元");
                    break;
                case 3:
                    System.out.println("网球拍 1000元");
                    break;
                default:
                    System.out.println("请输入正确的编号");
            }
            System.out.println("是否继续查询？（请输入“y”或“n”）");
             flage = input.next().charAt(0);
        }
        input.close();
        System.out.println("谢谢您的惠顾，欢迎下次光临");
    }
}