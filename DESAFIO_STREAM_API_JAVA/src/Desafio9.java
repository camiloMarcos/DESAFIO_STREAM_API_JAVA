//  Verificar se todos os números da lista são distintos (não se repetem):
//  Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

import java.util.Arrays;
import java.util.List;

public class Desafio9 {

    public static void main(String[] args) {
        
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    boolean numerosDistintos = numeros.stream()
    .distinct()
    .count() 
    == numeros.size();

    System.out.println("EXISTEM NÚMEROS REPETIDOS? " + numerosDistintos);

   }

}

//  OBS. por conta do método .distintc(), falso = EXISTE SIM NÚMEROS REPETIDOS, True= NÃO EXISTE SIM NÚMEROS REPETIDOS.

//  COMENTÁRIOS:

/*  distinct() é um método utilizado na API de Streams do Java para REMOVER OS ELEMENTOS DUPLICADOS de
    um stream. Ele retorna um novo stream com elementos únicos, removendo quaisquer duplicatas. Ele utiliza o método equals() dos objetos para determinar se dois elementos são iguais.
    A ordem dos elementos no stream resultante é a mesma da ordem original, exceto pelos elementos duplicados que são removidos. É uma ferramenta poderosa na manipulação de streams em Java, especialmente útil para lidar com conjuntos de dados onde a duplicação de elementos precisa ser evitada ou tratada de forma eficiente. */

/*  .size() é um método em Java, usado para obter o número de elementos em uma estrutura de dados, como uma coleção, lista, conjunto, ou mapa. Retorna um inteiro (int) que representa o número de elementos na estrutura de dados. É usado com frequência para verificar a quantidade de elementos em uma coleção antes de iterar sobre eles ou para garantir que uma estrutura de dados não esteja vazia antes de realizar operações.
 */