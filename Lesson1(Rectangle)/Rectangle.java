package HW_1;

public class Rectangle {
    private final double height;
    private final double width;


    public Rectangle(double height, double width) {
        checkParameters(height, width);
        this.height = height;
        this.width = width;
    }

    public double Perimeter() {
        return 2 * (height + width);
    }

    public double Area() {
        return height * width;
    }

    private void checkParameters(double height, double width) {
        if (height < 0 || width < 0) {
            throw new IllegalArgumentException("Please, input legal arguments");
        }
    }

}
