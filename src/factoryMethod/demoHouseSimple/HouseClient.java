package factoryMethod.demoHouseSimple;

import factoryMethod.demoHouseSimple.entity.AbstractHouse;

public class HouseClient {
    public static void main(String[] args) {
        try {
            AbstractHouse whiteHouse = new HouseFactory().createHouse("白房子");
            whiteHouse.show(32, 60, 1);
            System.out.println("-------------------------------");
            AbstractHouse redHouse = new HouseFactory().createHouse("红房子");
            redHouse.show(122, 545, 35);
        } catch (Exception e) {
            System.out.println("房子没找到");
        }
    }
}
