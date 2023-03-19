package abstractFactory.entity;

/**
 * 抽象颜色
 */
public abstract class AbstractColor {

    /**
     * 获取子类颜色
     */
    public abstract String getColorName();

    /**
     * 展示颜色
     */
    public void showColor() {
        System.out.println("当前页面底色为" + getColorName());
    }
}
