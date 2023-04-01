package templateMethod.day;

public class Workday20230331 extends AbstractWorkday {

    @Override
    protected void eatBreakfast() {
        System.out.println("早上吃胡辣汤和小笼包");
    }

    @Override
    protected void gotoCompany() {
        System.out.println("打车去公司");
    }

    @Override
    protected void working() {
        System.out.println("开始工作，修bug");
    }

    @Override
    protected void goHome() {
        System.out.println("打车回家");
    }
}
