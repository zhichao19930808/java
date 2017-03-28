/**
 * Created by Administrator on 2017/3/28.
 */
public class ArrayText_a {
    //array 数组
    public static void main(String[] args) {
        //	有如下规律的一组数字，求该组数字的第37位。
      //  1	 1 	    2	    3	    5
      //  8	 13   21	    34	    55
        int[] array = new  int[37];
        array[0] = 1;//第一个数；
        array[1] = 1;//第二个数；
        for ( int num = 2;num<37;num++) {
            //第三个数等于第一个数加上第二个数
            array[num] = array[num-1]+array[num-2];
        }
        System.out.println(array[36]);
    }
}
