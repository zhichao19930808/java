package DoWhileHome;

/**
 * Created by Administrator on 2017/3/24.
 */
public class Do_100jian5 {
    //输出 从100每次递减5的值，直至输出到5
    public static void main(String[] args) {
        int a=100;
        do {
            a-=5;
            System.out.println(a);
        }while (a>5);

    }
}
