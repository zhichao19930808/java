package ContinueHome;

/**
 * Created by Administrator on 2017/3/26.
 */
public class Input_1 {
    //输出 1 － 100之间能被5整除，但不能被3或8整除的值
    public static void main(String[] args) {
        for (int x = 1;x<=100;x++){
            if (x % 5 != 0) {
                continue;
            } else if (x % 3 == 0) {
                continue;
            } else if (x % 8 == 0) {
                continue;
            } else {
                System.out.println(x);
            }
        }
    }

}
