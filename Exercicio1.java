/*Implemente um algoritmo que leia um número e uma opção de listagem.
Com base nessa opção, escreva a sequência dos números em ordem crescente(de zero até o número)
ou decrescente(do número até zero).
1–CRESCENTE
2-DECRESCENTE */ 

package ExercicioRepeticaoJava;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
 
    System.out.print("Digite um numero ");
    int n = texto.nextInt();
    
    System.out.println("Digite 1 para crescente ");
    System.out.println("Digite 2 para decrescente ");
    int opicao = texto.nextInt();
    
    if (opicao == 1){ 
        for(int i = 0; i <= n; i++){
         System.out.println(i);   
        }
    }
    if (opicao == 2){
      for(int i = n; i >= 0; i--){
         System.out.println(i);
    }
    
}
    
}
}

