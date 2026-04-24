package Iniciante;

import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Calcula o maior entre A e B
        int maiorAB = (A + B + Math.abs(A - B)) / 2;

        // Calcula o maior entre o resultado anterior com o C
        int maiorDinamico = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(maiorDinamico + " eh o maior");

        sc.close();

    }

}
