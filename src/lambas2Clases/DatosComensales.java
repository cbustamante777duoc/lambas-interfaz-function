
package lambas2Clases;

import java.util.function.Function;


public class DatosComensales {
    
    //firma del metodo    
    public static Object getDatoComensal(Comensal com, 
            Function<Comensal, Object> func){
     
       return func.apply(com);
        
    }
    
    public static void main(String[] args) {
        Comensal comensal = new Comensal("Jennie", 100, 7);
        
        //uso de la firma recibe un comensal y retorna un nombre
        String nombreCompleto = (String) getDatoComensal(comensal,
                x->x.getNombre());
        
        int mesaComensal = (int)getDatoComensal(comensal, x->x.getMesa());
        
        //impresion del metodo
        System.out.println("el nombre del comensal: "+nombreCompleto);
        System.out.println("mesa:"+mesaComensal);
    }
    
}
