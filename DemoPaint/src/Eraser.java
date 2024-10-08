import java.awt.Color;
import java.awt.Graphics;

public class Eraser implements Tool {
    @Override
    public void use(Graphics g, int x, int y) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 20, 20);
    }
}
