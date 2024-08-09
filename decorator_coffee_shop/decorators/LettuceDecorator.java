package decorators;

import bread.Bread;
import bread.BreadDecorator;

public class LettuceDecorator extends BreadDecorator {
    public LettuceDecorator(Bread bread) {
        super(bread);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", レタス";
    }

    @Override
    public double cost() {
        return super.cost() + 0.2; // レタスの追加価格
    }
}