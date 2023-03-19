package abstractFactory;

/**
 * 抽象工厂客户端
 */
public class Client {
    public static void main(String[] args) {
        // 白天模式工厂
        AbstractModeFactory factory = new DarkModeFactory();
        factory.createColor().showColor();
        factory.createIcon().showIcon();
    }
}
