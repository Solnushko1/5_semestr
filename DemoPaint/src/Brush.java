import java.awt.Graphics;

public class Brush implements Tool {
    @Override
    public void use(Graphics g, int x, int y) {
        g.fillOval(x, y, 10, 10);
    }
}
