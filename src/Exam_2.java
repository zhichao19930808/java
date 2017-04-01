import java.util.Arrays;

/**
 * Created by Administrator on 2017/4/1.
 * 将如下两个数组中重复的元素存入一个新的数组（20 分）
 *[89,90,77,87,66,54,328,890,99]
 *[65,72,12,77,2,96,54,27,89]
 */
public class Exam_2 {
    public static void main(String[] args) {
        //首先将这三组数组定义出来
        int a[]={89,90,77,87,66,54,328,890,99};
        int b[]={65,72,12,77,2,96,54,27,89};
        int c[]=new int[9];
        int q =0;
        //利用for循环来寻找重复的元素。
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                if (a[i] == b[j]) {
                    c[q]=a[i];
                    q++;
                }
            }
        }
        System.out.println("新的数组为"+ Arrays.toString(c));
    }

}
