import java.util.*;
import java.io.File;
import java.util.stream.Collectors;

public class ImperativeDeclarative{
	public static void main(String[] args) {

		/*Imprimir una lista*/
		// Imperativo 
		List<String> listaCadena =Arrays.asList("uno", "dos", "tres");
		for (String s : listaCadena) {
		    System.out.println(s);
		}
		// Declarativo
		listaCadena = Arrays.asList("uno", "dos", "tres|");
		//usando una lambda
		listaCadena.forEach(s -> System.out.println(s));
		// o utilizando la referencia el método System.out
		listaCadena.forEach(System.out::println);
		

		/*Contar números pares de una lista*/
		// Imperativo 
		List<Integer> lista =Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		int contador = 0;
		for (Integer i : lista) {
		    if (i % 2 == 0) {
		        contador++;
		    }
		}
		System.out.println(contador);
		// Declarativo 
		lista = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		long contadorD = lista.stream()
		                 .filter(i -> i % 2 == 0)
		                 .count();
		System.out.println(contadorD);

		/*Elementos pares de una lista*/
		// Imperativo
		lista = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		List<Integer> listaPar = new ArrayList<>();
		for (Integer i : lista) {
		    if (i % 2 == 0) {
		        listaPar.add(i);
		    }
		}
		System.out.println(listaPar);
		// Declarativo 
		lista = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		listaPar =
		                lista.stream()
		                    .filter(i -> i % 2 == 0)
		                    .collect(Collectors.toList());
		System.out.println(listaPar);
		// o si se desea imprimir en pantalla 
		lista = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		lista.stream().filter(i -> i % 2 == 0)
		             .forEach(System.out::println);

		/*Suma de elementos pares*/		
		// Imperativo
		lista = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		int suma = 0;
		for (Integer i : lista) {
		    if (i % 2 == 0) {
		        suma += i;
		    }
		}
		System.out.println(suma);   
		// Declarativo
		lista = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		suma = lista.stream()
		              .filter(i -> i % 2 == 0)
		              .mapToInt(Integer::intValue)
		              .sum();
		System.out.println(suma); 
		// otra opción 
		lista = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		suma = lista.stream()
		              .filter(i -> i % 2 == 0)
		              .reduce(0, (i, c) -> i + c);
		System.out.println(suma);  

		/*Elementos menores que 10*/   
		// Imperativo
		lista = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		boolean b = true;
		for (Integer i : lista) {
		    if (i >= 10) {
		        b = false;
		        break;
		    }
		}
		System.out.println(b);
		// Declarativo
		lista =Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		b = lista.stream()
		                .allMatch(i -> i < 10);
		System.out.println(b);    

		/*Listado de subdirectorios en un directorio*/
		//Imperativo
		List<String> directorioNombres = new ArrayList<>();
		for (File file : new File("d:\\").listFiles()) {
		    if(file.isDirectory()){
		        directorioNombres.add(file.getName());
		    }
		}
		System.out.println(directorioNombres);
		//Declarativo
		List<String> directorioNombresD =
		    Arrays.stream(new File("d:\\")
		          .listFiles())
		          .filter(File::isDirectory)
		          .map(File::getName)
		          .collect(Collectors.toList());
		System.out.println(directorioNombresD);

	}
}