package ForHome;

/**
 * Created by Administrator on 2017/3/26.
 */
public class SeekSum {
    //seek 求 sum 总数
    //求1~100之间不能被3整除的数之和
    //定义总数变量sum。
    //首先定义最小的变量，赋值为1，并使其递增；
    //如果x%3==0则计算sun+=x，否则直接输出。
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 1;x<=100;x++) {
            if (x % 3 != 0) {
                sum+=x;
            }
        }
        System.out.println(sum);
    }

}
