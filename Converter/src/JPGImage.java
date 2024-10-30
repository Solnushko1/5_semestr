import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JPGImage implements ImageProcessor {
    private BufferedImage image;

    @Override
    public void readImage(String filePath) {
        try {
            image = ImageIO.read(new File(filePath));
            System.out.println("Чтение JPG файла: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка чтения JPG файла: " + e.getMessage());
        }
    }

    @Override
    public void writeImage(String filePath) {
        try {
            ImageIO.write(image, "jpg", new File(filePath));
            System.out.println("Сохранение JPG файла: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка сохранения JPG файла: " + e.getMessage());
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
