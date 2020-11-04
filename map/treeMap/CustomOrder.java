import java.util.TreeMap;
import java.util.Comparator;

public class CustomOrder{
	public static void main(String[] args){
		// Comparador para orden descendente
		TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
	    treeMap.put(3, "tres");
	    treeMap.put(2, "dos");
	    treeMap.put(1, "uno");
	    treeMap.put(5, "cinco");
	    treeMap.put(4, "cuatro");
		 
		// 	Imprimir en pantalla el orden de las llaves 
		System.out.println(treeMap.keySet().toString());
	}
}