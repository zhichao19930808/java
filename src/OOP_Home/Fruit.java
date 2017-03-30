package OOP_Home;

/**
 * Created by Administrator on 2017/3/30.
 * 水果的属性和方法
 */
public class Fruit {
    String name;//名称
    public String expressed(String name) {
        System.out.print("使用"+name+"榨出：\t");
        if (name.equals("橙子")) {
            return "橙汁";
        } else if (name.equals("梨")) {
            return "梨汁";
        } else if (name.equals("葡萄")) {
            return "葡萄汁";
        } else if (name.equals("苹果")) {
            return "苹果汁";
        } else {
            return "未知果汁";
        }
    }
}
