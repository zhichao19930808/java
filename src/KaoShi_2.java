import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25.
 */
public class KaoShi_2 {
    //一球从100米高度落下，每次落地后反跳回原高度的一半，再落下，求它在第10次的时候，反跳高度多少，反弹的高度共经过多少米？
    public static void main(String[] args) {
        double x = 100.0;
        double y = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入弹跳的次数");
        int a =input.nextInt();
        do {
            x/=2;
            a--;
            y+=x;
        }while (a>0);
        System.out.println("最后一次反跳高度为"+x+"米");
        System.out.println("反跳高度共经过为"+y+"米");
    }
}
