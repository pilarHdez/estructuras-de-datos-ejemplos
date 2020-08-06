import java.util.LinkedList; 
import java.util.Iterator;

public class ReverseCharacterSequence{

	/**
    * Función para imprimir reversa de una secuencia
    * de caracteres
    * @param  chars  secuencia de caracteres
    */
	public static void printReverse(LinkedList<Character> chars){

		// Iterador al final de la lista
		Iterator dIterator =  chars.descendingIterator();

		while (dIterator.hasNext()) {

			System.out.println(dIterator.next());
            
        } 

	}

	// Main 
	public static void main(String[] args){
        LinkedList<Character> chars = new LinkedList();
        
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        
        printReverse(chars);
	}

}