package StructuralPatterns.Decorator;

public class ImageLeftRotate extends ImageDecorator {

    public String image;
    public ImageLeftRotate(IImageEditor imageEditor) {
        super(imageEditor);
    }

    @Override
    public void RotateImage(int grad) {
        image = String.format("Изображение повернуто на -%d градусов",grad);
        System.out.println(image);
    }

}
