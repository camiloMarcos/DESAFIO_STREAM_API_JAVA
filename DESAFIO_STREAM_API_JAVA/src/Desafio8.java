//  Desafio 8 - Somar os dígitos de todos os números da lista:
//  Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

import java.util.Arrays;
import java.util.List;

public class Desafio8 {

    public static void main(String[] args) {
        
         List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

         int somaDosNumeros = numeros.stream()
         .mapToInt(Integer::intValue)
         .sum();

         System.out.println("O resultado da soma é: " + somaDosNumeros);

    }

}


/*  COMENTÁRIOS:

.mapToInt(Integer::intValue) é o método usado para CONVERTER OBJEOS INTEGER EM VALORES INT primitivos em streams em Java, sendo uma operação comum para manipulação eficiente de dados numéricos dentro de streams. onde cada objeto Integer é mapeado para seu valor primitivo int

*/ 