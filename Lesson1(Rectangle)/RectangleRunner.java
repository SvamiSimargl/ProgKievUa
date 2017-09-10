package HW_1;

public class RectangleRunner {
    public static void main(String[] args) {

        Rectangles rectangles = new Rectangles();
        rectangles.addNewRectangle(1.5, 2.8);
        rectangles.addNewRectangle(1.2, 2.3);
        rectangles.addNewRectangle(6.5, 3.8);
        System.out.println(rectangles.getTotalSumm());

    }

}
