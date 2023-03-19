package abstractFactory.entity;

/**
 * 抽象图标
 */
public abstract class AbstractIcon {

    /**
     * 获取子类的图标名
     */
    public abstract String getIconName();

    /**
     * 展示图标
     */
    public void showIcon() {
        System.out.println("展示" + getIconName() + "图标");
    }
}
