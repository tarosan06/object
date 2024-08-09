// decorators/MilkDecorator.java
package decorators;

import coffee.Coffee;
import coffee.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", ミルク";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // ミルクの追加価格
    }
}
