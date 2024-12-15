class XMLHandler {
    public void loadXML(String filePath) {
        System.out.println("Чтение данных из XML файла: " + filePath);
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
            StringBuilder xmlData = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                xmlData.append(line);
            }
            System.out.println("Прочитанный XML: " + xmlData);
        } catch (java.io.IOException e) {
            System.err.println("Ошибка чтения XML файла: " + e.getMessage());
        }
    }

    public void saveXML(String filePath, String data) {
        System.out.println("Запись данных в XML файл: " + filePath);
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(filePath))) {
            writer.write(data);
            System.out.println("Данные записаны в XML файл");
        } catch (java.io.IOException e) {
            System.err.println("Ошибка записи в XML файл: " + e.getMessage());
        }
    }
}