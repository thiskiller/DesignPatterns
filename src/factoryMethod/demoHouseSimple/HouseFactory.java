package factoryMethod.demoHouseSimple;

import factoryMethod.demoHouseSimple.entity.AbstractHouse;
import factoryMethod.demoHouseSimple.entity.RedHouse;
import factoryMethod.demoHouseSimple.entity.WhiteHouse;

/**
 * 房子工厂
 */
public class HouseFactory extends RedHouse {
    /**
     * 创建房子
     */
    public AbstractHouse createHouse(String houseName) {
        switch (houseName) {
            case "白房子": return new WhiteHouse();
            case "红房子": return new RedHouse();
            default: return null;
        }
    }
}
