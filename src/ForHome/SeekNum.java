package ForHome;

/**
 * Created by Administrator on 2017/3/27.
 */
public class SeekNum {
    //输出  100 -- 999之间, 所有百位 + 十位 == 个位　的数
    public static void main(String[] args) {
        int x,y,z;//定义个位、十位、百位
        for (int num = 100;num<=999;num++) {
            x=num%10;
            y=(num/10)%10;
            z=(num/100)%10;
            if (y + z == x) {
                System.out.println(num);
            }

        }
    }
}
