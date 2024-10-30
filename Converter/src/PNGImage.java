import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PNGImage implements ImageProcessor {
    private BufferedImage image;

    @Override
    public void readImage(String filePath) {
        try {
            image = ImageIO.read(new File(filePath));
            System.out.println("Чтение PNG файла: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка чтения PNG файла: " + e.getMessage());
        }
    }

    @Override
    public void writeImage(String filePath) {
        try {
            ImageIO.write(image, "png", new File(filePath));
            System.out.println("Сохранение PNG файла: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка сохранения PNG файла: " + e.getMessage());
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
