import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/7.
 */
public class day01 {
    public static void main(String[] args) {
//数学
        int math;
        //C语言
        int c;
        //物理
        int phycal;
        //英语
        int english;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数学的成绩");
         math = input.nextInt();
        System.out.println("请输入c语言的成绩");
        c = input.nextInt();
        System.out.println("请输入英语的成绩");
        english = input.nextInt();
        System.out.println(math+c+english);
        if(math>c){
            System.out.println("数学跟c语言中成绩比较高的分数为"+"数学"+math);
        }else{
            System.out.println("数学跟c语言中成绩比较高的分数为"+"c语言"+c);
        }


    }
}
