package factoryMethod.demoHouseSimple.entity;

import factoryMethod.demoHouseSimple.entity.AbstractHouse;

/**
 * 红色房子
 */
public class RedHouse extends AbstractHouse {
    @Override
    public void show(double locationX, double locationY, double angle) {
        System.out.println("红色房子展示完成。展示效果：横向坐标：" + locationX + " 纵向坐标：" + locationY + " 角度：" + angle);
    }
}
