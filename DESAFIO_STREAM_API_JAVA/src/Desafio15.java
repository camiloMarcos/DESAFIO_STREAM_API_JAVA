/*  Desafio 15 - Verifique se a lista contém PELO MENOS UM número negativo:
    Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console. */

import java.util.Arrays;
import java.util.List;

public class Desafio15 {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numeroNegativo = numeros.stream().anyMatch(n->n<0);    //.anyMatch ou allMatch????????

        System.out.println(numeroNegativo);

    }

}

// COMENTÁRIOS:
/*  True - existe numero Negativo
    false - não existe.

    .anyMatch() O método que,  em Java, é usado para verificar se pelo menos um elemento de um Stream atende a uma determinada condição. Ele retorna um valor booleano (true ou false) indicando se a condição especificada foi satisfeita por algum dos elementos do Stream.

    Performance: Em certos casos, especialmente quando se trabalha com Streams de tamanho grande, escolher entre .anyMatch() e .allMatch() pode impactar a performance do seu código. .anyMatch() pode ser mais eficiente se você estiver apenas interessado em verificar SE EXISTE PELO MENOS UM elemento que satisfaça uma condição.

    Lógica de Negócios: Escolha o método adequado com base na lógica de negócios específica que você deseja implementar. Se precisar garantir que TODOS OS ELEMENTOS ATENDAM a uma condição específica, use .allMatch(). Se precisar apenas verificar SE PELO MENOS UM elemento atende à condição, use .anyMatch().
 */
