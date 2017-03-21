/**
 * Created by Administrator on 2017/3/21.
 */
//算术运算
public class Arithmetic_01 {
    public static void main(String[] args) {
       // 根据天数（46）计算周数和剩余的天数；
        //使用int类型的除法计算出周数；
        int x = 46;
        //使用模运算计算出剩余的天数。
        int zhou = 7;
        int zhoushu =  x / zhou;
        int shengyutianshu = x % zhou;
        System.out.println("周数是："+zhoushu);
        System.out.println("剩余的天数是："+shengyutianshu );
        //已知圆的半径radius=1.5,求其面积。
        //面积公式：π乘以半径的平方
        double q = 3.1415926;
        double radius = 1.5;
        double area =q*radius*radius;
        System.out.println("面积为："+area);
    }

}
