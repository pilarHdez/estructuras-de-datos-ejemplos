import java.util.ArrayList; 
  
public class SubsequencesString { 
    /**
    * Función para imprimir elementos de ArrayList
    * @param  arrL lista a imprimir
    */
    public static void printArrayList(ArrayList<String> arrL) 
    { 
        arrL.remove(""); 
        for (int i = 0; i < arrL.size(); i++) 
            System.out.print(arrL.get(i) + " "); 
    } 
 
    /**
    * Función para obtener todas las subsecuencias de str
    * @param  str  cadena
    */
    public static ArrayList<String> getSequence(String str) 
    { 
  
        // Cadena vacía 
        if (str.length() == 0) { 
  
            // ArrayList con cadena vacía
            ArrayList<String> empty = new ArrayList<>(); 
            empty.add(""); 
            return empty; 
        } 
  
        // Primer carácter de la cadena
        char ch = str.charAt(0); 
  
        // Tomar una subcadena iniciando por
        // el segundo carácter
        String subStr = str.substring(1); 
  
        // Llamada recursiva para todas las subsecuencias
        // iniciando en el segundo carácter
        ArrayList<String> subSequences =  
                              getSequence(subStr); 
  
        // Agregar el primer carácter de str al inicio 
        // de cada carácter de las subsecuencias 
        // y después agregarlas al ArrayList
        ArrayList<String> res = new ArrayList<>(); 
        for (String val : subSequences) { 
            res.add(val); 
            res.add(ch + val); 
        } 
        return res; 
    } 
  
    // Main
    public static void main(String[] args) 
    { 
        String str = "geek"; 
        printArrayList(getSequence(str)); 
    } 
} 