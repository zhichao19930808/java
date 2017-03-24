package IfHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/9.
 */
public class day02b {
    public static void main(String[] args) {
//        5：电话费用（免费接电）
//        某电话公司电话收费有三个套餐
//①月租50元包100分，超出100分，1元/分，200元封顶
//②月租50元包100分，超出100分，0.85/分，不封顶
//③无月租，0.75/分，不封顶
//        根据所输入的通话分数，给出推荐的套餐
        //首先计算无月租切话费最便宜的c套餐，然后计算话费相对便宜的b套餐最后计算200元封顶的a套餐。
        //输入通话分数x
        Scanner input=new Scanner(System.in);
        System.out.print("请输入通话分钟数");
        int x=input.nextInt();
        if (x*0.75 <50) {
            System.out.print("推荐c套餐");
        } else if (50+(x-100)*0.85<200) {
            System.out.print("推荐b套餐");
        } else {
            System.out.print("推荐使用a套餐");
        }

    }
}
