import java.util.TreeSet; 
  
public class ClosestSmaller{ 
    /**
    * Función para Obtener el valor más pequeño más cercano para cada 
    * elemento en un arreglo
    * @param  arr  arreglo de enteros 
    */
    public static void closestSmaller(int[] arr) 
    { 
        //Insertar los elementos del arreglo de entrada en el árbol
        TreeSet<Integer> ts = new TreeSet<Integer>(); 
        for (int i = 0; i < arr.length; i++) {
            ts.add(arr[i]); 
        }
  
        // Obtener el valor más pequeño más cercano para cada 
        // elemento en un arreglo
        for (int i = 0; i < arr.length; i++) { 
            Integer smaller = ts.lower(arr[i]); 
            if (smaller == null) {
                System.out.print(-1 + " "); 
            } else {
                System.out.print(smaller + " "); 
            }
        } 
    } 
  
    // Main
    public static void main(String[] args) 
    { 
        int[] arr = { 10, 5, 11, 6, 20, 12 }; 
        closestSmaller(arr); 
    } 
}