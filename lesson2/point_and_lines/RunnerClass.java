package lesson2.point_and_lines;

public class RunnerClass {
    public static void main(String[] args) {
        Point x = new Point(1.4, 8.9);
        Point y = new Point(4.4, 4.9);
        Point w = new Point(5.4, 1.9);
        Point z = new Point(6.4, 6.9);
        Line line1 = new Line(x, y);
        Line line2 = new Line(w, z);
        Lines lines = new Lines();
        lines.add(line1);
        lines.add(line2);
        System.out.println(lines.sumLength());
        System.out.println(lines.longestLine());



    }


}
