import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/9.
 */
public class Day01c {
    public static void main(String[] args) {
        //输入abc
        Scanner input = new Scanner(System.in);
        //请输入a
        System.out.println("请输入a");
        Double a = input.nextDouble();
        if (a!=0){
        //请输入b
        System.out.println("请输入b");
        Double b = input.nextDouble();
        //请输入c
        System.out.println("请输入c");
        Double c = input.nextDouble();

        //开始计算  公式   Double 类型 u=b*b-4*a*c
        //首先对a进行判断，如果a!=0则：如果u<0 则无实数根  如果u=0,一个实数根  如果u>0,则两个实数根
        //如果a==0 则方程式无意义

            Double u = b*b-4*a*c;
            if(u<0){
                System.out.println("则无实数根");
            }else if (u==0){
                System.out.println("一个实数根");
            }else if (u>0){
                System.out.println("则两个实数根");
            }
        }else{
            System.out.println("方程式无意义");
        }
    }
}
