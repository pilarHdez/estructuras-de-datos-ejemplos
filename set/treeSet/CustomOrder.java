package treeSet;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;
import java.time.LocalDate;

public class CustomOrder{
	public static void main(String[] args){
		// Ordenar por nombre
		Comparator<Estudiante> ordenNombre = Comparator.comparing(Estudiante::getNombre);
		TreeSet<Estudiante> treeSet = new TreeSet<>( ordenNombre );
         
		treeSet.add(new Estudiante(1l, "AAA", LocalDate.now()));
		treeSet.add(new Estudiante(4l, "CCC", LocalDate.now()));
		treeSet.add(new Estudiante(5l, "BBB", LocalDate.now()));
		treeSet.add(new Estudiante(2l, "FFF", LocalDate.now()));
		treeSet.add(new Estudiante(3l, "DDD", LocalDate.now()));
		treeSet.add(new Estudiante(6l, "EEE", LocalDate.now()));
		 
		// Crear un iterador para los elementos de TreeSet 
        Iterator<Estudiante> iterator = treeSet.iterator(); 

		while (iterator.hasNext()){
            System.out.println(iterator.next()); 
		}
	}
}