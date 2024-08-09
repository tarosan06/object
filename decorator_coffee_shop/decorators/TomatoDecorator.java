// decorators/TomatoDecorator.java
package decorators;

import bread.Bread;
import bread.BreadDecorator;

public class TomatoDecorator extends BreadDecorator {
    public TomatoDecorator(Bread bread) {
        super(bread);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", トマト";
    }

    @Override
    public double cost() {
        return super.cost() + 0.3; // トマトの追加価格
    }
}