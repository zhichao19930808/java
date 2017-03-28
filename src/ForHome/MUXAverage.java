package ForHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/28.
 */
public class MUXAverage {
    //squad 班
    public static void main(String[] args) {
    //某次程序大赛，A74110班有4名学员参加，学员的成绩由用户输入，计算该班参赛学员的平均分
        Scanner input = new Scanner(System.in);
//        double a =0;
//        for (int i =1;i<=4;i++) {
//            System.out.println("请输入第"+i+"位同学的成绩");
//            double x = input.nextDouble();
//            a+=x;
//        }
//        System.out.println("平均分数为："+a/4);

    //某次程序大赛，A74110班有4名学员参加，学员的成绩由用户输入，计算该班参赛学员的平均分，3个班级各4名学员参赛，计算每个班级参赛学员的平均分
        for (int squad = 1;squad<=3;squad++ ) {
            if (squad == 1) {
                double squad1 = 0 ;
                for (int i =1;i<=4;i++) {
                    System.out.println("请输入第一个班第"+i+"位同学的成绩");
                    double x = input.nextDouble();
                    squad1+=x;
                }
                System.out.println("第"+squad+"个班的平均分是："+squad1/4);
            } else if (squad == 2) {
                double squad2 = 0;
                for (int i = 1; i <= 4; i++) {
                    System.out.println("请输入第二个班第" + i + "位同学的成绩");
                    double x = input.nextDouble();
                    squad2 += x;
                }
                System.out.println("第" + squad + "个班的平均分是：" + squad2/4);
            } else {
            double squad3 = 0 ;
            for (int i =1;i<=4;i++) {
                System.out.println("请输入第三个班第" + i + "位同学的成绩");
                double x = input.nextDouble();
                squad3 += x;
            }
                System.out.println("第"+squad+"个班的平均分是："+squad3/4);
            }
        }
    }
}
