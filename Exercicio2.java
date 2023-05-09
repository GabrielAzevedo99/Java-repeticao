/*Implemente um algoritmo que leia um número e realize a soma dos números entre zero e o número lido.

OBS::utilize um acumulador para a soma e o contador para a quantidade de repetições do comando. */

package ExercicioRepeticaoJava;

import java.util.Scanner;
import java.util.concurrent.atomic.LongAccumulator;

public class Exercicio2 {
    
      public static void main (String[]args) {
          
          LongAccumulator num = new LongAccumulator(Long::sum, 0L);
    
    Scanner texto = new Scanner(System.in);
 
    System.out.print("Digite um numero ");
    int n = texto.nextInt();
    
    int contador = 0;
    
    for (int i = n; i >= 0; i--) {
     num.accumulate(i);
     contador++;
     
     }
    
    long soma = num.get();
    
    System.out.println("a soma dos sumeros entre 0 e 10 deu "+ soma);
    System.out.println("Quantidade de repetições: " + contador);
    
      
   } 
}
