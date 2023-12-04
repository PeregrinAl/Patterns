package StructuralPatterns.Decorator;

public class ImageEditor implements IImageEditor {
    public String image;
    public String path;
    @Override
    public void LoadImage(String path) {
        this.path = path;
        this.image = "Изображение загружено";
        System.out.println(image);
    }

    @Override
    public void RotateImage(int grad) {
        this.image = String.format("Изображение повернуто на %d градусов",grad);
        System.out.println(image);
    }

    @Override
    public void CropImage(Dot x, Dot y) {
        this.image = String.format("Изображение обрезано по точкам " + x + y);
        System.out.println(image);
    }

    @Override
    public void saveImage() {
        this.image = "Изображение сохранено";
        System.out.println(image);
    }

    @Override
    public String getImage() {
        return this.image;
    }
}
