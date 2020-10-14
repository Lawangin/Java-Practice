import java.util.Scanner;

public class CentralCity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of cities: ");
        int citiesCount = input.nextInt();

        double[][] coordinates = new double[citiesCount][2];
        System.out.println("Enter the coordinates of the cities:");
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                coordinates[i][j] = input.nextDouble();
            }
        }

        double[][] distCities = distanceOfCities(coordinates);
        double[] centralCityInfo = centralCity(distCities);

        System.out.println("The central city is at (" + coordinates[(int) centralCityInfo[0]][0] + ", " + coordinates[(int) centralCityInfo[0]][1] + ")");
        System.out.printf("The total distance to all other cities is %.2f\n", centralCityInfo[1]);

    }

    // distance = sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}
    public static double distance(double[] a, double[] b) {
        return Math.sqrt(Math.pow((a[0] - b[0]), 2) + Math.pow((a[1] - b[1]), 2));
    }

    public static double[][] distanceOfCities(double[][] a) {
        double[][] distanceList = new double[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            // get list of distance from each element vs the rest of the elements
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    distanceList[i][j] = 0;
                } else {
                    distanceList[i][j] = distance(a[i], a[j]);
                }
            }

        }

        return distanceList;
    }

    public static double[] centralCity(double[][] a) {
        double[] avgList = new double[a.length];
        int coordinatesIndex = 0;
        double[] result = new double[2];
        double[] sumList = new double[a.length];

        for (int k = 0; k < a.length; k++) {
            double sum = 0;
            for(int l = 0; l < a[0].length; l++) {
                sum += a[k][l];
            }
            sumList[k] = sum;
            avgList[k] = sum / a.length;
        }

        double lowestDistance = avgList[0];

        for (int i = 1; i < avgList.length; i++) {
            if (avgList[i] < lowestDistance) {
                lowestDistance = avgList[i];
                coordinatesIndex = i;
            }
        }

        result[0] = coordinatesIndex;
        result[1] = sumList[coordinatesIndex];
        return result;
    }
}
