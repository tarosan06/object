// coffee/BasicCoffee.java
package coffee;

public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "基本のコーヒー";
    }

    @Override
    public double cost() {
        return 2.0; // 基本のコーヒーの価格
    }
}
