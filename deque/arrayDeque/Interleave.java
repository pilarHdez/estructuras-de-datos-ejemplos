import java.util.Queue; 
import java.util.ArrayDeque; 
  
public class Interleave { 
  
    /**
    * Función para intercalar elementos de la cola
    */
    static void interLeaveQueue(Queue<Integer>q) 
    { 
        // Revisar que se trate de un número par de elementos
        if (q.size() % 2 != 0) 
            System.out.println("Número impar de elementos." ); 
      
        // Crear una pila vacía
        ArrayDeque<Integer> s = new ArrayDeque<>(); 
        int halfSize = q.size() / 2; 
      
        // Hacer push de la primera parte de elementos de la pila
        for (int i = 0; i < halfSize; i++) 
        { 
            s.push(q.peek()); 
            q.poll(); 
        } 
      
        // Desencolar de regreso los elementos de la pila
        while (!s.isEmpty())  
        { 
            q.add(s.peek()); 
            s.pop(); 
        } 
      
        // Desencolar la primera mitad de elementos de la cola
        // y encolarlos de regreso
        for (int i = 0; i < halfSize; i++)  
        { 
            q.add(q.peek()); 
            q.poll(); 
        } 
      
        // De nuevo hacer push de la primera mitad de elementos 
        // en la pila
        for (int i = 0; i < halfSize; i++) 
        { 
            s.push(q.peek()); 
            q.poll(); 
        } 
      
        // Intercalar los elementos de la cola en la pila
        while (!s.isEmpty()) 
        { 
            q.add(s.peek()); 
            s.pop(); 
            q.add(q.peek()); 
            q.poll(); 
        } 
    } 
      
    public static void main(String[] args)  
    { 
        Queue<Integer> q = new ArrayDeque<>(); 
        q.add(11); 
        q.add(12); 
        q.add(13); 
        q.add(14); 
        q.add(15); 
        q.add(16); 
        q.add(17); 
        q.add(18); 
        q.add(19); 
        q.add(20); 
        interLeaveQueue(q); 
        int length = q.size(); 
        for (int i = 0; i < length; i++)  
        { 
            System.out.print(q.peek() + " "); 
            q.poll(); 
        } 
    } 
} 