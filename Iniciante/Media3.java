package Iniciante;

import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        float nota4 = sc.nextFloat();
        float notaFinal;

        float media = ((nota1 * 2f) + (nota2 * 3f) + (nota3 * 4f) + (nota4 * 1f)) / (2f + 3f + 4f + 1f);
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            float nota5 = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", nota5);

            notaFinal = (nota5 + media) / 2f;

            if (notaFinal >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", notaFinal);

        }

    }

}
