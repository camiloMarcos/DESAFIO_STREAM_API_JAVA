// Desafio 6 - Verificar se a lista contém algum número maior que 10:

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numeroMaiorDez = numeros.stream().allMatch(n -> n>10);
        
            System.out.println( numeroMaiorDez);
 
    }

}



//COMENTÁRIO:
//  True: contém.
//  False: não contém.

/*  .allMatch() é uma operação importante da API de Streams em Java para VERIFICAÇÃO universal de
    elementos em um stream, oferecendo uma forma simples e eficiente de garantir que todos os elementos atendam a um critério específico definido pelo predicado fornecido. 
    
    É útil para verificar se todos os elementos em um stream satisfazem uma condição específica.
    Pode ser usado para validar propriedades de todos os elementos do stream de maneira concisa e eficiente.
    Como é uma operação de curto-circuito, pode ser mais eficiente em streams grandes, interrompendo a verificação assim que a condição não for mais atendida.
    */