// decorators/ChocolateSyrupDecorator.java
package decorators;

import coffee.Coffee;
import coffee.CoffeeDecorator;

public class ChocolateSyrupDecorator extends CoffeeDecorator {
    public ChocolateSyrupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", チョコレートシロップ";
    }

    @Override
    public double cost() {
        return super.cost() + 1.3; // チョコレートシロップの追加価格
    }
}