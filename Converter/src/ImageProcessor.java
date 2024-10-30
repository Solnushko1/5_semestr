import java.awt.image.BufferedImage;

public interface ImageProcessor {
    void readImage(String filePath);
    void writeImage(String filePath);
    void setImage(BufferedImage image);
}
