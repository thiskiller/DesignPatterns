package templateMethod;

import templateMethod.day.AbstractWorkday;
import templateMethod.day.Workday20230330;
import templateMethod.day.Workday20230331;

public class Client {
    public static void main(String[] args) {
        // 周四的一天
        AbstractWorkday oneDay = new Workday20230330();
        oneDay.startOneDay();
        // 周五的一天
        oneDay = new Workday20230331();
        oneDay.startOneDay();
    }
}
