import java.util.ArrayList; 
import java.util.Collections; 
  
public class UglyNumbers { 
    /**
    * Función para determinar si un número es feo 
    * @param  n  entero positivo
    * @return true número feo
    */
    public static boolean isUgly(int n) 
    {
        // Mientras sea divisible entre 2 continuar dividiendo  
        while (n % 2 == 0) 
            n = n / 2; 
  
        // Mientras sea divisible entre 3 continuar dividiendo
        while (n % 3 == 0) 
            n = n / 3; 
  
        // Mientras sea divisible entre 5 continuar dividiendo
        while (n % 5 == 0) 
            n = n / 5; 
  
        // Por definición es número feo
        if (n == 1) 
            return true; 
        return false; 
    } 
  
    // Function to sort ugly numbers 
    // in their relative positions 
    /**
    * Función para ordenar números feos 
    * @param  arr[] arreglo de enteros positivos
    * Imprime solución en pantalla 
    */
    public static void sortUglyNumbers(int arr[]) 
    { 
  
        // To store the ugly numbers from the array 
        ArrayList<Integer> list = new ArrayList<>(); 
  
        int i; 
        for (i = 0; i < arr.length; i++) { 
  
            // If current element is an ugly number 
            if (isUgly(arr[i])) { 
  
                // Add it to the ArrayList 
                // and set arr[i] to -1 
                list.add(arr[i]); 
                arr[i] = -1; 
            } 
        } 
  
        // Sort the ugly numbers 
        Collections.sort(list); 
  
        int j = 0; 
        for (i = 0; i < arr.length; i++) { 
  
            // Position of an ugly number 
            if (arr[i] == -1) 
                System.out.print(list.get(j++) + " "); 
            else
                System.out.print(arr[i] + " "); 
        } 
    } 
  
    // Main 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 2, 3, 7, 12, 10 }; 
        sortUglyNumbers(arr); 
    } 
}