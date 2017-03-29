package OOP_Home;

/**
 * Created by ZhiChao on 2017/3/29.
 * 创建一个教师类，并在学生类中显示出来
 */
public class Teacher {
        //教师属性
        String name;
        String profession;//专业方向
        String course;//教授课程
        int time;//教龄

    public void show() {
        System.out.println("姓名："+name+"\n"+"专业方向："+profession+"\n"+"教授课程："+course+"\n"+"教龄："+time);
    }
}
