import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class CitySimulatorPanel extends JPanel {
    private final List<CityObjectWithPosition> cityObjects = new ArrayList<>();

    public void addCityObject(CityObject object, int x, int y) {
        cityObjects.add(new CityObjectWithPosition(object, x, y));
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);
        for (CityObjectWithPosition obj : cityObjects) {
            obj.object.draw(g, obj.x, obj.y);
        }
    }

    private static class CityObjectWithPosition {
        CityObject object;
        int x, y;

        CityObjectWithPosition(CityObject object, int x, int y) {
            this.object = object;
            this.x = x;
            this.y = y;
        }
    }
}
