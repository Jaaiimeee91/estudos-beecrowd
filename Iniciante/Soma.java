package Iniciante;
import java.util.Scanner;

public class Soma { // No Beecrowd, a classe SEMPRE deve se chamar Main
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Lê os dois valores inteiros
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Calcula a soma
        int X = A + B;

        // Imprime o resultado no formato exato que o site pede
        // O "X" deve ser maiúsculo e deve haver um espaço antes e depois do "="
        System.out.println("X = " + X);

        sc.close();
               
    }
}