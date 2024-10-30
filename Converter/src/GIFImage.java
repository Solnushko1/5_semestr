import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GIFImage implements ImageProcessor {
    private BufferedImage image;

    @Override
    public void readImage(String filePath) {
        try {
            image = ImageIO.read(new File(filePath));
            System.out.println("Чтение GIF файла: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка чтения GIF файла: " + e.getMessage());
        }
    }

    @Override
    public void writeImage(String filePath) {
        try {
            ImageIO.write(image, "gif", new File(filePath));
            System.out.println("Сохранение GIF файла: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка сохранения GIF файла: " + e.getMessage());
        }
    }

    @Override
    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public BufferedImage getImage() {
        return image;
    }
}
