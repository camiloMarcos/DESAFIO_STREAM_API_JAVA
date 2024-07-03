// Desafio 5 - Calcule a média dos números maiores que 5:
// Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

import java.util.Arrays;
import java.util.List;

public class Desafio5 {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        Integer mediaMaioresCinco = (int) numeros.stream()
        .filter(n -> n>5)
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0);

        System.out.println(mediaMaioresCinco);
    }


}

// COMENTÁRIO:
/*  .average() é chamado no IntStream para calcular a média dos números. É uma operação terminal, o
    que significa que ela encerra o processamento do stream e retorna um resultado final (a média). Pode ser usado em situações como cálculos estatísticos, análise de dados, ou qualquer outra operação que envolva a média de um conjunto de valores. Este método é parte das operações de terminal fornecidas pelo Java Streams API, facilitando o cálculo de médias sem a necessidade de loops explícitos ou variáveis auxiliares.
  
    .orElse() é útil para fornecer um valor padrão quando o valor dentro do Optional não está presente.
    É uma forma conveniente de lidar com casos onde você espera um valor opcional, mas deseja um valor padrão caso ele não exista. Ele permite evitar exceções NullPointerException ao manipular Optional de maneira segura.
    Em resumo, orElse() é uma parte essencial da API Optional em Java para tratamento de valores opcionais de forma robusta e segura, garantindo que seu código seja mais expressivo e menos propenso a erros relacionados a valores nulos.

 */