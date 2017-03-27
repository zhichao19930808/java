import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25.
 */
public class Exam_3_25a {
    //求s=a+aa+aaa+aaaa+...的值，比如求 s=2+22+222+2222+...的值?
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        long s=0;
        do {
            s+=a;
            a/=10;
        }while (a>=1);
        System.out.println(s);
        input.close();
    }
}
