package OOP_Home;

/**
 * Created by ZhiChao on 2017/3/29.
 * 编写手机类（Phone）：可以下载音乐，可以播放这些音乐，可以进行充电
 *重用电池类方法（Cell）
 *编写测试类（TestPhone）
 */
public class Phone {
    //属性
    String brant;
    public void TextPhone() {
        System.out.println("手机品牌："+brant+"\n"+"功能：\n1、可以下载音乐；\n2、可以播放这些音乐");
    }

    public static void main(String[] args) {
        Phone huawei = new Phone();
        huawei.brant ="华为";
        huawei.TextPhone();
        Cell huaweicell = new Cell();
        huaweicell.brand ="南孚";
        huaweicell.TextCell();
    }
}
