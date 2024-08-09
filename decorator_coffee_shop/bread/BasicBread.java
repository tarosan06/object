package bread;

public class BasicBread implements Bread {

    @Override
    public String getDescription() {
        return "基本のパン";
    }

    @Override
    public double cost() {
        return 1.5; // 基本のパンの価格
    }
}
