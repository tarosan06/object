package bread;

public class Bagel implements Bread {

    @Override
    public String getDescription() {
        return "ベーグル";
    }

    @Override
    public double cost() {
        return 1.5; // ベーグルの価格
    }
}
