import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double h = 0.0;

        for (int i = 1; i <= n; i++) {

            h += 1.0 / i;

        }

        System.out.println(String.format("%.0f", h));

        sc.close();


    }
}