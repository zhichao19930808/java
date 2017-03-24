package WhileHom;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/22.
 */
public class While_1 {
//    为了帮助张浩尽快提高成绩，老师给他安排了每天的学习任务，
//    其中上午阅读教材，学习理论部分，下午上机编程，掌握代码部分。
//    老师每天检查学习成果。如果不合格，则继续进行
    public static void main(String[] args) {
        System.out.println("合格了吗？(Y/N)");
        Scanner input =new Scanner(System.in);
        String fruit =input.next();
        while (!"y".equals(fruit)) {
            System.out.println("上午阅读教材，学习理论部分");
            System.out.println("下午上机编程，掌握代码部分");
            System.out.println("合格了吗？(Y/N)");
            fruit = input.next();
        }
        System.out.println("完成任务！！！！");

}

}
