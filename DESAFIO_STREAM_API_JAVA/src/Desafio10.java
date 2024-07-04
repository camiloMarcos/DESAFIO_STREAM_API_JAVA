//  Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
//  Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

import java.util.Arrays;
import java.util.List;

public class Desafio10 {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> multiplos3ou5 = numeros.stream().filter(n -> n%2!=0 &&(n%3==0 || n%5==0)).toList();

        System.out.println(multiplos3ou5);


    }

}

//  COMENTÁRIOS:

/*  
    O método .filter() é uma ferramenta poderosa em Java para manipulação de coleções, permitindo filtrar elementos com base em condições específicas de forma concisa e eficiente. Ele faz parte das operações de Stream, que promovem um estilo de programação funcional e são muito úteis para processamento de dados em Java moderno.

            n-> n%2 != 0 para filtrar apenas os ímpares
            n-> n%5 == 0 para filtrar apenas os multiplos de 5
            n-> n%3 == 0 para filtrar apenas os multiplos de 3

    .toList(), Em Java, não é um método padrão diretamente associado a coleções ou Streams. No entanto, ele é comumente utilizado como parte de uma operação de coleta em um Stream para transformar os elementos filtrados (ou processados de alguma forma) de volta em uma lista.

 */ 