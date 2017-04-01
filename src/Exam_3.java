import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/1.
 */
public class Exam_3 {
    public static void main(String[] args) {


    //定义一个方法，实现数组的转置输出
    //例如： 源数组，1 2 3 4 5 6 转置之后的数组，6 5 4 3 2 1
    //首先要自定义一组数组并为其赋值
    int[]a= new int[5];
    Scanner input =new Scanner(System.in);
    for (int i=0;i<5;i++) {
        System.out.println("请输入第个"+(i+1)+"数字");
        int x = input.nextInt();
        a[i] = x;
    }
        System.out.println("数组为："+ Arrays.toString(a));
        //将数组转置
        for (int i =0;i<=a.length/2;i++) {
            int temp;
            temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        System.out.println("转置结果为："+ Arrays.toString(a));
    }
}
