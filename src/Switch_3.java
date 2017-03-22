import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/22.
 */
public class Switch_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入消费金额
        System.out.println("请输入您的消费金额");
        int x = input.nextInt();
        if (x < 50) {
            System.out.println("您消费的金额不足，无法参加本次活动");
        }
        else if (x >= 50 && x < 100) {
            System.out.println("您满足参加本次优惠换购活动的条件\n" +
                    "请输入1\n" +
                    "参加“加2元换购百事可乐饮料一瓶的活动”\n" +
                    "如果您不参加本次活动可输入“0”直接结算");
            int y;
            Scanner a = new Scanner(System.in);
            int q = a.nextInt();
            switch (q) {
                case 1:
                    System.out.println("您参加了加2元换购百事可乐饮料一瓶的活动；");
                    y=2;
                    System.out.println("您本次共计消费" + (x+y) + "元,欢迎下次光临。");
                    break;
                case 0:
                    System.out.println("您没有参加本次优惠活动");
                    y=0;
                    System.out.println("您本次共计消费" + (x+y) + "元,欢迎下次光临。");
                    break;
                default:
                    System.out.println("请输入正确的选项");
            }
        }
        else if (x >= 100 && x < 200) {
            System.out.println("您满足参加本次优惠换购活动的条件\n" +
                    "请输入1\n" +
                    "参加“加2元换购百事可乐饮料一瓶的活动”\n" +
                    "输入2\n" +
                    "参加“加3元换购500ml可乐一瓶的活动”\n" +
                    "输入3\n" +
                    "参加“加了加10元换购5斤面粉的活动”\n" +
                    "如果您不参加本次活动可输入“0”直接结算");
            int y;
            Scanner a = new Scanner(System.in);
            int q = a.nextInt();
            switch (q) {
                case 1:
                    System.out.println("您参加了加2元换购百事可乐饮料一瓶的活动；");
                    y=2;
                    System.out.println("您本次共计消费" + (x+y) + "元,欢迎下次光临。");
                    break;
                case 2:
                    System.out.println("您参加了加3元换购500ml可乐一瓶的活动；");
                    y=3;
                    System.out.println("您本次共计消费" + (x+y) + "元,欢迎下次光临。");
                    break;
                case 3:
                    System.out.println("您参加了加10元换购5斤面粉的活动；");
                    y=10;
                    System.out.println("您本次共计消费" + (x+y) + "元,欢迎下次光临。");
                    break;
                case 0:
                    System.out.println("您没有参加本次优惠活动");
                    y=0;
                    System.out.println("您本次共计消费" + (x+y) + "元,欢迎下次光临。");
                    break;
                default:
                    System.out.println("请输入正确的选项");
            }
        }
        else if (x >= 200) {
            System.out.println("您满足参加本次优惠换购活动的条件\n" +
                    "请输入1\n" +
                    "参加“加2元换购百事可乐饮料一瓶的活动”\n" +
                    "输入2\n" +
                    "参加“加3元换购500ml可乐一瓶的活动”\n" +
                    "输入3\n" +
                    "参加“加了加10元换购5斤面粉的活动”\n" +
                    "输入4\n" +
                    "参加“加10元换购一个苏泊尔炒菜锅的活动”\n" +
                    "输入5\n" +
                    "参加“加20元换购欧莱雅爽肤水一瓶的活动”\n" +
                    "如果您不参加本次活动可输入“0”");
            int y;
            Scanner a = new Scanner(System.in);
            int q = a.nextInt();
            switch (q) {
                case 1:
                    System.out.println("您参加了加2元换购百事可乐饮料一瓶的活动.");
                    y=2;
                    System.out.println("您本次共计消费" + (x+y) + "元,欢迎下次光临。");
                    break;
                case 2:
                    System.out.println("您参加了加3元换购500ml可乐一瓶的活动；");
                    y=3;
                    System.out.println("您本次共计消费" + (x+y) + "元,欢迎下次光临。");
                    break;
                case 3:
                    System.out.println("您参加了加10元换购5斤面粉的活动；");
                    y=10;
                    System.out.println("您本次共计消费" + (x+y) + "元,欢迎下次光临。");
                    break;
                case 4:
                    System.out.println("您参加了加10元换购一个苏泊尔炒菜锅的活动；");
                    y=10;
                    System.out.println("您本次共计消费" + (x+y) + "元,欢迎下次光临。");
                    break;
                case 5:
                    System.out.println("您参加了加20元换购欧莱雅爽肤水一瓶的活动；");
                    y=20;
                    System.out.println("您本次共计消费" + (x+y) + "元,欢迎下次光临。");
                    break;
                case 0:
                    System.out.println("您没有参加本次活动；");
                    y=0;
                    System.out.println("您本次共计消费" + (x+y) + "元,欢迎下次光临。");
                    break;
                default:
                    System.out.println("请输入正确的选项");
            }
        }
    }
}