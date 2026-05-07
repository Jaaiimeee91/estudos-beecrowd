package Iniciante;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        double quantidade = sc.nextDouble();
        double resultado;

        double cod1 = 4.00;
        double cod2 = 4.50;
        double cod3 = 5.00;
        double cod4 = 2.00;
        double cod5 = 1.50;

        switch (codigo) {
            case 1:
                resultado = cod1 * quantidade;
                System.out.printf("Total: R$ %.2f%n", resultado);
                break;
            case 2:
                resultado = cod2 * quantidade;
                System.out.printf("Total: R$ %.2f%n", resultado);
                break;
            case 3:
                resultado = cod3 * quantidade;
                System.out.printf("Total: R$ %.2f%n", resultado);
                break;
            case 4:
                resultado = cod4 * quantidade;
                System.out.printf("Total: R$ %.2f%n", resultado);
                break;
            case 5:
                resultado = cod5 * quantidade;
                System.out.printf("Total: R$ %.2f%n", resultado);
                break;
            default:
                break;
        }

        sc.close();
    }

}
