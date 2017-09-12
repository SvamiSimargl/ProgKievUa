package lesson2.point_and_lines;

import java.util.ArrayList;

public class Lines {
    private ArrayList<Line> lines = new ArrayList<>();

    void add(Line line) {
        lines.add(line);
    }

    double sumLength() {
        double sum = 0;
        for (Line a : lines) {
            sum += a.getLength();
        }
        return sum;
    }

    Line longestLine() {
        Line line = null;
        double max = Double.MIN_VALUE;
        for (Line a : lines) {
            if (a.getLength() > max) {
                max = a.getLength();
                line = a;
            }
        }
        return line;
    }
}
