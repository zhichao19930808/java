import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25.
 */
public class KaoShi_03 {
    //求 1！+2！+3！+4！+5！的和
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a;
        int c = 0;
        int x = 1;
        do {
            a*=1;
            x++;
            c+=a;
        }while (x<b);
        System.out.println(c);
    }
}
