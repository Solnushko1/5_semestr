import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class ImageApp {

    private BufferedImage currentImage;

    public static void main(String[] args) {
        new ImageApp().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Загрузите изображение");
            System.out.println("2. Выберите формат и птом будет сохранение");
            System.out.println("3. Выйти");
            System.out.print("Введите номер действия: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    loadImage(scanner);
                    break;
                case "2":
                    if (currentImage != null) {
                        convertAndSaveImage(scanner);
                    } else {
                        System.out.println("Сначала загрузите изображение.");
                    }
                    break;
                case "3":
                    System.out.println("Завершение работы программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ошибка.");
            }
        }
    }

    private void loadImage(Scanner scanner) {
        System.out.print("Введите путь к изображению для загрузки: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);

        try {
            currentImage = ImageIO.read(file);
            if (currentImage != null) {
                System.out.println("Изображение загружено: " + file.getAbsolutePath());
            } else {
                System.out.println("Ошибка: файл не подходит.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке изображения: " + e.getMessage());
        }
    }
    private void convertAndSaveImage(Scanner scanner) {
        System.out.println("Доступные форматы: JPG, PNG, GIF");
        System.out.print("Введите желаемый формат: ");
        String format = scanner.nextLine().toUpperCase();

        ImageFactory factory = getFactory(format);
        if (factory == null) {
            System.out.println("Неподдерживаемый формат. Выберите JPG, PNG или GIF.");
            return;
        }

        System.out.print("Введите имя для сохраненного файла (без расширения): ");
        String fileName = scanner.nextLine();

        System.out.print("Введите место для сохранения: ");
        String directoryPath = scanner.nextLine();

        String outputFilePath = directoryPath + "/" + fileName + "." + format.toLowerCase();

        ImageProcessor outputProcessor = factory.createProcessor();
        outputProcessor.setImage(currentImage);

        try {
            outputProcessor.writeImage(outputFilePath);
            System.out.println("Изображение успешно сохранено в формате " + format + ": " + outputFilePath);
        } catch (Exception e) {
            System.out.println("Ошибка при сохранении " + e.getMessage());
        }
    }


    private ImageFactory getFactory(String format) {
        switch (format) {
            case "JPG":
                return new JPGFactory();
            case "PNG":
                return new PNGFactory();
            case "GIF":
                return new GIFFactory();
            default:
                return null;
        }
    }
}
