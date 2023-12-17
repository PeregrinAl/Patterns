package StructuralPatterns.Decorator;

public class ImageDecorator implements IImageEditor {
    protected IImageEditor imageEditor;

    public ImageDecorator(IImageEditor imageEditor) {
        this.imageEditor = imageEditor;
    }

    @Override
    public void LoadImage(String path) {
        imageEditor.LoadImage(path);
    }

    @Override
    public void RotateImage(int grad) {
        imageEditor.RotateImage(grad);
    }

    @Override
    public void CropImage(Dot x, Dot y) {
        imageEditor.CropImage(x, y);
    }

    @Override
    public void saveImage() {
        imageEditor.saveImage();
    }

    @Override
    public String getImage() {
        return imageEditor.getImage();
    }
}
