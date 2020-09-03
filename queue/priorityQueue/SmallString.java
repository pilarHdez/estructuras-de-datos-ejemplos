import java.util.PriorityQueue;
import java.util.Comparator;
import java.time.LocalDate;

public class SmallString{

	public static String getNLargest(String[] arr, int n){
		// Validar n, si n es inválida regresa cadena vacía 
		if(n <= 0 || n > arr.length){
			return "";
		}

		// Ordenar por longitud de cadena
		Comparator<String> ordenLongitud = Comparator.comparing(String::length);

		PriorityQueue<String> priorityQueue = new PriorityQueue<>( ordenLongitud );

		// Agregar elementos del arreglo a la cola 
		for(int i=0; i<arr.length; i++){
			priorityQueue.add(arr[i]);
		}

		// Iterar n-veces
		String regresa = "";
		for(int i=1; i<=n; i++){
			regresa = priorityQueue.poll();
		}

		return regresa;
	}

	public static void main(String[] args){

		String[] arr = {"hola", "cuatro", "feo", "comprobar"};
		int n = 2;

		System.out.println(getNLargest(arr, n));

	}
}