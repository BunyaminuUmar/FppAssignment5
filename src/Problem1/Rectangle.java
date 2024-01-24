package Problem1;

public class Rectangle extends Shape{
    protected double width;
    protected double height;
    public Rectangle(String color, double width, double height) {
        super(color);
        this.height = height;
        this.width = width;
    }


    public double calculateArea() {
        return width*height;
    }


    public double calculatePerimeter() {
        return (2*width) + (2*height);
    }
}
