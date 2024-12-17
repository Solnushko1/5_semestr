import java.awt.Color;
import java.awt.Graphics;

class House extends CityObject {
    @Override
    protected void render(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 50);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 50, 50);
}
