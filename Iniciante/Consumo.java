package Iniciante;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entrada da distância percorrida
        int X = sc.nextInt();

        // Entrada do total do combustível gasto
        double Y = sc.nextDouble();

        double consumo = X / Y;

        System.out.printf("%.3f km/l%n", consumo);

        sc.close();
    }

}
