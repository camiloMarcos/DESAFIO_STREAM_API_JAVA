/*DESAFIO 01 - Mostre a lista na ordem numérica:

Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console. */

import java.util.Arrays;
import java.util.List;

public class Desafio1 {
   
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
        .sorted(Integer::compareTo)   
        .forEach(System.out::println);


    }
}
/*      COMENTÁRIOS:

sorted(): Classifica os elementos da Stream em ordem natural (se os elementos forem comparáveis)  ou de acordo com um comparador fornecido.

forEach(Consumer<T> action): Executa uma ação para cada elemento da Stream. Exemplo: stream.forEach(System.out::println)*/