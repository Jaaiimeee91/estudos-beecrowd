package Iniciante;

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vendedor = sc.next();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();

        double TOTAL = (salario + (vendas * 0.15));

        System.out.printf("TOTAL = R$ %.2f%n", TOTAL);

        sc.close();
    }

}
