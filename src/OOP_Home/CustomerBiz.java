package OOP_Home;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/3/30.
 * 需求说明：
 *创建客户业务类，实现客户姓名的添加和显示
 *实现思路：
 *创建CustomerBiz类
 *创建带参方法addName()
 *创建方法showNames()
 *创建测试类
 *难点指导：
 *创建无返回值的带参方法
 */
public class CustomerBiz {
    String name;//客户姓名
    String id []= new String[4];
    int i =0;
    public void addName(String showname) {
        if (i <4) {
            id[i]=showname;
            i++;
        }
    }
    public void Array() {
        System.out.println(Arrays.toString(id));
    }
}
