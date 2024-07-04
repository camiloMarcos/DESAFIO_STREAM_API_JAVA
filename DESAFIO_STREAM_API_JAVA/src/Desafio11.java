/*  Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
    Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console. */


import java.util.Arrays;
import java.util.List;

public class Desafio11 {

        public static void main(String[] args) {
            
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

            int quadradoDosNumeros = numeros.stream()
            .mapToInt(n -> n * n).
            sum();

            System.out.println("O Resultado Da Soma Dos Quadrados É: " + quadradoDosNumeros);
        }

}


//  COMENTÁRIOS:

/*  .mapToInt(Integer::intValue) é o método usado para CONVERTER OBJEOS INTEGER EM VALORES INT
    primitivos em streams em Java, sendo uma operação comum para manipulação eficiente de dados numéricos dentro de streams. onde cada objeto Integer é mapeado para seu valor primitivo int 
    
    
    */
