package abstractFactory;

import abstractFactory.entity.AbstractColor;
import abstractFactory.entity.AbstractIcon;
import abstractFactory.entity.MoonIcon;
import abstractFactory.entity.WhiteColor;

/**
 * 白天模式
 */
public class LightModeFactory extends AbstractModeFactory {

    @Override
    public AbstractIcon createIcon() {
        return new MoonIcon();
    }

    @Override
    public AbstractColor createColor() {
        return new WhiteColor();
    }
}
