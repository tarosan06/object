import bread.*;
import coffee.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class CoffeeShopGUI extends JFrame {
    private JComboBox<String> menuComboBox;
    private JTextArea orderTextArea;
    private JLabel totalLabel;
    private List<Object> orders;  // List of Object to store both Coffee and Bread
    private double totalCost;

    public CoffeeShopGUI() {
        setTitle("コーヒーショップ");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 注文のリストと合計金額の初期化
        orders = new ArrayList<>();
        totalCost = 0.0;

        // メニューの設定
        String[] menuItems = {
            "基本のコーヒー",
            "砂糖付きコーヒー",
            "ミルクとキャラメルシロップとバニラフレーバー付きコーヒー",
            "ホイップクリーム付きコーヒー",
            "チョコレートミルクコーヒー",
            "ヘーゼルナッツモカコーヒー",
            "シナモンアーモンドミルクコーヒー",
            "基本のパン",
            "チーズパン",
            "レタストマトパン",
            "チーズレタストマトパン",
            "クロワッサン",
            "ベーグル",
            "ジャム付きクロワッサン",
        };
        menuComboBox = new JComboBox<>(menuItems);

        // 注文ボタン
        JButton orderButton = new JButton("注文");
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int orderNumber = menuComboBox.getSelectedIndex() + 1;
                Object orderedItem = CoffeeShop.createOrderedItem(orderNumber);

                // 注文リストに追加
                if (orderedItem instanceof Coffee) {
                    Coffee coffee = (Coffee) orderedItem;
                    orders.add(coffee);
                    totalCost += coffee.cost();
                } else if (orderedItem instanceof Bread) {
                    Bread bread = (Bread) orderedItem;
                    // Wrap Bread in an anonymous Coffee class for uniform handling
                    orders.add(new Coffee() {
                        @Override
                        public String getDescription() {
                            return bread.getDescription();
                        }

                        @Override
                        public double cost() {
                            return bread.cost();
                        }
                    });
                    totalCost += bread.cost();
                }

                // 注文内容と合計金額を更新
                updateOrderDisplay();
            }
        });

        // 注文表示エリア
        orderTextArea = new JTextArea(10, 30);
        orderTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(orderTextArea);

        // 合計金額ラベル
        totalLabel = new JLabel("合計金額: $0.0");
        totalLabel.setFont(new Font("Serif", Font.BOLD, 18));  // フォントサイズを大きく設定

        // パネルにコンポーネントを追加
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(menuComboBox);
        panel.add(orderButton);
        panel.add(scrollPane);

        add(panel, BorderLayout.CENTER);
        add(totalLabel, BorderLayout.SOUTH);
    }

    private void updateOrderDisplay() {
        StringBuilder orderSummary = new StringBuilder();

        // 注文リストを表示
        for (Object item : orders) {
            if (item instanceof Coffee) {
                Coffee coffee = (Coffee) item;
                orderSummary.append(coffee.getDescription()).append(" - $").append(coffee.cost()).append("\n");
            } else if (item instanceof Bread) {
                Bread bread = (Bread) item;
                orderSummary.append(bread.getDescription()).append(" - $").append(bread.cost()).append("\n");
            }
        }

        // テキストエリアに表示
        orderTextArea.setText(orderSummary.toString());

        // 合計金額を更新
        totalLabel.setText("合計金額: $" + totalCost);
    }
}
