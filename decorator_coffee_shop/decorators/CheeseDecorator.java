// decorators/CheeseDecorator.java
package decorators;

import bread.Bread;
import bread.BreadDecorator;

public class CheeseDecorator extends BreadDecorator {
    public CheeseDecorator(Bread bread) {
        super(bread);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", チーズ";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // チーズの追加価格
    }
}