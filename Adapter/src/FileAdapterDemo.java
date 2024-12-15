public class FileAdapterDemo {
    public static void main(String[] args) {
        FileProcessor csvProcessor = new CSVProcessor();
        csvProcessor.readFile("data.csv");
        csvProcessor.writeFile("data.csv", "name,age\nАлиса,21\nМиша,25");

        FileProcessor jsonProcessor = new JSONAdapter();
        jsonProcessor.readFile("data.json");
        jsonProcessor.writeFile("data.json", "{\"name\": \"Алиса\", \"age\": 21}");

        FileProcessor xmlProcessor = new XMLAdapter();
        xmlProcessor.readFile("data.xml");
        xmlProcessor.writeFile("data.xml", "<person><name>Алиса</name><age>21</age></person>");
    }
}