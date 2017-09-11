package lesson1.blinov_ch2_vC_7;


public class Rotation {
    private int[][] matrix = new int[][]{{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};

    public void showUsualMatrix() {
        System.out.println("It's usual matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void rotationMatrix90() {
        System.out.println("It's inverted matrix by 90 degrees: ");
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");

            }
            System.out.println();
        }
    }

    public void rotationMatrix180() {
        System.out.println("It's inverted matrix by 180 degrees: ");
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void rotationMatrix270() {
        System.out.println("It's inverted matrix by 270 degrees: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
