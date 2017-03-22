/**
 * Created by Administrator on 2017/3/22.
 */
public class While_2 {
//    打印出所有的 "水仙花数 "，
// 所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身
// 。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
    public static void main(String[] args) {
        int a = 100;
        while (a < 1000) {
            //个位数
            int x =a%10;
            //十位数
            int y =(a/10)%10;
            //百位数
            int z =a/100;
            if (x * x * x + y * y * y + z * z * z == a) {
                System.out.println(a);
            }
            a++;
        }

}
}
