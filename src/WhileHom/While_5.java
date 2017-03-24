package WhileHom;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/23.
 */
//计算100以内（包括100）的偶数之和
public class While_5 {
   public static void main(String[] args) {
       //偶数
        short num =0;
       //偶数和
       short sum =0 ;
       while (num <= 100) {
           sum+=num;//sum=sun+num
           num+=2;
       }
       System.out.println(sum);
    }
}
