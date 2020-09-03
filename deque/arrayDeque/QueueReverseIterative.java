import java.util.Queue; 
import java.util.ArrayDeque; 
   
public class QueueReverseIterative { 
      
    static Queue<Integer> queue; 

    /**
    * Función para imprimir la cola
    */
    static void print() 
    { 
        while (!queue.isEmpty()) { 
            System.out.print( queue.peek() + ", "); 
            queue.remove(); 
        } 
    } 
  
    /**
    * Función para obtener la reversa
    */
    static void reversequeue() 
    { 
        ArrayDeque<Integer> ArrayDeque = new ArrayDeque<>(); 
        while (!queue.isEmpty()) { 
            ArrayDeque.add(queue.peek()); 
            queue.remove(); 
        } 
        while (!ArrayDeque.isEmpty()) { 
            queue.add(ArrayDeque.peek()); 
            ArrayDeque.pop(); 
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
  
        reversequeue(); 
        print(); 
    } 
} 