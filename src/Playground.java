import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int count = 0;
//        while (n > 0) {
//            int m = input.nextInt();
//            if (n == m) {
//                count++;
//            }
//            n = m;
//        }
//        System.out.println(count);

        String x = "abcde";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(x.charAt(i));
                System.out.print(x.charAt(j));
                System.out.println();
            }
        }
    }
}