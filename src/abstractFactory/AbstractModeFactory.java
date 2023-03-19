package abstractFactory;

import abstractFactory.entity.AbstractColor;
import abstractFactory.entity.AbstractIcon;

/**
 * 抽象工厂，所有的工厂都要继承自它
 */
public abstract class AbstractModeFactory {

    /**
     * 创建图标
     */
    public abstract AbstractIcon createIcon();

    /**
     * 创建背景色
     */
    public abstract AbstractColor createColor();

    // todo 公共属性可以放到这里，子工厂可重写
}
