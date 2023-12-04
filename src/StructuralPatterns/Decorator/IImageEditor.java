package StructuralPatterns.Decorator;

public interface IImageEditor {
    public class Dot {
        public float x;
        public float y;

        Dot(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return String.format("(%f; %f)", this.x, this.y);
        }
    }
    public void LoadImage(String path);
    public void RotateImage(int grad);
    public void CropImage(Dot x, Dot y);
    public void saveImage();
    public String getImage();

}
