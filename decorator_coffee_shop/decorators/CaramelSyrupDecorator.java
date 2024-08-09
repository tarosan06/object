// decorators/CaramelSyrupDecorator.java
package decorators;

import coffee.Coffee;
import coffee.CoffeeDecorator;

public class CaramelSyrupDecorator extends CoffeeDecorator {
    public CaramelSyrupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", キャラメルシロップ";
    }

    @Override
    public double cost() {
        return super.cost() + 1.2; // キャラメルシロップの追加価格
    }
}