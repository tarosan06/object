// decorators/CinnamonDecorator.java
package decorators;

import coffee.Coffee;
import coffee.CoffeeDecorator;

public class CinnamonDecorator extends CoffeeDecorator {
    public CinnamonDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", シナモン";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // シナモンの追加価格
    }
}