/* Crie um algoritmo que recebe 2 números e multiplica o num 1 pelo num 2 através de somas repetidas.
(ex: 2 e 3 = 2 + 2 + 2). */

package ExercicioRepeticaoJava;

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
 
    System.out.print("Digite um numero ");
    int n1 = texto.nextInt();
    
    System.out.print("Digite outro numero ");
    int n2 = texto.nextInt();
    
    int soma = 0;
    
    for (int i = n2; i >= 1; i--){
        
        soma += n1;
    }
    
    System.out.println("result "+ soma);
    
}
}

