package OOP_Home;

/**
 * Created by Administrator on 2017/3/30.
 * 在main方法中调用Fruit的方法
 */
public class ExpressedJuice {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.name = "梨";
        System.out.println(apple.expressed(apple.name));


    }

}
