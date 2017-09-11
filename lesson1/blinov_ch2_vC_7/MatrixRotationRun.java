package lesson1.blinov_ch2_vC_7;
//Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
public class MatrixRotationRun {
    public static void main(String[] args) {
        Rotation matrix = new Rotation();

        matrix.showUsualMatrix();
        matrix.rotationMatrix90();
        matrix.rotationMatrix180();
        matrix.rotationMatrix270();

    }



}
