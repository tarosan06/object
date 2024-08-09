package bread;

public abstract class BreadDecorator implements Bread {
    protected Bread decoratedBread;

    public BreadDecorator(Bread bread) {
        this.decoratedBread = bread;
    }

    @Override
    public String getDescription() {
        return decoratedBread.getDescription();
    }

    @Override
    public double cost() {
        return decoratedBread.cost();
    }
}
