package SwitchHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/22.
 */
public class Switch_1 {
    public static void main(String[] args) {
//        韩嫣参加计算机编程大赛
//        如果获得第一名，将参加麻省理工大学组织的1个月夏令营
//        如果获得第二名，将奖励惠普笔记本电脑一部
//        如果获得第三名，将奖励移动硬盘一个
//        否则，参与奖，笔记本一本。
        Scanner input = new Scanner(System.in);
            System.out.println("请输入你的名次");
        int x = input.nextInt();
        switch (x) {
            // switch后面小括号中表达式的值必须是整型或字符型；
            // case后面的常量必须各不相同；
            // case的顺序可以打乱；
            // 在每个case后不要忘记写break；
            // 通常，default块会放在末尾，也可以省略不写。
            // default块顺序可以变动，系统执行时会跳过default先寻找 case。
            // 只有在所有的case都没有正确答案时，系统才会寻找default。
            // 当default在末尾时，default后的break可以省略不写；但当default不在末尾时，default后必须写break。
            case 1:
                System.out.println(" 恭喜你获得第一名，你将可以免费参加麻省理工大学组织的1个月夏令营");
                break;
            default:
                System.out.println("恭喜你获得第"+x+"名，你将获得笔记本一本");
                break;
            case 3:
                System.out.println("恭喜你获得第三名，你将获得移动硬盘一个");
                break;
            case  2:
                System.out.println("恭喜你获得第二名，你将获得惠普笔记本电脑一部");
                break;

        }
    }
}
