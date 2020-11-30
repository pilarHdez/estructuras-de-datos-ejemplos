import java.util.*;
import java.lang.*;
 
public class SubArrayCheck {
 
    /**
    * Función para validar si todos los 
    * subarreglos tienen al menos un  
    * elemento único
    * a entero
    * @param  arr arreglo de números enteros
    */
    public static String check(int arr[]){
    	int n = arr.length;

        // Generar todos los subarreglos
        for (int i = 0; i < n; i++) {
 
            // Almacenar la frecuencia de 
            // los subarreglos
            Map<Integer, Integer> hm
                = new HashMap<>();
 
            int count = 0;
 
            for (int j = i; j < n; j++) {
                // Actualizar la frecuencia del 
                // subarreglo actual en el mapa
                hm.put(arr[j],hm.getOrDefault(arr[j], 0) + 1);

                if (hm.get(arr[j]) == 1){
                    count++;
                }

                if (hm.get(arr[j]) == 2){
                    count--;
                }
 
                if (count == 0){
                    return "No";
                }
            }
        }

        // Si todos los subarreglos tienen al menos 
        // un único elemento
        return "Si";
    }
 
    // Main
    public static void main(String[] args){
        int[] arr = { 1, 2, 1 };
     
        System.out.println(check(arr));
    }
}