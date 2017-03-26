package ForHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/26.
 */
public class InvestigationOld {
    //investigation 调查 old 年龄
    //商场对顾客的年龄层次进行调查，计算各层次的顾客比例
    //首先输入每位顾客的年龄
    //定义不满30岁的顾客的数量y；定义满30岁顾客的数量z；定义输入的次数x；假设有10位顾客。
    //如果是30岁以下的就使y+=1;否则z+=1;
    public static void main(String[] args) {
    double y = 0;
    double z = 0;
    for (int x = 1;x<=4;x++) {
        System.out.printf("请输入第"+x+"位顾客的年龄");
        Scanner input = new Scanner(System.in);
        int old = input.nextInt();
        if (old < 30) {
            y++;
        } else {
            z++;
        }
    }
        System.out.println("30岁以下的比例是"+y/4*100+"%");
        System.out.println("30岁以上的比例是"+z/4*100+"%");

    }
}

