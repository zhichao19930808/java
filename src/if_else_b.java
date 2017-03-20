import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/20.
 */
//根据用户输入的月份，打印出相应的季节。
//345春季 678 夏季 9 10 11秋季 12 1 2
public class if_else_b {
    //主函数
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入月份");
        byte x=input.nextByte();
        if (x > 12 || x < 1) {
            System.out.print("当前月份不存在");
        } else if (x >= 3 && x <= 5) {
            System.out.print(x+"月份是春季");
        } else if (x >= 6 && x <= 8) {
            System.out.print(x+"月份是夏季");
        } else if (x >= 9 && x <= 11) {
            System.out.print(x + "月份是秋季");
        } else {
            System.out.print(x+"月份是冬季");
        }
    }
}
