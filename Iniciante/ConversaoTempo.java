package Iniciante;

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int horas = N / 3600;
        N %= 3600;

        int minutos = N / 60;
        N %= 60;

        int segundos = N;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();

    }

}
