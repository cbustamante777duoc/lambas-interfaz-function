
package lambas2Clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales2 {
    //regresa una lista de comensales
    public static List<Object> getDatosComensales 
        (List<Comensal> listaComensal, Function<Comensal, Object> func){
        
            //lista va a guardar datos personalizados de comensales
            List<Object> listaDatos = new ArrayList<>();
            //recorre la lista de comensales que recibimos
            for(Comensal comensal: listaComensal){
                listaDatos.add(func.apply(comensal));
            }
            
            return listaDatos;
        
        }
        
        public static void main(String[] args) {
            //lista de comensales
            List<Comensal> listaComensales = 
                    Arrays.asList(
                            new Comensal("jennie", 99.0, 1),
                            new Comensal("lalisa", 80.0, 2),
                            new Comensal("nayeon", 93.0, 3)
                    );
            //retorno de la lista de nombre de comensales
           List<Object> nombreComensales =  getDatosComensales(listaComensales, x->x.getNombre());
           
            System.out.println("lista de comensales");
            
            for(Object nombre : nombreComensales){
                System.out.println("el nombre es: "+nombre);
            }
            
            List<Object> montosComensales = getDatosComensales(listaComensales, x-> x.getMonto_pedido());
            for(Object monto : montosComensales){
                
                System.out.println("montos son: "+monto);
            }
            
    }
}
