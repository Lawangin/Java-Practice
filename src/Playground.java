import java.util.Arrays;
import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        int[][] a2d = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
        };
        boolean isRectangular = true;
        for (int row = 0; a2d.length == 1 || row < a2d.length - 1; row++) {
            System.out.println(a2d.length);
            System.out.println(a2d[row].length);
            if (a2d.length == 1)
            if (a2d.length != 1 && (a2d[row].length != a2d[row + 1].length)) {
                isRectangular = false;
            }
        }
        System.out.println(isRectangular);

    }

}