import java.util.Map; 
import java.util.Map.Entry; 
import java.util.TreeMap; 
import java.util.ArrayList;
  
public class CountFrequencies {

    /**
    * Función para obtener el conteneo de frecuencias
    * de cadenas en una lista
    * válida
    * @param  list  lista de cadenas
    */ 
    public static void countFrequencies(ArrayList<String> list){ 
  
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>(); 
        for (String t : list) { 
            Integer c = tmap.get(t); 
            tmap.put(t, (c == null) ? 1 : c + 1); 
        } 
  
        for (Map.Entry m : tmap.entrySet()){
            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue()); 
        } 
    } 
  
    // Main
    public static void main(String[] args){ 
        ArrayList<String> list = new ArrayList<String>(); 
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        countFrequencies(list); 
    } 
} 