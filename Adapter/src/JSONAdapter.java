class JSONAdapter implements FileProcessor {
    private final JSONHandler jsonHandler;

    public JSONAdapter() {
        this.jsonHandler = new JSONHandler();
    }

    @Override
    public void readFile(String filePath) {
        jsonHandler.loadJSON(filePath);
    }

    @Override
    public void writeFile(String filePath, String data) {
        jsonHandler.saveJSON(filePath, data);
    }
}