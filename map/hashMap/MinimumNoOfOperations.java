import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Collections;
 
public class MinimumNoOfOperations{
    
/**
    * Función para validar número de operaciones
    * para igual elementos de un arreglo
    * a entero
    * @param  arr arreglo de números enteros
    */
public static int MinimumNoOfOperations(int arr[])
{
  int min_ele = Integer.MAX_VALUE;
  int n = arr.length;
   
  for (int i = 0; i < n; ++i) {
    min_ele = Math.min(min_ele, arr[i]);
  }
 
  TreeMap<Integer,Integer> mp = new TreeMap<Integer, Integer>(Collections.reverseOrder());

  // Actualizar la frecuencias en el mapa                      
  for (int i = 0; i < n; ++i){
    if (arr[i] == min_ele){
      continue;
    } else{
      mp.put(arr[i],
      mp.getOrDefault(arr[i], 0) + 1);
    }
  }

  // Decrementos por iteración
  int prevVal = 0;
 
  // Conteo de decrementos
  int ans = 0;
 
  // Calcular el número de decrementos 
  for (Map.Entry<Integer,Integer> it : mp.entrySet()){
    ans += (it.getValue() + prevVal);
    prevVal += it.getValue();
  }
 
  // Regresar el mínimo de operaciones
  return ans;
}
 
  // Main
  public static void main(String args[]){
    
    int arr[] = {2, 5, 4, 3, 5, 4};
    
    System.out.println(MinimumNoOfOperations(arr));
  }
}