package Problem1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle("Red", 5.0, 2.0);
        shapes[1] = new Circle("Blue", 10.0);
        shapes[2] = new Square("Green", 4.0);
        shapes[3] = new Rectangle("White",2.5, 6.0);
        shapes[4] = new Circle("Indigo",5.0);

        printTotal(shapes);
    }

    public static void printTotal(Shape[] shapes) {
        double totalArea = 0.0;
        double totalPerimeter = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Total Area of Shapes: " + totalArea);
        System.out.println("Total Perimeter of Shapes: " + totalPerimeter);
    }
}