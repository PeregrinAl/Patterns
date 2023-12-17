package StructuralPatterns.Decorator;

public class ImageCache extends ImageDecorator {
    public String cache = "";
    public ImageCache(IImageEditor imageEditor) {
        super(imageEditor);
    }

    @Override
    public void LoadImage(String path) {
        super.LoadImage(path);
        cache = path;
        System.out.println("Загружено в кэш");
    }
//
//    public void CleanCache() {
//        cache = "";
//        System.out.println("Кэш очищен");
//    }
}
