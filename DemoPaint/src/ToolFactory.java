/* Используем фабричный метод для инструментов: Pancil, Brush, Eraser. Если будут добавляться
неизвестные инструменты,то мы будем использовать карандаш. */

public class ToolFactory {
    public static Tool getTool(String toolType) {
        switch (toolType.toLowerCase()) {
            case "pencil":
                return new Pencil();
            case "brush":
                return new Brush();
            case "eraser":
                return new Eraser();
            default:
                return new Pencil();
        }
    }
}
