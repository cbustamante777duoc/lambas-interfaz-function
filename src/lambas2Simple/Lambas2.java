
package lambas2Simple;

import java.util.function.Function;


public class Lambas2 {

  
    public static void main(String[] args) {
        //declaracion de la funcion a hacer (convertir entero a string)
        Function<Integer,String> convertidor = x -> Integer.toString(x);
        
        //uso de convertidor
        System.out.println("uso "+convertidor.apply(33));
        System.out.println("cantidad de caracteres "+convertidor.apply(33).length());
        System.out.println("cantidad de caracteres "+convertidor.apply(1000000).length());
    }
    
}
