package lesson1_rectangles;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();
        rectangles.addNewRectangle(1.9, 2.3);
        rectangles.addNewRectangle(3.9, 1.8);
        rectangles.addNewRectangle(1.4, 2.0);
        System.out.println(rectangles.getTotalSumm());

    }

}
