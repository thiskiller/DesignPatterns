package factoryMethod.demoModelAbstract.factory;

import factoryMethod.demoModelAbstract.entity.*;

/**
 * 房子的加工工厂
 */
public class HouseFactory extends AbstractModelFactory {
    @Override
    public AbstractHouse createModel(String modelName) {
        switch (modelName) {
            case "红房子":
                return new RedHouse();
            case "白房子":
                return new WhiteHouse();
        }
        return null;
    }
}
