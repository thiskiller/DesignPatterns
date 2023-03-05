package factoryMethod.demoModelAbstract.factory;

import factoryMethod.demoModelAbstract.entity.AbstractVehicle;
import factoryMethod.demoModelAbstract.entity.JeepVehicle;
import factoryMethod.demoModelAbstract.entity.MotorcycleVehicle;

/**
 * 交通工具的加工工厂
 */
public class VehicleFactory extends AbstractModelFactory {

    @Override
    public AbstractVehicle createModel(String modelName) {
        switch (modelName) {
            case "吉普车": return new JeepVehicle();
            case "摩托车": return new MotorcycleVehicle();
        }
        return null;
    }

    /**
     * 常见携带速度的交通工具
     */
    public AbstractVehicle createModelWithSpeed(String modelName, long speed) {
        AbstractVehicle vehicle = createModel(modelName);
        if(vehicle != null) {
            vehicle.speed = speed;
        }
        return vehicle;
    }
}
