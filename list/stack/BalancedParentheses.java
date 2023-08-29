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
        Stack<Character> stack = new Stack<Character>(); 
  
        // Iterar sobre la expresión
        for (int i = 0; i < expr.length(); i++) { 
            char x = expr.charAt(i); 
  
            if (x == '(' ||  x == '[' ||  x == '{') { 
                // Push del carácter actual
                stack.push(x); 
                continue; 
            } 
  
            if (stack.isEmpty()) 
                return false; 

            char currentParenthesis;   
            switch (x) {   
                case ')':   
                currentParenthesis = (char) stack.pop();   
                if (currentParenthesis == '{' || currentParenthesis == '[')   
                    return false;   
                break;  

                case '}':   
                currentParenthesis = (char) stack.pop();   
                if (currentParenthesis == '(' || currentParenthesis == '[')   
                    return false;   
                break;   

                case ']':   
                currentParenthesis = (char) stack.pop();   
                if (currentParenthesis == '(' || currentParenthesis == '{')   
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
        // Expresión no válida
        String expr = "([{)}]"; 
        System.out.println("([{)}] ¿Balanceado? " + areParanthesisBalanced(expr));

        // Expresión válida
        expr = "[{()}]"; 
        System.out.println("[{()}] ¿Balanceado? " + areParanthesisBalanced(expr));
    } 
}
