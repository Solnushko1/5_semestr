import java.awt.Graphics;

public class Pencil implements Tool {
    @Override
    public void use(Graphics g, int x, int y) {
        g.fillOval(x, y, 5, 5); //чем больше, тем лучше (больше линия становить
    }
}
