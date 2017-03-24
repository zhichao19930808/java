package DoWhileHome;

/**
 * Created by Administrator on 2017/3/24.
 */
public class Do1000 {
    //计算1000之内能被7整除的数之和
    public static void main(String[] args) {
        //整数
        int x=0;
        //整数之和
        int y=0;
        do {
            x+=7;
            y+=x;
        }while (x<1000);
        System.out.println("1000之内能被7整除的数之和是"+(y-x));
        System.out.println("1000之内能被7整除的最大数是"+(x-7));
    }
}
