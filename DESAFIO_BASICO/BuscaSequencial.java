/*Neste desafio, dada uma estrutura de vetor A [a1, a2...an], percorra todo o vetor fazendo as comparações de A[N] = X. Caso a condição 
seja verdadeira, “X” existe na estrutura e a busca será concluída com sucesso.  */

package DESAFIO_BASICO;

import java.util.Scanner;

public class BuscaSequencial {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        System.out.println("Digite o valor da busca: ");
        int numero = leitor.nextInt();

        System.out.println(Buscar(numero, elementos));

        leitor.close();

    }

    static String Buscar(int n, int[] elementos) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == n) {
                return ("Achei " + n + " na posição " + i);
            }
        }
        return ("Número " + n + " não encontrado");
    }
}
