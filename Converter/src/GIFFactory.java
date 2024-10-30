public class GIFFactory implements ImageFactory {
    @Override
    public ImageProcessor createProcessor() {
        return new GIFImage();
    }
}
