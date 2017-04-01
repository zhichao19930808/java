package OOP_Home;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/30.
 */
public class ShowName {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        CustomerBiz op=new CustomerBiz();
        for (int i=1;i<=4;i++) {
            System.out.print("请输入第"+i+"位客户的信息：");
            String o = id.next();
            op.name=o;
            System.out.println(op.addName(op.name));;//打印出op的行为，以及返回值。
            System.out.print("继续输入吗？（是/否）");
            char yes =id.next().charAt(0);
            if (yes == '是') {
                continue;
            } else {
                break;
            }
        }
        System.out.println("*****************************************************");
        System.out.println("客户姓名列表：");
        System.out.println("*****************************************************");
        op.Array();
    }

}
