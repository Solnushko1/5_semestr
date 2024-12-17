import java.awt.Color;
import java.awt.Graphics;

class Shop extends CityObject {
    @Override
    protected void render(Graphics g, int x, int y) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 60, 40);
        g.setColor(Color.WHITE);
        g.drawString("Shop", x + 10, y + 25);
    }
}
