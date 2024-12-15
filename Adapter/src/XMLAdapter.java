class XMLAdapter implements FileProcessor {
    private final XMLHandler xmlHandler;

    public XMLAdapter() {
        this.xmlHandler = new XMLHandler();
    }

    @Override
    public void readFile(String filePath) {
        xmlHandler.loadXML(filePath);
    }

    @Override
    public void writeFile(String filePath, String data) {
        xmlHandler.saveXML(filePath, data);
    }
}
