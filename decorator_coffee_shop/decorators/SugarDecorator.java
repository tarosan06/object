// decorators/SugarDecorator.java
package decorators;

import coffee.Coffee;
import coffee.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", シュガー";
    }

    @Override
    public double cost() {
        return super.cost() + 0.3; // シュガーの追加価格
    }
}
