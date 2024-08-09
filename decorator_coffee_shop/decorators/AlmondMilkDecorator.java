// decorators/AlmondMilkDecorator.java
package decorators;

import coffee.Coffee;
import coffee.CoffeeDecorator;

public class AlmondMilkDecorator extends CoffeeDecorator {
    public AlmondMilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", アーモンドミルク";
    }

    @Override
    public double cost() {
        return super.cost() + 0.6; // アーモンドの追加価格
    }
}