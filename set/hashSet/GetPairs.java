import java.util.HashSet;
 
public class GetPairs {
 
    /**
    * Función para determinar el número de pares
    * que cumplen i < j
    * @param  a arreglo de enteros
    */
    public static int getPairs(int a[])
    {
        HashSet<Integer> visited1 = new HashSet<Integer>();
        int n = a.length;
 
        // un[i] almacena el número de elementos únicos
        // de un[i + 1] a un[n - 1]
        int un[] = new int[n];
 
        // El último elemento no tendrá elementos únicos
        un[n - 1] = 0;
 
        // Para contar los elementos únicos
        int count = 0;
        for (int i = n - 1; i > 0; i--) {
            // Si el elemento actual ya ha sido usando
            // entonces no es es único
            if (visited1.contains(a[i])){
                un[i - 1] = count;
            } else {
                un[i - 1] = ++count;
            }
 
            // Marcar como verdadero si a[i] ya fue 
            // visitado
            visited1.add(a[i]);
        }
 
        HashSet<Integer> visited2 = new HashSet<Integer>();
 
        // Para determinar cual elemento a[i]
        // ya ha sido visitado
        int answer = 0;
        for (int i = 0; i < n - 1; i++) {
            // Si es visitado, entonces el par 
            // no es único
            if (visited2.contains(a[i])){
                continue;
            }
 
            // Calcular el total de pares únicos
            answer += un[i];
 
            // Marcar como verdadero si a[i] es visitado
            visited2.add(a[i]);
        }
        return answer;
    }
 
    // Main
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 2, 4, 2, 5, 3, 5 };        
        System.out.println(getPairs(a));
    }
}