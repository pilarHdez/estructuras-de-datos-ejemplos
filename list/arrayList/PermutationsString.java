
public class PermutationsString { 
    /**
    * Función para determinar si un número es feo 
    * @param  s  cadaena 
    * @param res permutaciones correspondientes a s
    * @return true si s se encuentra en res
    */
    public static boolean isPresent(String s, ArrayList<String> res) 
    { 
  
        // Esta presente en el arreglo 
        for (String str : res) { 
  
            if (str.equals(s)) 
                return true; 
        } 
  
        // No se encuentra en el arreglo
        return false; 
    } 
  
    /**
    * Función para obtener todas las permutaciones de
    * una cadena
    * @param  s  cadaena 
    */
    public static ArrayList<String> distinctPermute(String str) 
    { 
  
        // Cadena vacía
        if (str.length() == 0) { 
  
            // regresar ArrayList con cadena vacía
            ArrayList<String> baseRes = new ArrayList<>(); 
            baseRes.add(""); 
            return baseRes; 
        } 
  
        // Primer carácter de la cadena
        char ch = str.charAt(0); 
  
        // Resto de la cadena después de  
        // excluir el primer carácter
        String restStr = str.substring(1); 
  
        // Llamada recursiva
        ArrayList<String> prevRes = distinctPermute(restStr); 
  
        // Almacenar la secuencia obtenida 
        ArrayList<String> res = new ArrayList<>(); 
        for (String s : prevRes) { 
            for (int i = 0; i <= s.length(); i++) { 
                String f = s.substring(0, i) + ch + s.substring(i); 
  
                // Ver si la cadena generada ya está 
                // en el ArrayList
                if (!isPresent(f, res)) 
                    // Agregar cadena genera al ArrayList
                    res.add(f); 
            } 
        } 
        return res; 
    } 
  
    // Main
    public static void main(String[] args) 
    { 
        String s = "abbb"; 
        System.out.println(distinctPermute(s)); 
    } 
} 