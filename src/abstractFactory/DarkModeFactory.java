package abstractFactory;

import abstractFactory.entity.AbstractColor;
import abstractFactory.entity.AbstractIcon;
import abstractFactory.entity.BlackColor;
import abstractFactory.entity.SunIcon;

/**
 * 黑色模式工厂
 */
public class DarkModeFactory extends AbstractModeFactory {

    @Override
    public AbstractIcon createIcon() {
        return new SunIcon();
    }

    @Override
    public AbstractColor createColor() {
        return new BlackColor();
    }
}
