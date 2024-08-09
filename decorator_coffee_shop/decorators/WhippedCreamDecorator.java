// decorators/WhippedCreamDecorator.java
package decorators;

import coffee.Coffee;
import coffee.CoffeeDecorator;

public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", ホイップクリーム";
    }

    @Override
    public double cost() {
        return super.cost() + 0.8; // ホイップクリームの追加価格
    }
}
