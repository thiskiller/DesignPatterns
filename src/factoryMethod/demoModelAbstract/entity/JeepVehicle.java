package factoryMethod.demoModelAbstract.entity;

/**
 * 吉普车实体
 */
public class JeepVehicle extends AbstractVehicle {
    @Override
    public void show(double locationX, double locationY, double angle) {
        System.out.println("以" + speed + "迈速度飞驰的吉普车展示完成。展示效果：横向坐标：" + locationX + " 纵向坐标：" + locationY + " 角度：" + angle);
    }
}
