package SwitchHome;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/22.
 */
public class Switch_2 {
    //张三为他的手机设定了自动拨号
//    按1：拨爸爸的号
//    按2：拨妈妈的号
//    按3：拨爷爷的号
//    按4：拨奶奶的号
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //手机上只有1~10，,10个数字键，byte的取值范围是（-128~127），因此，此处使用byte；
        byte x = input.nextByte();
        switch (x) {
            case 1 :
                System.out.println("正在呼叫爸爸....");
                break;
            case 2 :
                 System.out.println("正在呼叫妈妈....");
                 break;
            case 3 :
                 System.out.println("正在呼叫爷爷....");
                 break;
            case 4 :
                 System.out.println("正在呼叫奶奶....");
                 break;
            default:
                System.out.println("还没有设置"+x+"的联系人");
                break;
        }
    }
}
