// decorators/VanillaFlavorDecorator.java
package decorators;

import coffee.Coffee;
import coffee.CoffeeDecorator;

public class VanillaFlavorDecorator extends CoffeeDecorator {
    public VanillaFlavorDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", バニラフレーバー";
    }

    @Override
    public double cost() {
        return super.cost() + 0.7; // バニラフレーバーの追加価格
    }
}
