package OOP_Home;

/**
 * Created by Administrator on 2017/3/29.
 */
public class Students {
    //属性
    String name;//姓名
    char sex; //性别
    double height;//身高
    int age;//年龄
    int grade;//年级

    //行为
    public void show() {
        System.out.println("姓名:" + name+"\n"+"性别:"+sex+"\n"+"身高:"+height+"\n"+"年龄:"+age+"\n"+"年级:"+grade);
    }

    public static void main(String[] args) {
        Students zhanghao =new Students();//创建学生对象
        //引用的类型
        zhanghao.name="张浩";
        zhanghao.sex='男';
        zhanghao.height=172;
        zhanghao.age=20;
        zhanghao.grade=1;
        zhanghao.show();

    }

}
