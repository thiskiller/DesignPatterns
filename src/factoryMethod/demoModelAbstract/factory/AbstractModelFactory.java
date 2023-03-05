package factoryMethod.demoModelAbstract.factory;

import factoryMethod.demoModelAbstract.entity.AbstractModel;

/**
 * 模型的抽象工厂
 */
public abstract class AbstractModelFactory {
    public abstract AbstractModel createModel(String modelName);
}
