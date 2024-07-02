//DESAFIO 02 - Imprima SÓ OS NÚMEROS pares da lista:


import java.util.Arrays;
import java.util.List;

public class Desafio02 {
public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
        numeros.stream()
        .filter(n -> n%2 == 0)
        .sorted(Integer::compareTo)
        .forEach(System.out::println);     // System.out.println(numeros);

        
         
     
  
        


         
    }

}
