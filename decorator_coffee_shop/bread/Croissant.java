package bread;

public class Croissant implements Bread {

    @Override
    public String getDescription() {
        return "クロワッサン";
    }

    @Override
    public double cost() {
        return 2.0; // クロワッサンの価格
    }
}
