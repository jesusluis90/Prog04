import java.util.Scanner;
public class ejercicio03 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String frase, palabra;
		
		
		System.out.println("Escribe una frase:");
		frase=teclado.nextLine();
		System.out.println("Escribe una palabra:");
		palabra=teclado.nextLine();
		
		if(frase.indexOf(palabra) != -1)
			System.out.println("La posicion de la palabra es: " +frase.indexOf(palabra));
		else
			System.out.println(0);
	}	
	
}