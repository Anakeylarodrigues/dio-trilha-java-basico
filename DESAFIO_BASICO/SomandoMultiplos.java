package DESAFIO_BASICO;

import java.util.Scanner;

public class SomandoMultiplos {
    
    public static void main(String[] args) {
        
        int A, N;
        int soma = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        A = input.nextInt();
        System.out.println("Digite o segundo número: ");
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
          if (i % A == 0) {
            soma += i;
          }
        }
        
        System.out.println("A soma de todos os múltiplos até o limite informado é: ");
        System.out.println(soma);

        input.close();
    }
}
