import java.util.Queue; 
import java.util.ArrayDeque; 
  
public class ReverseKelement { 
  
    static Queue<Integer> queue; 
  
    /**
    * Función para sacar reversa de los primeros
    * k elementos
    * @param  k  entero positivo
    */
    static void reverseQueueFirstKElements(int k) 
    { 
        if (queue.isEmpty() == true
            || k > queue.size()) 
            return; 
        if (k <= 0) 
            return; 
  
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>(); 
  
        // Hacer push de los primeros k elementos en una pila
        for (int i = 0; i < k; i++) { 
            stack.push(queue.peek()); 
            queue.remove(); 
        } 
  
        // Encolar el contenido de la pila de nuevo a la cola
        while (!stack.isEmpty()) { 
            queue.add(stack.peek()); 
            stack.pop(); 
        } 
  
        // Remover los elementos desordenados de la cola
        for (int i = 0; i < queue.size() - k; i++) { 
            queue.add(queue.peek()); 
            queue.remove(); 
        } 
    } 
  
    /**
    * Función para imprimir la cola
    */
    static void print() 
    { 
        while (!queue.isEmpty()) { 
            System.out.print(queue.peek() + " "); 
            queue.remove(); 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        queue = new ArrayDeque<Integer>(); 
        queue.add(10); 
        queue.add(20); 
        queue.add(30); 
        queue.add(40); 
        queue.add(50); 
        queue.add(60); 
        queue.add(70); 
        queue.add(80); 
        queue.add(90); 
        queue.add(100); 
  
        int k = 5; 
        reverseQueueFirstKElements(k); 
        print(); 
    } 
} 