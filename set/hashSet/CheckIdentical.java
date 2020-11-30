import java.util.HashSet; 
import java.util.Arrays;
  
public class CheckIdentical { 
  
    /**
    * Función para determinar si un arreglo contiene
    * elementos idénticos
    * @param  arr  arreglo
    */
    public static <T> void checkIdentical(T array[]) 
    { 
        // Crear un HashSet a partir de los elementos de un   
        // arregl
        HashSet<T> set = new HashSet<>(Arrays.asList(array)); 
  
        // Si el tamaño del conjunto es 1, los elementos 
        // son idénticos
        if (set.size() == 1 || set.isEmpty()) { 
            System.out.print("si"); 
        } 
        else { 
            System.out.print("no"); 
        } 
    } 
  
    // Main
    public static void main(String args[]) 
    { 
        Integer arr[] = { 2, 2, 2, 2, 2, 2 }; 
        checkIdentical(arr); 
    } 
} 