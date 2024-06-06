import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
      
        List<String> frutas = new ArrayList<>();
        
      
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Fresa");
        

        System.out.println("Elementos en la lista: " + frutas);
        
     
        String frutaEnIndiceDos = frutas.get(2);
        System.out.println("Elemento en el índice 2: " + frutaEnIndiceDos);
        
      
        frutas.set(1, "Mango");
        System.out.println("Lista después de modificar el elemento en el índice 1: " + frutas);
        
        
        frutas.add(2, "Kiwi");
        System.out.println("Lista después de insertar 'Kiwi' en el índice 2: " + frutas);
        

        frutas.remove(3);
        System.out.println("Lista después de eliminar el elemento en el índice 3: " + frutas);
        
    
        int indiceDeManzana = frutas.indexOf("Manzana");
        System.out.println("Índice de 'Manzana' en la lista: " + indiceDeManzana);
        
   
        List<String> subLista = frutas.subList(1, 3);
        System.out.println("Sublista de la lista original: " + subLista);
        

        Object[] arrayFrutas = frutas.toArray();
        System.out.println("Array de frutas:");
        for (Object fruta : arrayFrutas) {
            System.out.println(fruta);
        }
    }
}
