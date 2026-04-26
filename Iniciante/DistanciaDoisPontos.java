package Iniciante;

import java.util.Scanner;

public class DistanciaDoisPontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do primeiro ponto
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Entrada do segunto ponto
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f%n", distancia);

        sc.close();

    }

}
