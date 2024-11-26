public class Rectangle {
    private int width, height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getArea() {
        int area = width * height;
        return area;
    }
    public int getPerimeter() {
        int perimeter = 2 * (width + height);
        return perimeter;
    }
}
