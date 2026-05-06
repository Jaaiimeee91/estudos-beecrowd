package Iniciante;

import java.util.Scanner;

public class FormulaBhaskara {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double delta = ((B * B) - 4 * A * C);

        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);
        }

        sc.close();

    }

}
