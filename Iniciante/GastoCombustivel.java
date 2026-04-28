package Iniciante;

import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        double litros = (tempo * velocidade) / 12.0;

        System.out.printf("%.3f%n", litros);

        sc.close();

    }

}
