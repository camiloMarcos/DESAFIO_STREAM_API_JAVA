//Desafio 3 - Verificar se todos os números da lista são positivos:

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {

       List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

            boolean numerosPositivos = numeros.stream().allMatch(n -> n >0);
            
            System.out.println( numerosPositivos);
        }
          
    }
       
     
    /*  O método allMatch da Stream API para verificar se todos os números na lista são maiores que
        zero <<.allMatch(n -> n >0)  >>.
        
        Se todos forem positivos, o resultado será true;
        
        Caso contrário, será false. */

        
    
    







/*utilizamos um filtro, mas dessa vez para ver os numeros >0 */