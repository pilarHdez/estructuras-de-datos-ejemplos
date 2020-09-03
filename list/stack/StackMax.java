import java.util.Stack;

public class StackMax{ 
  
static class StackWithMax  
{  
    // Pila principal
    static Stack<Integer> mainStack = new Stack<Integer> ();  
  
    // Pila para mantener el máximo
    static Stack<Integer> trackStack = new Stack<Integer> ();  
  
static void push(int x)  
    {  
        mainStack.push(x);  
        if (mainStack.size() == 1)  
        {  
            trackStack.push(x);  
            return;  
        }  
        
        /*
         * Si el elemento actual es mayor que
         * el tope del elemento del stach principa, push 
         * al elemento actual a la pila auxiliar 
         * en otro caso hacer push al elemento del tope 
         * de la pila auxiliar de nuevo
         */
        if (x > trackStack.peek())  
            trackStack.push(x);  
        else
            trackStack.push(trackStack.peek());  
    }  
  
    static int getMax()  
    {  
        return trackStack.peek();  
    }  
  
    static void pop()  
    {  
        mainStack.pop();  
        trackStack.pop();  
    }  
};  
  
// Driver program to test above functions  
public static void main(String[] args)  {  
        StackWithMax s = new StackWithMax();  
        s.push(20);  
        System.out.println(s.getMax());  
        s.push(10);  
        System.out.println(s.getMax());  
        s.push(50);  
        System.out.println(s.getMax());  
    } 
}  