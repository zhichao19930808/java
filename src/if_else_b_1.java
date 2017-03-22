import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/21.
 */
public class if_else_b_1 {
    //如果java成绩大于98，老师就奖励给一个mp4
    public static void main(String[] args) {
//        int java_score =97;
//        if (java_score > 98) {
//            System.out.println("老师说：不错老师给你一个MP4");
//        }
        //如果java成绩大于98并且music成绩大于80，老师奖励他；或者Java成绩等于100分，音乐成绩大于70分，老师也奖励他
        Scanner input =new Scanner(System.in);
        System.out.println("请输入java成绩");
        double java_score =input.nextDouble();
        System.out.println("请输入music成绩");
        double music_score =input.nextDouble();
        if ((java_score > 100 || java_score < 0) || (music_score > 100 || music_score < 0)) {
            System.out.println("请输入正确的成绩");
        }else if ((java_score > 98 && music_score > 80) || (java_score == 100 & music_score > 70)) {
            System.out.println("考的不错，老师给你一个MP4");
        } else {
            System.out.println("没有奖励");
        }
    }
}
