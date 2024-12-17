import java.awt.Color;
import java.awt.Graphics;

class Road extends CityObject {
    @Override
    protected void render(Graphics g, int x, int y) {
        g.setColor(Color.GRAY);
        g.fillRect(x, y, 100, 20);
        g.setColor(Color.YELLOW);
        g.drawLine(x, y + 10, x + 100, y + 10);
    }
}
