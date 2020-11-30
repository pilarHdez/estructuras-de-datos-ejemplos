import java.util.TreeSet;
 
public class MaxValidTriplet{
 
    /**
    * Función para Obtener el valor máximo de tripleta
    * válida
    * @param  arr  arreglo de enteros 
    */
    static int maxValidTriplet(int arr[])
    {
        int ans = -1;
        int n = arr.length;
 
        int left[] = new int[n];
        int right[] = new int[n];
 
        // Considerar el último elemento como máximo
        int max = arr[n - 1];
 
        // Iterar el arreglo desde el último elemento
        for (int i = n - 2; i >= 0; i--) {
            // Si el elemento presente es menor que el máximo
            // actualizar right[i] con el máximo previo
            if (max > arr[i]){
                right[i] = max;
            } else{
                // En otro caso almacenar -1
                right[i] = -1;
            }
 
            // Encontrar el máximo para la siguiente iteración
            if (max < arr[i]){
                max = arr[i];
            }
        }
 
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 1; i < n; i++) {
            // Insertar el elemento previo al conjunto
            set.add(arr[i - 1]);
 
            Integer result = set.lower(arr[i]);
 
            // Buscar el máximo elemento
            // si resulta ser null entonces no 
            // existe el elemento, guardar -1 en left[i]
            if (result == null){
                left[i] = -1;
            } else {
                // En otro caso almancenar el resultado
                left[i] = result;
            }
        }
 
        // Recorrer el arreglo original
        for (int i = 1; i < n - 1; i++) {
            // Validar la condición de la tripleta
            if (left[i] != -1 && right[i] != -1){
                // Encontrar el valor máximo y actualizar
                ans = Math.max(ans,
                               left[i] + arr[i] * right[i]);
            }   
        }
 
        return ans;
    }
 
    // Main
    public static void main(String args[])
    {
        int[] arr = new int[] { 7, 9, 3, 8, 11, 10 };
        System.out.println(maxValidTriplet(arr));
    }
}