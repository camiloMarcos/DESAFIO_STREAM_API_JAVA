//  Desafio 7 - Encontrar o segundo número maior da lista:
//  Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer segundoMaior = numeros.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
 //     .orElseThrow(() -> new NoSuchElementException("não existe segundo maior numero."));
        .orElse(null); // nesse, caso não exista ele retorna null.
        
        System.out.println("O segundo maior número é: " + segundoMaior);
    }
}











// COMENTÁRIOS:

/*  .distinct() é um método utilizado na API de Streams do Java para remover elementos duplicados de
    um stream. Ele retorna um novo stream com elementos únicos, removendo quaisquer duplicatas. Ele utiliza o método equals() dos objetos para determinar se dois elementos são iguais.
    A ordem dos elementos no stream resultante é a mesma da ordem original, exceto pelos elementos duplicados que são removidos. É uma ferramenta poderosa na manipulação de streams em Java, especialmente útil para lidar com conjuntos de dados onde a duplicação de elementos precisa ser evitada ou tratada de forma eficiente.

    .sorted() é um método essencial na manipulação de streams em Java, permitindo que você ordene elementos de forma fácil e flexível, seja usando a ordem natural ou um comparador personalizado para atender às suas necessidades específicas de ordenação. É uma operação intermediária, o que significa que não executa a ordenação imediatamente; ELE CRIA UM NOVO STREAM QUE CONTÉM OS ELEMENTOS ORDENADOS. Ele é útil para ordenar dados antes de realizar operações subsequentes no stream.Para tipos personalizados, você pode usar comparadores personalizados para definir a ordem desejada.

    Comparator.reverseOrder() é uma ferramenta poderosa em Java para INVERTER A ORDEM NATURAL de elementos em uma coleção, sendo especialmente útil quando você precisa ordenar em ordem decrescente ou reversa da ordem padrão.

    .skip() é o método utilizado na API de Streams do Java para pular os primeiros N elementos de um stream e retornar um novo stream sem esses elementos. Permitindo que você ignore uma parte inicial de elementos de forma eficiente e flexível, especialmente útil em cenários onde você precisa lidar com grandes volumes de dados ou implementar lógicas de paginação.

    .findFirst(), método, é uma operação terminal da API de Streams em Java que retorna um Optional contendo o primeiro elemento do stream, SE EXISTIR. É um método terminal de curto-circuito, que não recebe argumentos. Retorna um Optional que pode conter o primeiro elemento do stream, se ele estiver presente, ou seja, assim que o primeiro elemento é encontrado, a operação é encerrada. Se o stream estiver vazio, findFirst() retornará um Optional vazio.

    .orElse() é útil para fornecer um valor padrão quando o valor dentro do Optional não está presente. É uma forma conveniente de lidar com casos onde você espera um valor opcional, mas deseja um valor padrão caso ele não exista. Ele permite evitar exceções NullPointerException ao manipular Optional de maneira segura.
    Em resumo, orElse() é uma parte essencial da API Optional em Java para tratamento de valores opcionais de forma robusta e segura, garantindo que seu código seja mais expressivo e menos propenso a erros relacionados a valores nulos.

    .orElseThrow() esse método faz parte da classe Optional em Java e é usado PARA OBTER O VALOR CONTIDO NO OPTIONAL, SE PRESENTE, OU LANÇAR UMA EXCEÇÃO CASO O OPTIONAL ESTEJA VAZIO.  Não recebe argumentos e retorna o valor contido no Optional se ele estiver presente. Se o Optional estiver vazio, ele lança uma exceção do tipo especificado. 
 
*/