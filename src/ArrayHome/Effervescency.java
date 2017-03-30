package ArrayHome;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/3/30.
 */
public class Effervescency {
    public static void main(String[] args) {
        //创建数组
        int array[] ={2,3,6,1,7,4,};
        for (int i=0;i<array.length-1;i++) {
            for (int j=0;j<array.length-1-i;j++) {
                if (array[j] >array[j + 1]) {
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
