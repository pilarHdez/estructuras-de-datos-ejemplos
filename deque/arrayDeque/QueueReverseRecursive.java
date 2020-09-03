import java.util.Queue; 
import java.util.ArrayDeque; 
   
public class QueueReverseRecursive { 
   
    static Queue<Integer> queue; 
   
    /**
    * Función para imprimir la cola
    */
    static void print() 
    { 
        while (!queue.isEmpty())  
        { 
            System.out.print(queue.peek() + " "); 
            queue.remove(); 
        } 
    } 
   
/**
 * Función recursiva para obtener la reversa
 */
static Queue<Integer> reverseQueue(Queue<Integer> q) 
{ 
    // Caso base
    if (q.isEmpty()) 
        return q; 
  
    // Desencolar item actual (de enfrente)   
    int data = q.peek(); 
    q.remove(); 
  
    // Llamada recursiva   
    q = reverseQueue(q); 
  
    q.add(data); 
          
    return q; 
} 
   
public static void main(String args[]) { 
    queue = new ArrayDeque<Integer>(); 
    queue.add(56); 
    queue.add(27); 
    queue.add(30); 
    queue.add(45); 
    queue.add(85); 
    queue.add(92); 
    queue.add(58); 
    queue.add(80); 
    queue.add(90); 
    queue.add(100); 
    queue = reverseQueue(queue); 
    print(); 
} 
} 