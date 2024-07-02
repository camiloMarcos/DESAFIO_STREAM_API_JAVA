//  Desafio 4 - Remova todos os valores ímpares:

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio4 {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosParesENeutro = numeros.stream()
        .filter(n -> n%2 ==0 || n==0)
        .collect(Collectors.toList());

            System.out.println(numerosParesENeutro);

    }

}


/*  COMENTÁRIOS
    
    O desafio é: "Remova todos os valores ímpares:", porém já aprendemos como diferenciar os pares,
    logo vamos pegar apenas os números pares e caso tenha, o número 0. 
    
    .filter(n -> n%2 ==0 || n==0) - Filtra números pares e, se tiver  o zero.

    OBS. O método .removeIf() modifica a lista original. Pode não ser a melhor opção se  quisermos manter a lista original sem alterações.

    Em Java, Collectors.toList() é utilizado para coletar os elementos de um fluxo (stream) e armazená-los em uma lista.

*/