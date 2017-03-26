package ForHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/26.
 */
public class Average {
    //average 平均；score 成绩
    //循环输入某同学结业考试的5门课成绩，并计算平均分
    public static void main(String[] args) {
        //首先要分别输出5次成绩，用x来表示次数；
        //然后计算出输入成绩的和；
        //最后求出平均值。
        double y = 0;//定义总分
        double average = 0;//定义平均分
        for (int x = 1 ;x<=5 ; x++) {
            System.out.println("请输入第"+x+"门课的成绩");
            Scanner input = new Scanner(System.in);
            double score = input.nextDouble();
            y+=score;
        }
        average=y / 5;
        System.out.println(average);
    }
}
