import coffee.*;
import decorators.*;
import javax.swing.*;
import bread.*;

public class CoffeeShop {

    public static Object createOrderedItem(int orderNumber) {
        switch (orderNumber) {
            case 1:
                return new BasicCoffee();
            case 2:
                return new SugarDecorator(new BasicCoffee());
            case 3:
                return new VanillaFlavorDecorator(new CaramelSyrupDecorator(new MilkDecorator(new BasicCoffee())));
            case 4:
                return new WhippedCreamDecorator(new BasicCoffee());
            case 5:
                return new ChocolateSyrupDecorator(new MilkDecorator(new BasicCoffee()));
            case 6:
                return new MochaFlavorDecorator(new HazelnutFlavorDecorator(new BasicCoffee()));
            case 7:
                return new CinnamonDecorator(new AlmondMilkDecorator(new BasicCoffee()));
            case 8:
                return new BasicBread();
            case 9:
                return new CheeseDecorator(new BasicBread());
            case 10:
                return new TomatoDecorator(new LettuceDecorator(new BasicBread()));
            case 11:
                return new CheeseDecorator(new TomatoDecorator(new LettuceDecorator(new BasicBread())));
            case 12:
                return new Croissant();
            case 13:
                return new Bagel();
            case 14:
                return new JamDecorator(new Croissant());
            default:
                JOptionPane.showMessageDialog(null, "無効な注文番号です。基本のコーヒーを提供します。");
                return new BasicCoffee();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CoffeeShopGUI().setVisible(true);
            }
        });
    }
}
