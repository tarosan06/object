// decorators/MochaFlavorDecorator.java
package decorators;

import coffee.Coffee;
import coffee.CoffeeDecorator;

public class MochaFlavorDecorator extends CoffeeDecorator {
    public MochaFlavorDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", モカフレーバー";
    }

    @Override
    public double cost() {
        return super.cost() + 0.8; // モカフレーバーの追加価格
    }
}