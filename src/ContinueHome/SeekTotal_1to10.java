package ContinueHome;

/**
 * Created by Administrator on 2017/3/26.
 */
public class SeekTotal_1to10 {
    //continue  继续；连续；维持；持续
    //continue 只能用在循环里；作用：跳过循环中剩余的语句而执行下一个循环。
   //seek 求 total 总数
   //求1~10之间的所有偶数和
   public static void main(String[] args) {
       int total = 0;
       for (int x = 1;x<=10;x++) {
           if (x % 2 != 0) {
               continue;//跳过
           }
               total+=x;
       }
       System.out.println("1~10之间所有偶数的和是"+total);
   }
}
