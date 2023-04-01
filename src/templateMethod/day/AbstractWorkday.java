package templateMethod.day;

public abstract class AbstractWorkday {
    /**
     * 是否吃早餐
     * 默认吃
     */
    protected boolean isNeedEatBreakfast() {
        return true;
    }

    /**
     * 吃早餐
     */
    protected abstract void eatBreakfast();

    /**
     * 去公司
     */
    protected abstract void gotoCompany();

    /**
     * 工作一天
     */
    protected abstract void working();

    /**
     * 回家
     */
    protected abstract void goHome();

    /**
     * 开启我的一天
     */
    public final void startOneDay() {
        System.out.println("-------开启新的一天--------");
        if(isNeedEatBreakfast()) {
            eatBreakfast();
        }
        gotoCompany();
        working();
        goHome();
    }
}
