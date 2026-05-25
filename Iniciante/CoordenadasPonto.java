package Iniciante;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class CoordenadasPonto {
    public static void main(String[] args) throws IOException {
        // Configura o Scanner para ler o ponto decimal (.) corretamente
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Declaração e leitura das variáveis x e y
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        // Estrutura condicional para determinar a posição do ponto
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        }

        sc.close();
    }
}
