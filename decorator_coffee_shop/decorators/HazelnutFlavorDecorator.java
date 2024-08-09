// decorators/ChocolateSyrupDecorator.java
package decorators;

import coffee.Coffee;
import coffee.CoffeeDecorator;

public class HazelnutFlavorDecorator extends CoffeeDecorator {
    public HazelnutFlavorDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", ヘーゼルナッツフレーバー";
    }

    @Override
    public double cost() {
        return super.cost() + 0.7; // ヘーゼルナッツフレーバーの追加価格
    }
}