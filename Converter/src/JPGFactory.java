public class JPGFactory implements ImageFactory {
    @Override
    public ImageProcessor createProcessor() {
        return new JPGImage();
    }
}
