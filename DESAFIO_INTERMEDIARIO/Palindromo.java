/*Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um palíndromo, ou seja, 
se a String é igual a ela mesma invertida.  */

package DESAFIO_INTERMEDIARIO;

import java.util.Scanner;

public class Palindromo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        String palavraReversa = "";
        String[] letras = palavra.split("");

        for (int i = letras.length - 1; i >= 0; i--) {
            palavraReversa = palavraReversa + letras[i];
        }

        System.out.println(palavraReversa.equals(palavra) ? "TRUE" : "FALSE");

        sc.close();
    }
}
