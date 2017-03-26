package BreakHome;

/**
 * Created by Administrator on 2017/3/26.
 */
public class SeekTotal {
    //seek 求  total 总数
    //1~10之间的整数相加，得到的累加值大于20后结束循环，且输出此累加值
    //定义总数变量total，使rotal=0；
    //定义整数变量x，使x=1;
    //开始循环，并判断total的值，如果total的值大于20则结束循环，并输出total的值
    public static void main(String[] args) {
        int total = 0;
        for (int x=1;x<=10;x++) {
            total+=x;
            if (total > 20) {
                break;
            }
        }
        System.out.println("累加值是"+total);
    }
}
