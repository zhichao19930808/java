package DoWhileHome;

/**
 * Created by Administrator on 2017/3/24.
 */
public class DoMultiply7 {
    //计算1至50中是7的倍数的数值之和
    public static void main(String[] args) {
        //整数
        int x = 0;
        //整数之和
        int y = 0;
        do {
            y += x;
            x += 7;
        } while (x < 50);
        System.out.println(y);
    }
}
