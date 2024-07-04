//  Desafio 16 - Agrupe os números em pares e ímpares:
/*  Utilize a Stream API para agrupar os números em DUAS LISTAS separadas, uma contendo os 
    números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console. */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio16 {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream(). filter(n -> n%2==0).toList();

        List<Integer> numerosImpares = numeros.stream().filter(n -> n%2==1).collect(Collectors.toList());

        System.out.println("Lista Contendo Números Pares: " + numerosPares);
        System.out.println("Lista Contendo Números Impares: " + numerosImpares);


    }
}

// COMENTÁRIOS:

/*  .toList() ou .collect(Collectors.toList()), QUAL USAR?????????????????????????
    
    Tanto o .toList(), quanto o .collect(Collectors.toList()), voltaram o mesmo resultado. Numa breve pesquisa verifiquei QUE: Ambos os métodos, .collect(Collectors.toList()) e .toList(), têm o mesmo objetivo de coletar elementos de um Stream em uma List. A escolha entre eles depende da versão do Java que você está utilizando e de suas preferências quanto à legibilidade e estilo de codificação. */