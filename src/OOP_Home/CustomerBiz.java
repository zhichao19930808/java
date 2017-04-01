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
    //属性
    String name;//客户姓名
    String id []= new String[4];
    int i =0;
    //将信息录入数组的方法
    public String addName(String name) {
            id[i]=name;
             i++;
        for (int j=0;j<=i;j++) {
            if (id[j] == name) {
                return "上传成功";
            }
            }
            return "上传失败";
    }
    public void Array() {
        System.out.println(Arrays.toString(id));
    }
    public String rename(String oldname,String newname) {
        for (int j = 0; j<i;j++) {
            if (id[j] == oldname) {
                id[j] = newname;
            } else {
                return "查无此人";
            }

            for (int k=0;k<i;k++) {
                if (id[k] == newname) {
                    return "成功将"+"替换为";
                }
            }
        }
    }
}
