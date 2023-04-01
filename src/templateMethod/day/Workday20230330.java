package templateMethod.day;

public class Workday20230330 extends AbstractWorkday {


    @Override
    protected boolean isNeedEatBreakfast() {
        return false;
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("早上吃豆浆加油条");
    }

    @Override
    protected void gotoCompany() {
        System.out.println("做地铁去公司");
    }

    @Override
    protected void working() {
        System.out.println("开始工作，开发新功能");
    }

    @Override
    protected void goHome() {
        System.out.println("打车回家");
    }
}
