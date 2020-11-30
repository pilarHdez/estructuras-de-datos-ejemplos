import java.util.HashMap; 

public class RomanToInt { 

    /**
    * Función para convertir números romanos
    * a entero
    * @param  s número romano
    */
    public static int romanToInt(String s) 
    { 
        HashMap<Character, Integer> map = new HashMap<>(); 
  
        // Poner los valores romanos en un mapa
        map.put('I', 1); 
        map.put('V', 5); 
        map.put('X', 10); 
        map.put('L', 50); 
        map.put('C', 100); 
        map.put('D', 500); 
        map.put('M', 1000); 
  
        // Entero para almacenar el resultado
        int result = 0; 
  
        // Iterar sobre la cadena de entrada
        for (int i = 0; i < s.length(); i++) { 
            // Verificar si el valor actual 
            // es menor al anterior
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) { 
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1)); 
            } 
            else { 
                result += map.get(s.charAt(i)); 
            } 
        } 
    
        return result; 
    }

    // Main
    public static void main(String[] args) {
        System.out.println(romanToInt("MDCCLX")); 
    } 
} 