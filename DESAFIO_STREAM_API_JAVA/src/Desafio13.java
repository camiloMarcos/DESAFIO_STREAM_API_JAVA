/*  Desafio 13 - Filtrar os números que estão dentro de um intervalo:
    Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console. */

import java.util.Arrays;
import java.util.List;

public class Desafio13 {

    public static void main(String[] args) {
        

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> filtrarIntervalo = numeros.stream()
        .filter(n -> n>5 && n <10)
        .toList();
    //  .collect(Collectors.toList());

        System.out.println("Os Números Que Estão Dentro De Um Intervalo 5 E 10, São: " + filtrarIntervalo);
    }

}

// COMENTÁRIOS:

/*  O método .filter() é uma ferramenta poderosa em Java para manipulação de coleções, permitindo
    filtrar elementos com base em condições específicas de forma concisa e eficiente. Ele faz parte das operações de Stream, que promovem um estilo de programação funcional e são muito úteis para processamento de dados em Java moderno. 

    .toList() ou .collect(Collectors.toList()), QUAL USAR?
    Tanto o .toList(), quanto o .collect(Collectors.toList()), voltaram o mesmo resultado. Numa breve pesquisa verifiquei QUE: Ambos os métodos, .collect(Collectors.toList()) e .toList(), têm o mesmo objetivo de coletar elementos de um Stream em uma List. A escolha entre eles depende da versão do Java que você está utilizando e de suas preferências quanto à legibilidade e estilo de codificação.

    */


