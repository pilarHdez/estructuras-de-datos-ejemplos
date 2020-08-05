import java.util.ArrayList; 
  
public class PhoneDigitsWords { 
  
    // Arreglo con letras por dígito
    public static final String codes[] 
        = { " ", "abc", "def", 
            "ghi", "jkl", "mno", 
            "pqr", "stu", "vwx", 
            "yz" };   
    /**
    * Función para dar todas las palabras generadas 
    * por lo dígitos telefónicos 
    * @param  str  cadena de dígitos
    */
    public static ArrayList<String> printKeyWords(String str) 
    { 
  
        // Cadena vacía
        if (str.length() == 0) { 
            ArrayList<String> baseRes = new ArrayList<>(); 
            baseRes.add(""); 
 
            // ArrayList con cadena vacía
            return baseRes; 
        } 
  
        // Primer carácter de la cadena
        char ch = str.charAt(0); 
  
        // Resto de carácteres de la cadena
        String restStr = str.substring(1); 
  
        ArrayList<String> prevRes = printKeyWords(restStr); 
        ArrayList<String> res = new ArrayList<>(); 
  
        String code = codes[ch - '0']; 
  
        for (String val : prevRes) { 
  
            for (int i = 0; i < code.length(); i++) { 
                res.add(code.charAt(i) + val); 
            } 
        } 
        return res; 
    } 
  
    // Main
    public static void main(String[] args) 
    { 
        String str = "23"; 
  
        System.out.println(printKeyWords(str)); 
    } 
} 