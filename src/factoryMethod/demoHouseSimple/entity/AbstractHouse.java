package factoryMethod.demoHouseSimple.entity;

/**
 * 房子抽象类
 */
public abstract class AbstractHouse {
    /**
     * 创建房子
     *
     * @param locationX 横向坐标
     * @param locationY 纵向坐标
     * @param angle：角度
     */
    public abstract void show(double locationX, double locationY, double angle);
}
