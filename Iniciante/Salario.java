package Iniciante;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ID = sc.nextInt();
        int horas = sc.nextInt();
        double salario_hora = sc.nextDouble();

        double SALARY = horas * salario_hora;

        System.out.println("NUMBER = " + ID);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);

        sc.close();
    }
    
}
