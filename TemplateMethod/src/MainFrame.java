import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final CitySimulatorPanel cityPanel;

    public MainFrame() {
        setTitle("Симулятор города");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Панель для отрисовки города
        cityPanel = new CitySimulatorPanel();
        add(cityPanel, BorderLayout.CENTER);

        // Панель управления
        JPanel controlPanel = new JPanel();

        JButton addHouseButton = new JButton("Добавить дом");
        JButton addRoadButton = new JButton("Добавить дорогу");
        JButton addShopButton = new JButton("Добавить магазин");

        controlPanel.add(addHouseButton);
        controlPanel.add(addRoadButton);
        controlPanel.add(addShopButton);

        add(controlPanel, BorderLayout.SOUTH);

        addHouseButton.addActionListener(e -> cityPanel.addCityObject(new House(), getRandomX(), getRandomY()));
        addRoadButton.addActionListener(e -> cityPanel.addCityObject(new Road(), getRandomX(), getRandomY()));
        addShopButton.addActionListener(e -> cityPanel.addCityObject(new Shop(), getRandomX(), getRandomY()));
    }

    private int getRandomX() {
        return (int) (Math.random() * 700);
    }

    private int getRandomY() {
        return (int) (Math.random() * 500);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
