class JSONHandler {
    public void loadJSON(String filePath) {
        System.out.println("Чтение данных из JSON файла: " + filePath);
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
            StringBuilder jsonData = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonData.append(line);
            }
            System.out.println("Прочитанный JSON: " + jsonData);
        } catch (java.io.IOException e) {
            System.err.println("Ошибка чтения JSON файла: " + e.getMessage());
        }
    }

    public void saveJSON(String filePath, String data) {
        System.out.println("Запись данных в JSON файл: " + filePath);
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(filePath))) {
            writer.write(data);
            System.out.println("Данные записаны в JSON файл");
        } catch (java.io.IOException e) {
            System.err.println("Ошибка записи в JSON файл: " + e.getMessage());
        }
    }
}