import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/1.
 * 1. 从键盘上输入 4 行 4 列的一个实数矩阵到一个二维数组中,
 * 然后求出主对角线（从左上角到右下角）上元素之和以及副对角线上元素之乘积。（20 分）
 */
public class Exam_1 {
   public static void main(String[] args) {
//       double a[][]=new double[4][];
//       Scanner input=new Scanner(System.in);
//       for (int i=0;i<4;i++) {
//           for (int j=0;j<4;j++) {
//               System.out.println("请为第"+(i+1)+"组数组的第"+(j+1)+"个数赋值");
//          double one = input.nextDouble();
//               a[i][j]=one;
//           }
//       }
//       System.out.println(Arrays.toString(a));
       //首先输入4组数组，每组4个单位。
       double a[]= new double[4];
       double b[]= new double[4];
       double c[]= new double[4];
       double d[]= new double[4];
      // 为数组内的数赋值
       Scanner input =new Scanner(System.in);
       System.out.println("********************************************************");
       for (int i=0;i<4;i++) {
           System.out.println("请为第一组数组的第"+(i+1)+"个数赋值");
           double one = input.nextDouble();
           a[i] = one;
       }
       System.out.println("********************************************************");
       for (int i=0;i<4;i++) {
           System.out.println("请为第二组数组的第"+(i+1)+"个数赋值");
           double one = input.nextDouble();
           b[i] = one;
       }
       System.out.println("********************************************************");
       for (int i=0;i<4;i++) {
               System.out.println("请为第三组数组的第"+(i+1)+"个数赋值");
               double one = input.nextDouble();
              c[i] = one;
       }
       System.out.println("********************************************************");
       for (int i=0;i<4;i++) {
           System.out.println("请为第四组数组的第"+(i+1)+"个数赋值");
           double one = input.nextDouble();
           d[i] = one;
       }
       System.out.println("********************************************************");
       System.out.println(Arrays.toString(a));
       System.out.println(Arrays.toString(b));
       System.out.println(Arrays.toString(c));
       System.out.println(Arrays.toString(d));
       //求出主对角线（从左上角到右下角）上元素之和
       double x=a[0]+b[1]+c[2]+d[3];
       System.out.println("主对角线（从左上角到右下角）上元素之和为"+x);
       //求出副对角线上元素之乘积
       double y=a[3]*b[2]*c[1]*d[0];
       System.out.println("副对角线上元素之乘积为"+y);
   }
}
