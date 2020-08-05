import java.util.Vector;

public class OddOccurrence { 
    /**
    * Función para obtener el entero con ocurrencias 
    * impares 
    * @param  v  vector de enteros
    */
    public static Integer getOddOccurrence(Vector<Integer> v)
    { 
        int i; 
        for (i = 0; i < v.size(); i++) { 
            int count = 0; 
            for (int j = 0; j < v.size(); j++) { 
                if (v.get(i).equals(v.get(j))) 
                    count++; 
            } 
            if (count % 2 != 0) 
                return v.get(i);
        } 
        return -1; 
    } 
      
    // Main
    public static void main(String[] args) 
    { 

        Vector<Integer> v = new Vector<Integer>();
        v.add(2);
        v.add(3);
        v.add(5);
        v.add(4);
        v.add(5);
        v.add(2);
        v.add(4);
        v.add(3);
        v.add(5);
        v.add(2);
        v.add(4);
        v.add(4);
        v.add(2);
  
        System.out.println(getOddOccurrence(v)); 
    } 
} 