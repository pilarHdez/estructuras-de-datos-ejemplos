import java.util.Stack; 

public class ReverseString{

	/**
    * Función para obtener reversa de una
    * cadena
    * @param  str  cadena a inertir
    * @return str invertido
    */
	public static String reverse(String str){

		// Crear un Stack
		Stack<Character> stack = new Stack();

		// Cadena revertida 
		String revert = "";

		// Agregar los caracteres al Stack
		for(int i=0; i < str.length(); i++){
			stack.push(str.charAt(i)); 
		}


		// Sacar caracteres del Stack 
		for(int i=0; i < str.length(); i++){
			revert += stack.pop(); 
		}

		// Cadena invertida
		return revert;

	}
	
	// Main
	public static void main(String[] args){
	    System.out.println(reverse("Pilar Hdez"));
	}

}