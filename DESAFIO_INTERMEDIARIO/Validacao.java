/*Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma 
determinada string é válida.*/ 

package DESAFIO_INTERMEDIARIO;

import java.util.Scanner;

public class Validacao {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os símbolos para validação: ");

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);

        scanner.close();
    }

    public static boolean ehValido (String s) {
        if (s.equals("[]")) {
            return true;
        } else if (s.equals("()")) {
            return true;
        } else if (s.equals("{}")) {
            return true;
        } else {
            return false;
        }
    }
}
