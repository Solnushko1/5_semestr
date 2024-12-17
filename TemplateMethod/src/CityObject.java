import java.awt.Graphics;

abstract class CityObject {
    public final void draw(Graphics g, int x, int y) {
        prepareDrawing();
        render(g, x, y);
    }

    protected void prepareDrawing() {
        System.out.println("Подготовка объекта для отрисовки...");
    }

    protected abstract void render(Graphics g, int x, int y);
}
