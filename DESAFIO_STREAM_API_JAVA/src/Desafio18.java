//  Desafio 18 - Verifique se todos os números da lista são iguais:
//  Utilizando a Stream API, verifique SE TODOS OS NÚMEROS DA LISTA SÃO IGUAIS e exiba o resultado no console.

import java.util.Arrays;
import java.util.List;

public class Desafio18 {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));

        System.out.println("TODOS OS NÚMEROS DA LISTA SÃO IGUAIS? :" + " " + todosIguais);

    /*  if (todosIguais) {
            System.out.println("TODOS OS NÚMEROS SÃO IGUAIS.");
        
        } else {
            System.out.println(" OS NÚMEROS NÃO SÃO TODOS IGUAIS.");
        }
    */

    }
}







// COMENTÁRIOS:

/*  True, Todos são iguais SIM
 *  false, todos são iguais NÃO
  
 *   .equals(), Em resumo, esse método em Java é essencial para comparar o conteúdo de objetos, o que é crucial em muitos contextos de programação, especialmente ao trabalhar com tipos de dados complexos como strings e objetos personalizados.
 * 
 * (numeros.get(0))  Para acessar um elemento específico em uma lista `numeros`, você utiliza o método get(int index). Os índices em Java começam em 0. Portanto, numeros.get(0) significa que estamos acessando o primeiro elemento da lista numeros.
 
    Podemos usar o if/else, para imprimirmos cada condição booleana.
 */