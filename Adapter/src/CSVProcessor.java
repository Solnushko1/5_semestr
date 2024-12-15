class CSVProcessor implements FileProcessor {
    @Override
    public void readFile(String filePath) {
        System.out.println("Чтение данных из CSV файла: " + filePath);
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Прочитано: " + line);
            }
        } catch (java.io.IOException e) {
            System.err.println("Ошибка чтения CSV файла: " + e.getMessage());
        }
    }

    @Override
    public void writeFile(String filePath, String data) {
        System.out.println("Запись данных в CSV файл: " + filePath);
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(filePath))) {
            writer.write(data);
            System.out.println("Данные записаны в CSV файл");
        } catch (java.io.IOException e) {
            System.err.println("Ошибка записи в CSV файл: " + e.getMessage());
        }
    }
}