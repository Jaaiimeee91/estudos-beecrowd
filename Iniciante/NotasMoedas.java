package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class NotasMoedas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorEntrada = sc.nextDouble();
        int valor = (int) Math.round(valorEntrada * 100); // Transforma o valor de entrada em centavos

        int notas100 = valor / 10000;
        valor %= 10000;

        int notas50 = valor / 5000;
        valor %= 5000;

        int notas20 = valor / 2000;
        valor %= 2000;

        int notas10 = valor / 1000;
        valor %= 1000;

        int notas5 = valor / 500;
        valor %= 500;

        int notas2 = valor / 200;
        valor %= 200;

        int moedas1 = valor / 100;
        valor %= 100;

        int moedas50 = valor / 50;
        valor %= 50;

        int moedas25 = valor / 25;
        valor %= 25;

        int moedas10 = valor / 10;
        valor %= 10;

        int moedas5 = valor / 5;
        valor %= 5;

        int moedas01 = valor / 1;
        valor %= 1;

        System.out.print("NOTAS:\n" + notas100 + " nota(s) de R$ 100.00\n" +
                notas50 + " nota(s) de R$ 50.00\n" +
                notas20 + " nota(s) de R$ 20.00\n" +
                notas10 + " nota(s) de R$ 10.00\n" +
                notas5 + " nota(s) de R$ 5.00\n" +
                notas2 + " nota(s) de R$ 2.00\n" +
                "MOEDAS:\n" + moedas1 + " moeda(s) de R$ 1.00\n" +
                moedas50 + " moeda(s) de R$ 0.50\n" +
                moedas25 + " moeda(s) de R$ 0.25\n" +
                moedas10 + " moeda(s) de R$ 0.10\n" +
                moedas5 + " moeda(s) de R$ 0.05\n" +
                moedas01 + " moeda(s) de R$ 0.01\n");

        sc.close();

    }

}
