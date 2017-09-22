package lesson1.rectangles;

import java.util.ArrayList;

public class Rectangles {


    private ArrayList<Rectangle> rectangles = new ArrayList<>();


    public ArrayList<Rectangle> getRectangles() {
        return rectangles;
    }


    public void addNewRectangle(double height, double width) {
        rectangles.add(new Rectangle(height, width));

    }

    public double getTotalSumm() {
        double totalSumm = 0;
        for (int i = 0; i < rectangles.size(); i++) {
            totalSumm += rectangles.get(i).area();

        }
        return totalSumm;

    }


}
