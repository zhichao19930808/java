package ContinueHome;

/**
 * Created by Administrator on 2017/3/27.
 */
public class Input_1to99AdjacentNum {
    //adjacent 相邻
    //输出 10 - 99 之间所有“相邻”的值,如: 23, 54, 98
    public static void main(String[] args) {
        for (int i =10;i>=10&&i<=99;i++) {
            int x = i/10;//十位
            int y = i%10;//个位
            if (x - 1 == y) {
                System.out.println(i);
            } else if (x + 1 == y) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }

}
