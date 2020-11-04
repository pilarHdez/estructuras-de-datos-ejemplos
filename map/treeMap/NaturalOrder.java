import java.util.TreeMap;

public class NaturalOrder{
	public static void main(String[] args){
		TreeMap<Integer, String> treeMap = new TreeMap<>();
	    treeMap.put(3, "tres");
	    treeMap.put(2, "dos");
	    treeMap.put(1, "uno");
	    treeMap.put(5, "cinco");
	    treeMap.put(4, "cuatro");
		 
		// 	Imprimir en pantalla el orden de las llaves 
		System.out.println(treeMap.keySet().toString());
	}
}