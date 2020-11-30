import java.util.HashSet; 
  
public class Scores { 
  
    /**
    * Función para dar conteo de diferentes
    * marcas
    * @param  n número de preguntas
    * @param  p marcas de respuestas correctas
    * @param  q marcas de respuestas incorrectas
    */
    public static int scores(int n, int p, int q){ 
        // Conjunto para almacenar diferentes valores
        HashSet<Integer> hset = new HashSet<Integer>(); 
  
        // iterar por todas las posibles 
        // parejas de (p, q)
        for (int i = 0; i <= n; i++) { 
            for (int j = 0; j <= n; j++) { 
  
                int correct = i; 
                int not_solved = j; 
                int incorrect = n - i - j; 
  
                //si hay un numero positivo
                // de problemas resueltos incorrectamente
                if (incorrect >= 0) {
                    hset.add(p * correct + q * incorrect); 
                } else{
                    break; 
                }
            } 
        } 
        // regresar el tamaño del conjunto 
        // que contiene elementos diferentes 
        return hset.size(); 
    } 
  
    // Main
    public static void main(String[] args){ 
        // Número de preguntas
        int n = 4; 
  
        // Marcas de respuestas correctas
        int p = 2; 
  
        // Marcas de respuestas incorrectas 
        int q = -1; 

        System.out.println(scores(n, p, q)); 
    } 
} 