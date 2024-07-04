//  Desafio 14 - Encontre o maior número primo da lista:
//  Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        Optional<Integer> maiorPrimo = numeros.stream()
        .filter(n -> isPrime(n))
        .max(Integer::compareTo);


        if(maiorPrimo.isPresent()){
        System.out.println("O Maior Número Primo Da Lista É: " + maiorPrimo);
        }else{
        System.out.println("Número Primo Inexistente Na Lista.");
        }

        
    }

}


// COMENTÁRIOS: REFAZER

