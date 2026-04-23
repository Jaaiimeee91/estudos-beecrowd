package Iniciante;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;

        // Área do triângulo retângulo que tem A por base e C por altura.
        double TRIANGULO = ((A * C) / 2);

        // Área do círculo de raio C. (pi = 3.14159)
        double CIRCULO = ((C * C) * pi);

        // Área do trapézio que tem A e B por bases e C por altura.
        double TRAPEZIO = (((A + B) * C) / 2);

        // Área do quadrado que tem lado B.
        double QUADRADO = (B * B);

        // Área do retângulo que tem lados A e B.
        double RETANGULO = (A * B);

        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);

        sc.close();

    }

}
