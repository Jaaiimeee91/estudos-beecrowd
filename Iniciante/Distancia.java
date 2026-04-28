package Iniciante;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada da distancia a ser calculada
        int distancia = sc.nextInt();

        // Regra de três: 1km -> 2min | distancia -> tempo.
        // Portanto, tempo = distancia * 2.
        int tempo = 2 * distancia;

        System.out.println(tempo + " minutos");

        sc.close();
    }

}
