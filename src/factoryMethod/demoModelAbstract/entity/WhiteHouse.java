package factoryMethod.demoModelAbstract.entity;

/**
 * 白房子实体
 */
public class WhiteHouse extends AbstractHouse {
    @Override
    public void show(double locationX, double locationY, double angle) {
        System.out.println("白色房子展示完成。展示效果：横向坐标：" + locationX + " 纵向坐标：" + locationY + " 角度：" + angle);
    }
}
