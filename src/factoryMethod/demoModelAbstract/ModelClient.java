package factoryMethod.demoModelAbstract;

import factoryMethod.demoModelAbstract.factory.HouseFactory;
import factoryMethod.demoModelAbstract.factory.VehicleFactory;

public class ModelClient {
    public static void main(String[] args) {
        HouseFactory houseFactory = new HouseFactory();
        VehicleFactory vehicleFactory = new VehicleFactory();
        try {
            houseFactory.createModel("白房子").show(3, 2, 5);
            houseFactory.createModel("红房子").show(41, 24, 12);
            System.out.println("-------------------------------");
            vehicleFactory.createModelWithSpeed("摩托车", 233).show(233, 45, 1);
            vehicleFactory.createModelWithSpeed("吉普车", 76).show(345, 234, 32);
        } catch (Exception e) {
            System.out.println("模型未找到");
        }
    }
}
