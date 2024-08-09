package decorators;

import bread.Bread;
import bread.BreadDecorator;

public class JamDecorator extends BreadDecorator {

    public JamDecorator(Bread bread) {
        super(bread);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", ジャム";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // ジャムの追加価格
    }
}
