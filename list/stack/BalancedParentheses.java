import java.util.Stack; 
  
public class BalancedParentheses { 
  
    /**
    * Función para determinar si la expresión contiene 
    * paréntesis balanceados o no
    * @param  expr  expresión a validar
    * @return true expr con paréntesis balanceados
    */
    static boolean areParanthesisBalanced(String expr) 
    { 
        // Crear Stack
        Stack<Character> stack = new ArrayStack<Character>(); 
  
        // Iterar sobre la expresión
        for (int i = 0; i < expr.length(); i++) { 
            char x = expr.charAt(i); 
  
            if (x == '(' || x == '[' || x == '{') { 
                // Push del carácter actual
                stack.push(x); 
                continue; 
            } 
  
            if (stack.isEmpty()) 
                return false; 
  
            switch (x) { 
            case ')': 
                stack.pop(); 
                if (x == '{' || x == '[') 
                    return false; 
                break; 
  
            case '}': 
                stack.pop(); 
                if (x == '(' || x == '[') 
                    return false; 
                break; 
  
            case ']': 
                stack.pop(); 
                if (x == '(' || x == '{') 
                    return false; 
                break; 
            } 
        } 
  
        // Validar Stack vacío
        return (stack.isEmpty()); 
    } 
  
    // Main
    public static void main(String[] args) 
    { 
        String expr = "([{}])"; 

        System.out.println("([{}]) ¿Balanceado? " + areParanthesisBalanced(expr));
    } 
} 