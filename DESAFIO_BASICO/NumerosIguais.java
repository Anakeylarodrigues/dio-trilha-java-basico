package DESAFIO_BASICO;

import java.util.Scanner;

public class NumerosIguais {
    
    public static void main(String[] args) {
        
        int a, b;
      
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        a = input.nextInt();
        System.out.println("Digite o segundo número: ");
        b = input.nextInt();

        String resultado = a==b ? "Sao iguais!" : "Nao sao iguais!";

        System.out.println(resultado);
        
        input.close();
    }
}
