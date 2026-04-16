package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) throws IOException {        
        
        Scanner sc = new Scanner (System.in);
        
        double raio = sc.nextDouble();
        double n = 3.14159;
        
        double area = n * ( raio * raio );
        
        System.out.printf("A=%.4f%n", area);
        
        sc.close();
 
    }
    
}
