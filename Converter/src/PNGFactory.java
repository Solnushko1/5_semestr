public class PNGFactory implements ImageFactory {
    @Override
    public ImageProcessor createProcessor() {
        return new PNGImage();
    }
}
