/*  Desafio 12 - Encontre o produto de todos os números da lista:
    Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console. */

import java.util.Arrays;
import java.util.List;

public class Desafio12 {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produtoDosNumeros = numeros.stream().reduce(1,(n1,n2) -> n1*n2);

        System.out.println("O Produto Dos Números É: " + produtoDosNumeros);

    }

}


//  COMENTÁRIOS:

/*  .reduce() É O método, em Java, usado para combinar elementos de um Stream em um único valor. Ele
    permite realizar operações de redução, como soma, multiplicação, concatenação, entre outras, em todos os elementos de um Stream. 
    
    .reduce(1,(n1,n2) -> n1*n2)
    ` 1 ` é o valor inicial, também conhecido como identidade, que é usado como ponto de partida para a operação de redução.
    
*/